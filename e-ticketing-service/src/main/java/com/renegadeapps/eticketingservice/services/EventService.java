package com.renegadeapps.eticketingservice.services;

import com.renegadeapps.eticketingservice.exceptions.ResourceNotFoundException;
import com.renegadeapps.eticketingservice.model.Event;

import java.util.List;

public interface EventService {
    Event createEvent(Event event);

    Event delete(Long id) throws ResourceNotFoundException;

    List<Event> findAll();

    Event findById(Long id) throws ResourceNotFoundException;

    Event updateEvent(Event updatedEvent) throws ResourceNotFoundException;
}
