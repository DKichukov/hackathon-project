package com.example.controllers;

import com.example.entities.Business;
import com.example.entities.UserBusiness;
import com.example.repositories.BusinessRepository;
import com.example.repositories.UserBusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BusinessRegController {
    @Autowired
    BusinessRepository busRepository;

    @Autowired
    UserBusinessRepository userBusinessRepository;

    @GetMapping("/create_business")
    public String createBusiness(Model model) {
        Business business = new Business();
        UserBusiness userBusiness = new UserBusiness();
        model.addAttribute("business", business);
        model.addAttribute("user",userBusiness);
        return "/business/create_business";
    }

    @PostMapping("/submit-business")
    private ModelAndView saveBusiness(Business business, UserBusiness userBusiness) {
        busRepository.save(business);
        userBusiness.setBusiness(business);
        userBusinessRepository.save(userBusiness);
        return new ModelAndView("redirect:/index");
    }
}
