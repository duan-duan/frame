package com.rui.service;

import com.rui.baseTest.SpringTestCase;
import com.rui.domain.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: wangruirui .
 * @date: 2017/4/30.
 * @description: .
 */
public class UserServiceTest extends SpringTestCase {

    @Autowired
    private UserService userService;

    Logger logger = Logger.getLogger(UserServiceTest.class);

    @Test
    public void selectUserByIdTest(){
        User user = userService.selectUserById(10);
        logger.debug("查找结果" + user);
    }
}
