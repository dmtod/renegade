package com.renegadeapps.eticketingservice.services;
import com.renegadeapps.eticketingservice.exceptions.ResourceNotFoundException;
import com.renegadeapps.eticketingservice.model.Person;

import java.util.List;


public interface PersonService {
    Person create(Person person);

    Person delete(Long id) throws ResourceNotFoundException;

    List<Person> findAll();

    Person findById(Long id) throws ResourceNotFoundException;

    Person update(Person user) throws ResourceNotFoundException;
}
