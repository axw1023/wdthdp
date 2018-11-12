package com.qdjxd.wdthdp.dao;

import com.qdjxd.wdthdp.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}