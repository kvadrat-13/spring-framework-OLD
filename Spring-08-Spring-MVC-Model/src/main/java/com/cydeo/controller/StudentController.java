package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model) {


        // model methods
        model.addAttribute("name", "Cydeo");
        model.addAttribute("lastName", "Cybertek");
        model.addAttribute("course", "MVC");
        model.addAttribute("subject", "Java Developer");
        model.addAttribute("id", "JD-05");

        return "/student/welcome";
    }


}
