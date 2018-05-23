package com.renegadeapps.eticketingservice.Controller;

import com.renegadeapps.eticketingservice.model.Event;
import com.renegadeapps.eticketingservice.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/event/*"})
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public Event create(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @GetMapping(path = {"/{id}"})
    public Event findOne(@PathVariable("id") long id) {
        return eventService.findById(id);
    }

    @PutMapping
    public Event update(@RequestBody Event event) {
        return eventService.updateEvent(event);
    }

    @DeleteMapping(path = {"/{id}"})
    public Event delete(@PathVariable("id") long id) {
        return eventService.delete(id);
    }

    @GetMapping(path = {"/all"})
    public List<Event> findAll() {
        return eventService.findAll();
    }
}
