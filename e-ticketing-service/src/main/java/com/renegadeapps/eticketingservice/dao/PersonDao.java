package com.renegadeapps.eticketingservice.dao;

import com.renegadeapps.eticketingservice.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends CrudRepository<Person, Long> {
}
