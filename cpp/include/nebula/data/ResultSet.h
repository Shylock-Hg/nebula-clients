/* Copyright (c) 2020 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

#pragma once

#include <utility>
#include "common/graph/Response.h"

namespace nebula {

class ResultSet {
public:
    ResultSet(ExecutionResponse &&resp) : resp_(std::move(resp)) {
        if (resp_.data != nullptr) {
            for (std::size_t i = 0; i < resp_.data->colNames.size(); ++i) {
                colIndices_.emplace(resp_.data->colNames[i], i);
            }
        }
    }

    ErrorCode errorCode() const {
        return resp_.error_code;
    }

    const DataSet *data() const {
        return resp_.data.get();
    }

    DataSet *data() {
        return resp_.data.get();
    }

    const PlanDescription *planDescription() const {
        return resp_.plan_desc.get();
    }

    const std::vector<std::string> &keys() const {
        return data()->colNames;
    }

    const std::vector<Value> &rowValues(std::size_t index) const {
        return data()->rows[index].values;
    }

    std::vector<Value> colValues(const std::string &name) const {
        std::vector<Value> col;
        const auto colIndex = colIndices_.find(name);
        if (colIndex == colIndices_.end()) {
            return col;
        }
        for (const auto &row : data()->rows) {
            col.emplace_back(row[colIndex->second]);
        }
        return col;
    }

    using iterator = std::vector<Row>::iterator;
    using const_iterator = std::vector<Row>::const_iterator;

    iterator begin() {
        return data()->rows.begin();
    }

    const_iterator begin() const {
        return data()->rows.begin();
    }

    iterator end() {
        return data()->rows.end();
    }

    const_iterator end() const {
        return data()->rows.end();
    }

    std::vector<std::pair<std::string, Value>> fields() const {
        std::vector<std::pair<std::string, Value>> fs;
        for (const auto &row : data()->rows) {
            for (std::size_t i = 0; i < data()->colSize(); ++i) {
                fs.emplace_back(std::make_pair(data()->colNames[i], row[i]));
            }
        }
        return fs;
    }

private:
    ExecutionResponse resp_;
    std::unordered_map<std::string, std::size_t> colIndices_;
};

}   // namespace nebula
