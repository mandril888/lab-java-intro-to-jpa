package com.example.airline.repository;

import com.example.airline.model.Aircrafts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftsRepository extends JpaRepository<Aircrafts, Integer> {

}
