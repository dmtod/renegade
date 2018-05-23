package com.renegadeapps.eticketingservice.dao;

import com.renegadeapps.eticketingservice.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDao extends CrudRepository<Event, Long> {
}
