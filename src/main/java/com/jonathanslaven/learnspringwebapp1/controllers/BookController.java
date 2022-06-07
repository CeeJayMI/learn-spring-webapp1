package com.jonathanslaven.learnspringwebapp1.controllers;

import com.jonathanslaven.learnspringwebapp1.repositiories.BookRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class BookController {

    private final BookRepository bookRepository;

    public BookController (BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }

}
