package com.example.controllers;

import com.example.entities.Business;
import com.example.repositories.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class BusinessProfileController {

    @Autowired
    BusinessRepository businessRepository;

    @GetMapping("/organisation/{businessId}")
    public String showOrganisation(@PathVariable(name = "businessId") Integer businessId, Model model) {
        model.addAttribute("list",businessRepository.findAll());
        Optional<Business> bo = businessRepository.findById(businessId);
        Business business = bo.get();
        model.addAttribute("business", business);
        System.out.println(businessId);
//        return "business/organisation";
        return "business/business-user";
    }
}
