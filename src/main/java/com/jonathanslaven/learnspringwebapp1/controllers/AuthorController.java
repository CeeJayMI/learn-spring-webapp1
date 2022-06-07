package com.jonathanslaven.learnspringwebapp1.controllers;

import com.jonathanslaven.learnspringwebapp1.repositiories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("authors", authorRepository.findAll());
        System.out.println("Got authors: " + authorRepository.count());
        return "authors/list";
    }
}
