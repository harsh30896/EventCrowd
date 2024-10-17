package com.eventCrowd.controller;

import com.eventCrowd.entity.EventOrganizer;
import com.eventCrowd.service.EventOrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/EventOrganizer")
public class EventOrganizerController {

    @Autowired
    EventOrganizerService eventOrganizerService;

    @PostMapping("/createEvent")
    public ResponseEntity<EventOrganizer> createEvent(@RequestBody EventOrganizer eventOrganizer){
        EventOrganizer eventOrganizers=eventOrganizerService.createEvent(eventOrganizer);
        return new ResponseEntity<>(eventOrganizers, HttpStatus.CREATED);
    }
}
