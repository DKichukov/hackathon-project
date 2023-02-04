package com.example.controllers;

import com.example.entities.Student;
import com.example.entities.UserStudent;
import com.example.repositories.StudentRepository;
import com.example.repositories.UserStudentRepository;
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
    @Autowired
    UserStudentRepository userStudentRepository;

    @GetMapping("/create_student")
    public String createStudent(Model model) {
        Student student = new Student();
        UserStudent userStudent = new UserStudent();
        model.addAttribute("student", student);
        model.addAttribute("user",userStudent);
        return "/student/create_student";
    }

    @PostMapping("/submit-student")
    private ModelAndView saveStudent(Student student, UserStudent userStudent) {
        studRepository.save(student);
        userStudent.setStudent(student);
        userStudentRepository.save(userStudent);
        return new ModelAndView("redirect:/index");
    }

}
