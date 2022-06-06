package com.jonathanslaven.learnspringwebapp1.repositiories;

import com.jonathanslaven.learnspringwebapp1.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
