package com.test.manager.impl;

import com.test.dao.UserMapper;
import com.test.manager.UserManager;
import com.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * Created by lihui on 15-11-28.
 */
@Transactional
public class UserManagerImpl implements UserManager {

    @Autowired
    UserMapper userMapper;

    public boolean addUser(User user) {
        return userMapper.insertSelective(user) == 1;
    }

    public User login(User user) {
        return userMapper.selectByUserName(user);
    }
}
