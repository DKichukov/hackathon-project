package com.example.controllers;

import com.example.entities.Student;
import com.example.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentRegController {
    @Autowired
    StudentRepository studRepository;

    @GetMapping("/create_student")
    public String createStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "/student/create_student";
    }

    @PostMapping("/submit-student")
    private ModelAndView saveStudent(Student student) {
        studRepository.save(student);
        return new ModelAndView("redirect:/index");
    }

}
