package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/index")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/business-user")
    public String showUserForm() {
        return "/business/business-user";
    }



}
