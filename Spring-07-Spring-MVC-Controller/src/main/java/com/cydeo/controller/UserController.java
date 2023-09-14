package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/user")
    public String user(){

        String a = "apple";
        return "/user/userInfo.html"; // go to folder static and look over there
    }
}
