package com.example.CondoSpringBoot.service;

import com.example.CondoSpringBoot.model.Person;
import com.example.CondoSpringBoot.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepo personRepo;
    @Override
    public List<Person> findAll() {
        return personRepo.findAll();
    }

    @Override
    public Person findByPersonId(UUID id) {
        return personRepo.findByPersonId(id);
    }

    @Override
    public Person findByEmail(String email) {
        return personRepo.findByEmail(email);
    }

    @Override
    public Person savePerson(Person person) {
        return personRepo.save(person);
    }

    @Override
    public void deletePersonById(UUID id) {
    personRepo.deleteById(id);
    }
}
