package com.test.service.impl;

import com.test.manager.UserManager;
import com.test.model.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by lihui on 15-11-28.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    UserManager userManager;

    public boolean register(User user) {
        return userManager.addUser(user);
    }
}
