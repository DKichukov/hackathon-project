package com.example.repositories;

import com.example.entities.Seeking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeekingRepository extends JpaRepository<Seeking,Integer> {
}
