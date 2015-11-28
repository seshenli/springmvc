package com.test;

import com.test.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * Created by lihui on 15-11-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class UserTest {

    @Autowired
    UserService userService;


    @Test
    public void test(){
        System.out.println(userService);
    }
}
