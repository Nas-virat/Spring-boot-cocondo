package com.example.CondoSpringBoot.service;

import com.example.CondoSpringBoot.model.Person;

import java.util.List;

import java.util.UUID;
public interface PersonService {
     List<Person> findAll();

     Person findByPersonId(UUID id);
     Person findByEmail(String email);

     Person savePerson(Person person);

     void deletePersonById(UUID id);

}
