package com.example.controllers;

import com.example.entities.UserStudent;
import com.example.repositories.UserStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.GeneratedValue;

@Controller
public class StudentLogInController {
    @Autowired
    UserStudentRepository userStudentRepository;

    @GetMapping("/login_student")
    public String showLogin() {
        return "/student/login_student";
    }
}
