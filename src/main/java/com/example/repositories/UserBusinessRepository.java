package com.example.repositories;

import com.example.entities.UserBusiness;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBusinessRepository extends JpaRepository<UserBusiness, Integer> {
}
