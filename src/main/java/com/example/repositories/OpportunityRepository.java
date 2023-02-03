package com.example.repositories;

import com.example.entities.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpportunityRepository extends JpaRepository<Opportunity,Integer> {
}

