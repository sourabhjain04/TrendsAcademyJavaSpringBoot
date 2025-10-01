package com.example.second.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/home")
    public String home(){
        System.out.println("This is Out for Home Page");
        return "home";
    }


    @RequestMapping("/contact")
    public String contact(){
        System.out.println("This is Out for Contact Page");
        return "contact";
    }
}
