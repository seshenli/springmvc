package com.test.service;

import com.test.model.User;

/**
 *
 * Created by lihui on 15-11-28.
 */
public interface UserService {
    boolean register(User user);
    User login(User user);
}
