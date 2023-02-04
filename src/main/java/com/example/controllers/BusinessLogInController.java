package com.example.controllers;

import com.example.entities.UserBusiness;
import com.example.repositories.UserBusinessRepository;
import com.example.repositories.UserStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessLogInController {
    @Autowired
    UserBusinessRepository userBusinessRepository;

    @GetMapping("/login_business")
    public String showLogin() {
        return "business/login_business";
    }
}

