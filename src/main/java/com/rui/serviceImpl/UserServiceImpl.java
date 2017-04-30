package com.rui.serviceImpl;

import com.rui.dao.UserDao;
import com.rui.domain.User;
import com.rui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author: wangruirui .
 * @date: 2017/4/29.
 * @description: .
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User selectUserById(Integer userId) {
        return userDao.selectUserById(userId);

    }
}
