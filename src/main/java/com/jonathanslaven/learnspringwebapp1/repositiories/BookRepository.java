package com.jonathanslaven.learnspringwebapp1.repositiories;

import com.jonathanslaven.learnspringwebapp1.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
