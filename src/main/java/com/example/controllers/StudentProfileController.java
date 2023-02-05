package com.example.controllers;

import com.example.entities.Interest;
import com.example.entities.Opportunity;
import com.example.entities.Student;
import com.example.repositories.InterestRepository;
import com.example.repositories.OpportunityRepository;
import com.example.repositories.StudentRepository;
import com.example.service.StudentFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class StudentProfileController {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    InterestRepository interestRepository;
    @Autowired
    OpportunityRepository opportunityRepository;

    @Autowired
    StudentFilterService studentFilterService;

    @GetMapping("/student/{studentId}")
    public String showOrganisation(@PathVariable(name = "studentId") Integer studentId, Model model) {
        model.addAttribute("list", studentRepository.findAll());
        Optional<Student> bo = studentRepository.findById(studentId);
        Student student = bo.get();
        model.addAttribute("student", student);
        System.out.println(studentId);
        return "student/student";
    }

    @GetMapping("/search")
    private String getAllCriterias(Model model) {
        Opportunity opportunity = new Opportunity();
        Interest interest = new Interest();
        Iterable<Opportunity> opportunities = opportunityRepository.findAll();
        Iterable<Interest> interests = interestRepository.findAll();
        model.addAttribute("opportunity", opportunity);
        model.addAttribute("interest", interest);
        model.addAttribute("listInterests", interests);
        model.addAttribute("listOpportunities", opportunities);
        return "student/search";
    }

//    @PostMapping("/search-submit")
//    private ModelAndView saveChoice(Interest interest, Opportunity opportunity, Model model) {
//        List<Object> intList = Collections.singletonList(studentFilterService.getInterestList(interest.getDescription()));
//        return new ModelAndView("");
//    }


}
