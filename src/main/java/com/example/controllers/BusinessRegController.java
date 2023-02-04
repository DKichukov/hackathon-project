package com.example.controllers;

import com.example.entities.Business;
import com.example.entities.Student;
import com.example.repositories.BusinessRepository;
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

    @GetMapping("/create_business")
    public String createBusiness(Model model) {
        Business business = new Business();
        model.addAttribute("business", business);
        return "/business/create_business";
    }

    @PostMapping("/submit-business")
    private ModelAndView saveBusiness(Business business) {
        busRepository.save(business);
        return new ModelAndView("redirect:/index");
    }
}
