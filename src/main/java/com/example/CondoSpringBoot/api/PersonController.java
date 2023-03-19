package com.example.CondoSpringBoot.api;

import com.example.CondoSpringBoot.model.Person;
import com.example.CondoSpringBoot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/person")
public class PersonController {

   @Autowired
   private PersonService personService;

   @GetMapping(value = "/")
   public List<Person> getAllperson(){
       return personService.findAll();
   }

   @GetMapping(value = "/bid/{id}")
   public Person getPersonById(@PathVariable("id") UUID id){
      return personService.findByPersonId(id);
   }

   @GetMapping(value = "/email/{email}")
   public Person getPersonByEmail(@PathVariable("email") String email){
      return personService.findByEmail(email);
   }

   @PostMapping(value = "/add")
   public Person savePerson(@RequestBody Person person){
      return personService.savePerson(person);
   }

   @DeleteMapping("/delete/{id}")
   public void deletePerson(@PathVariable("id") UUID id){
      personService.deletePersonById(id);
   }


}
