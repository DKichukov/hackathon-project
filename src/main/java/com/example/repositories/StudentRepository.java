package com.example.repositories;

import com.example.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class StudentRepository implements JpaRepository<Student,Integer> {
}
