package com.jonathanslaven.learnspringwebapp1.controllers;

import com.jonathanslaven.learnspringwebapp1.repositiories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController (BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookRepository.findAll());
        System.out.println("Got books: " + bookRepository.count());

        return "books/list";
    }

}
