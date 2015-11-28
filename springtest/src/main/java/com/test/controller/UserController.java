package com.test.controller;

import com.test.model.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
    public String addUser(User user) throws IOException {
        boolean result = userService.register(user);
        if (result){
            return "login";
        }
        return "fail";
    }

    @RequestMapping("/tologinpage")
    public String toLoginPage(){
        return "login";
    }

    @RequestMapping("/login")
    public ModelAndView login(User user){
        user = userService.login(user);
        if (user == null){
            return new ModelAndView("fail");
        } else {
            ModelAndView modelAndView = new ModelAndView("success");
            modelAndView.addObject("user" ,user);
            return modelAndView;
        }
    }
}
