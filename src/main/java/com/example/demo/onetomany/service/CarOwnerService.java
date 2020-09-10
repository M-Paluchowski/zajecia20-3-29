package com.example.demo.onetomany.service;

import com.example.demo.onetomany.model.Car;
import com.example.demo.onetomany.model.CarOwner;
import com.example.demo.onetomany.repository.CarOwnerRepository;
import com.example.demo.onetomany.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarOwnerService {

    private CarOwnerRepository carOwnerRepository;
    private CarRepository carRepository;

    @Autowired
    public CarOwnerService(CarOwnerRepository carOwnerRepository, CarRepository carRepository) {
        this.carOwnerRepository = carOwnerRepository;
        this.carRepository = carRepository;
    }

    public void persistCarOwner() {

        Car firstCar = new Car();
        firstCar.setModel("Audi");
        firstCar.setColor("Black");

        Car secondCar = new Car();
        secondCar.setModel("BMW");
        secondCar.setColor("Red");

        CarOwner carOwner = new CarOwner();
        carOwner.setFirstName("Jan");
        carOwner.setLastName("Kowalski");
        carOwner.addCar(firstCar);
        carOwner.addCar(secondCar);

        carOwnerRepository.save(carOwner);
    }
}
