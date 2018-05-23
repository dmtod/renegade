package com.renegadeapps.eticketingservice.Controller;

import com.renegadeapps.eticketingservice.model.Person;
import com.renegadeapps.eticketingservice.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/person/*"})
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public Person create(@RequestBody Person user) {
        return personService.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public Person findOne(@PathVariable("id") long id) {
        Person person = new Person();
        person = personService.findById(id);
        return person;
    }

    @PutMapping
    public Person update(@RequestBody Person person) {
        return personService.update(person);
    }

    @DeleteMapping(path = {"/{id}"})
    public Person delete(@PathVariable("id") long id) {
        Person person = new Person();
        person = personService.delete(id);
        return person;
    }

    @GetMapping(path = {"/all"})
    //@RequestMapping(path = {"/person/all"}, method = RequestMethod.GET)
    public List<Person> findAll() {
        return personService.findAll();
    }
}
