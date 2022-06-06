package com.jonathanslaven.learnspringwebapp1.bootstrap;

import com.jonathanslaven.learnspringwebapp1.domain.Author;
import com.jonathanslaven.learnspringwebapp1.domain.Book;
import com.jonathanslaven.learnspringwebapp1.domain.Publisher;
import com.jonathanslaven.learnspringwebapp1.repositiories.AuthorRepository;
import com.jonathanslaven.learnspringwebapp1.repositiories.BookRepository;
import com.jonathanslaven.learnspringwebapp1.repositiories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) { // throws Exception {

        Publisher pakit = new Publisher("Pakit", "123 Road", "City", "State", "12345");
        publisherRepository.save(pakit);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(pakit);
        pakit.getBooks().add(ddd);
        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(pakit);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Develelopment without EJB", "456456");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(pakit);
        pakit.getBooks().add(noEJB);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(pakit);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Authors: " + authorRepository.count());
        System.out.println("Number of Publishers: " + publisherRepository.count());
        System.out.println("Publisher's published books: " + pakit.getBooks().size());
    }
}
