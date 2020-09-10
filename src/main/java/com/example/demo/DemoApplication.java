package com.example.demo;

import com.example.demo.manytomany.service.BookService;
import com.example.demo.onetomany.service.CarOwnerService;
import com.example.demo.onetoone.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        //ONE-TO-ONE
//        PersonService personService = context.getBean(PersonService.class);
//        personService.persistPerson();

        //ONE-TO-MANY
//        CarOwnerService carOwnerService = context.getBean(CarOwnerService.class);
//        carOwnerService.persistCarOwner();

        //MANY-TO-MANY
        BookService bookService = context.getBean(BookService.class);
        bookService.persistBook();
        bookService.printBooks();
        bookService.deleteBook(1L);
        bookService.printBooks();
    }

}
