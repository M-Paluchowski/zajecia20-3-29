package com.example.demo.onetomany.repository;

import com.example.demo.onetomany.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
