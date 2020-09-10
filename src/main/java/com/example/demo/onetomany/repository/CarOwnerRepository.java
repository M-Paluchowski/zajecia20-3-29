package com.example.demo.onetomany.repository;

import com.example.demo.onetomany.model.CarOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarOwnerRepository extends JpaRepository<CarOwner, Long> {
}
