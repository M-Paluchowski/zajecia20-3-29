package com.example.demo.manytomany.repository;

import com.example.demo.manytomany.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
