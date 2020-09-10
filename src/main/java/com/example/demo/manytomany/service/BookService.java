package com.example.demo.manytomany.service;

import com.example.demo.manytomany.model.Author;
import com.example.demo.manytomany.model.Book;
import com.example.demo.manytomany.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    public void persistBook() {
        Book firstBook = new Book();
        firstBook.setTitle("1");

        Book secondBook = new Book();
        secondBook.setTitle("2");

        Book thirdBook = new Book();
        thirdBook.setTitle("3");

        Author firstAuthor = new Author();
        firstAuthor.setName("First Author");

        Author secondAuthor = new Author();
        secondAuthor.setName("Second Author");

        firstBook.addAuthor(firstAuthor);

        secondBook.addAuthor(firstAuthor);
        secondBook.addAuthor(secondAuthor);

        thirdBook.addAuthor(secondAuthor);

        bookRepository.save(firstBook);
        bookRepository.save(secondBook);
        bookRepository.save(thirdBook);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public void printBooks() {
        System.out.println(bookRepository.findAll());
    }
}

