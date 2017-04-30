package com.rui.dao;

import com.rui.domain.User;

/**
 * @author: wangruirui .
 * @date: 2017/4/29.
 * @description: User的DAO类.
 */
public interface UserDao {

    public User selectUserById(Integer userId);
}
