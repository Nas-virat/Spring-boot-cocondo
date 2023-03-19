package com.example.CondoSpringBoot.repo;

import com.example.CondoSpringBoot.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface PersonRepo extends MongoRepository<Person, UUID> {

    Person findByPersonId(UUID id);
    Person findByEmail(String email);

}
