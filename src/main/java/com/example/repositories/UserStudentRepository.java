package com.example.repositories;

import com.example.entities.UserStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStudentRepository extends JpaRepository<UserStudent, Integer> {
}
