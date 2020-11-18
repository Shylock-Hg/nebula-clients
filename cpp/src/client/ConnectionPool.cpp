/* Copyright (c) 2020 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

#include "nebula/client/ConnectionPool.h"

#include <folly/String.h>

#include <atomic>

namespace nebula {

ConnectionPool::~ConnectionPool() {
    close();
}

void ConnectionPool::init(const std::vector<std::string> &addresses, const Config &config) {
    for (std::size_t i = 0, j = 0, k = 0; i < config.maxConnectionPoolSize_; ++j, ++k) {
        if (k > config.maxConnectionPoolSize_ * 10) {
            // Can't get so many connections, return to avoid dead loop
            return;
        }
        if (j >= addresses.size()) {
            j = 0;
        }
        std::vector<std::string> splits;
        folly::split(':', addresses[j], splits, true);
        if (splits.size() != 2) {
            // ignore error
            continue;
        }
        Connection conn;
        if (conn.open(splits[0], folly::to<int32_t>(splits[1]))) {
            ++i;
            conns_.emplace_back(std::move(conn));
        }
        // ignore error
    }
}

void ConnectionPool::close() {
    std::lock_guard<std::mutex> l(lock_);
    for (auto &conn : conns_) {
        conn.close();
    }
}

Session ConnectionPool::getSession(const std::string &username,
                                   const std::string &password,
                                   bool retryConnect) {
    (void)retryConnect;
    Connection conn;
    {
        std::lock_guard<std::mutex> l(lock_);
        if (conns_.empty()) {
            return Session();
        }
        conn = std::move(conns_.front());
        conns_.pop_front();
    }
    auto resp = conn.authenticate(username, password);
    if (resp.error_code != ErrorCode::SUCCEEDED || resp.session_id == nullptr) {
        return Session();
    }
    return Session(*resp.session_id, std::move(conn), this);
}

void ConnectionPool::giveBack(Connection &&conn) {
    std::lock_guard<std::mutex> l(lock_);
    conns_.emplace_back(std::move(conn));
}

}   // namespace nebula