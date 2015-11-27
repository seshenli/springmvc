package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lihui on 15-11-27.
 *
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String test(){
        return "hello";
    }


    @RequestMapping("/hello2")
    public ModelAndView print(){
        ModelAndView modelAndView  = new ModelAndView();
        modelAndView.setViewName("hello2");
        modelAndView.addObject("name", "maodechao");
        return modelAndView;
    }
}
