package com.example.movieservice.repository;

import com.example.movieservice.entity.ShowTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowTimeRepository extends JpaRepository<ShowTime, Integer> {
}
