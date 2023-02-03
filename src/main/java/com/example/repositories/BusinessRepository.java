package com.example.repositories;

import com.example.entities.Business;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessRepository  extends JpaRepository<Business,Integer> {
}
