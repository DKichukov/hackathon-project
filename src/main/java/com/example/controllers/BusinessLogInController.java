package com.example.controllers;

import com.example.entities.UserBusiness;
import com.example.service.BusinessLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BusinessLogInController {

    @Autowired
    BusinessLoginService businessLoginService;

    @GetMapping("/login_business")
    public String showLogin(Model model) {
        model.addAttribute("userBusiness", new UserBusiness());
        return "business/login_business";
    }
    @PostMapping("/login-submit")
    private ModelAndView saveUser(UserBusiness userBusiness,Model model) {
            UserBusiness buss = businessLoginService.getBusinessId(userBusiness.getBusiness().getEmail(),userBusiness.getPassword());
            model.addAttribute("userBusiness1",buss);
            return new ModelAndView("redirect:/organisation/" + buss.getBusiness().getId());
    }
}

