package com.example.library.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.entity.Book;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getBooks() {

        return Arrays.asList(
            new Book(1, "Java Programming", "James Gosling"),
            new Book(2, "Spring Boot in Action", "Craig Walls"),
            new Book(3, "Clean Code", "Robert C. Martin")
        );
    }
}