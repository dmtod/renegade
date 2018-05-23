package com.renegadeapps.eticketingservice.services.impl;

import com.renegadeapps.eticketingservice.dao.EventDao;
import com.renegadeapps.eticketingservice.exceptions.ResourceNotFoundException;
import com.renegadeapps.eticketingservice.model.Event;
import com.renegadeapps.eticketingservice.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventDao eventDao;

    @Override
    public Event createEvent(Event event) {
        return eventDao.save(event);
    }

    @Override
    public Event delete(Long id){
        Event event = findById(id);
        eventDao.delete(event);
        return event;
    }

    @Override
    public List<Event> findAll() {
        List<Event> events = new ArrayList<>();
        eventDao.findAll().forEach(events::add);
        return events;
    }

    @Override
    public Event findById(Long id){
        return eventDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Event Id " + id + " not found"));
    }

    @Override
    public Event updateEvent(Event updatedEvent) {
        return eventDao.findById(updatedEvent.getId()).map(event -> {
            event.setName(updatedEvent.getName());
            event.setDescription(updatedEvent.getDescription());
            event.setDate(updatedEvent.getDate());
            return eventDao.save(event);
        }).orElseThrow(() -> new ResourceNotFoundException("Event Id " + updatedEvent.getId() + " not found"));
    }
}
