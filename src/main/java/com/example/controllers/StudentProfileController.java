package com.example.controllers;

import com.example.entities.Student;
import com.example.repositories.StudentRepository;
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

    @GetMapping("/student/{studentId}")
    public String showOrganisation(@PathVariable(name = "studentId") Integer studentId, Model model) {
        model.addAttribute("list",studentRepository.findAll());
        Optional<Student> bo = studentRepository.findById(studentId);
        Student student = bo.get();
        model.addAttribute("student", student);
        System.out.println(studentId);
        return "student/student";
    }
}
