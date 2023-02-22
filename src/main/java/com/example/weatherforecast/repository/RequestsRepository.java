package com.example.weatherforecast.repository;

import com.example.weatherforecast.entity.Requests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestsRepository extends JpaRepository<Requests, Integer> {
}
