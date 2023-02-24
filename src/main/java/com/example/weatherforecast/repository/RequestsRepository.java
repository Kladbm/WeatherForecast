package com.example.weatherforecast.repository;

import com.example.weatherforecast.entity.Requests;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RequestsRepository extends JpaRepository<Requests, Integer> {

    Optional<Requests> findByName(String name);

    void deleteByName(String name);
}
