package com.rui.service;

import com.rui.domain.User;

/**
 * @author: wangruirui .
 * @date: 2017/4/29.
 * @description: UserService接口类.
 */
public interface UserService {

    User selectUserById(Integer userId);

}
