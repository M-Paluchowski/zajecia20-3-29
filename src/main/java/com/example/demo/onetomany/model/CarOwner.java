package com.example.demo.onetomany.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class CarOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "carOwner", cascade = CascadeType.PERSIST)
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
        car.setCarOwner(this);
    }
}
