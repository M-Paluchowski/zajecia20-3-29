package com.example.demo.onetoone.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Address address;
}
