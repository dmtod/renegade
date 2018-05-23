package com.renegadeapps.eticketingservice.services.impl;

import com.renegadeapps.eticketingservice.dao.PersonDao;
import com.renegadeapps.eticketingservice.exceptions.ResourceNotFoundException;
import com.renegadeapps.eticketingservice.model.Person;
import com.renegadeapps.eticketingservice.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao personDao;

    @Override
    public Person create(Person person) {
        return personDao.save(person);
    }

    @Override
    public Person delete(Long id){
        Person person = findById(id);
        personDao.delete(person);
        return person;
    }

    @Override
    public List<Person> findAll() {
        List<Person> persons = new ArrayList<>();
        personDao.findAll().forEach(persons::add);
        return persons;
    }

    @Override
    public Person findById(Long id){
        return personDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Person Id " + id + " not found"));
    }

    @Override
    public Person update(Person updatedPerson) {
        return personDao.findById(updatedPerson.getId()).map(person -> {
            person.setFirstName(updatedPerson.getFirstName());
            person.setLastName(updatedPerson.getLastName());
            person.setEmail(updatedPerson.getEmail());
            return personDao.save(person);
        }).orElseThrow(() -> new ResourceNotFoundException("Event Id " + updatedPerson.getId() + " not found"));
    }
}
