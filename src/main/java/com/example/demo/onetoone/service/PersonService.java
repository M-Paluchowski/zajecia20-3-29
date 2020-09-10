package com.example.demo.onetoone.service;

import com.example.demo.onetoone.model.Address;
import com.example.demo.onetoone.model.Person;
import com.example.demo.onetoone.repository.AddressRepository;
import com.example.demo.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;
    private AddressRepository addressRepository;


    @Autowired
    public PersonService(PersonRepository personRepository, AddressRepository addressRepository) {
        this.personRepository = personRepository;
        this.addressRepository = addressRepository;
    }

    public void persistPerson() {

        Address address = new Address();
        address.setCity("Wrocław");
        address.setFlatNumber("5");
        address.setHouseNumber("5");
        address.setStreet("Bałtycka");

        Person person = new Person();
        person.setFirstName("Jan");
        person.setLastName("Kowalski");
        person.setAddress(address);
        personRepository.save(person);
    }
}
