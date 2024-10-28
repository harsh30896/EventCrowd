package com.eventCrowd.controller;

import com.eventCrowd.entity.EventOrganizer;
import com.eventCrowd.service.EventOrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;

@RestController
@RequestMapping("api/v1/EventOrganizer")
public class EventOrganizerController {

    @Autowired
    EventOrganizerService eventOrganizerService;

    @PostMapping("/createEvent")
    public ResponseEntity<EventOrganizer> createEvent(@RequestBody EventOrganizer eventOrganizer) {
        EventOrganizer createdEvent = eventOrganizerService.createEvent(eventOrganizer);
        return new ResponseEntity<>(createdEvent, HttpStatus.CREATED);
    }

    @PutMapping("/updateEvent/{id}")
    public ResponseEntity<EventOrganizer> updateEvent(@PathVariable("id") Long eventId, @RequestBody EventOrganizer eventOrganizer){
       EventOrganizer updatedEvent = eventOrganizerService.updateEvent(eventId,eventOrganizer);
       return new ResponseEntity<>(updatedEvent,HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteEvent/{id}")
    public ResponseEntity<?> deleteEvent(@PathVariable("id") Long eventId){
        if (eventOrganizerService.deleteEvent(eventId)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
