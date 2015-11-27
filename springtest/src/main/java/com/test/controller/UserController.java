package com.test.controller;

import com.test.model.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * Created by lihui on 15-11-28.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/goto")
    public String toAddPage(){
        return "addpage";
    }

    @RequestMapping("/register")
    public void addUser(User user, HttpServletResponse httpServletResponse) throws IOException {
        boolean result = userService.register(user);
        if (result){
            httpServletResponse.getWriter().print("success");
        } else {
            httpServletResponse.getWriter().print("failed");
        }
    }
}
