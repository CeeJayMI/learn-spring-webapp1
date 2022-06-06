package com.jonathanslaven.learnspringwebapp1.repositiories;

import com.jonathanslaven.learnspringwebapp1.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
