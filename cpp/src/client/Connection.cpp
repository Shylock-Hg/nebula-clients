/* Copyright (c) 2019 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

#include "nebula/client/Connection.h"

#include "./ClientImpl.h"

namespace nebula {

Connection::Connection() : client_{new ClientImpl()} {}

Connection::~Connection() {
    delete client_;
}

bool Connection::open(const std::string &address, int32_t port) {
    return client_->open(address, port, 0 /*TODO(shylock) pass from config*/);
}

AuthResponse Connection::authenticate(const std::string &user, const std::string &password) {
    return client_->authenticate(user, password);
}

ExecutionResponse Connection::execute(int64_t sessionId, const std::string &stmt) {
    return client_->execute(sessionId, stmt);
}

bool Connection::isOpen() {
    // TODO(shylock)
    return false;
}

void Connection::close() {
    // TODO(shylock)
}

bool Connection::ping() {
    // TODO(shylock)
    return false;
}

void Connection::signout() {
    if (client_ != nullptr) {
        client_->signout();
    }
}

}   // namespace nebula