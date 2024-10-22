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
    public ResponseEntity<EventOrganizer> createEvent(@RequestBody Map<String, Object> eventDetails) {
        Long userId = Long.valueOf(eventDetails.get("userId").toString());
        EventOrganizer eventOrganizer = new EventOrganizer();
        eventOrganizer.setTitle(eventDetails.get("title").toString());
        eventOrganizer.setLocation(eventDetails.get("location").toString());
        eventOrganizer.setEventDate(LocalDate.parse(eventDetails.get("eventDate").toString()));
        eventOrganizer.setBudget(Double.valueOf(eventDetails.get("budget").toString()));
        EventOrganizer createdEvent = eventOrganizerService.createEvent(eventOrganizer, userId);
        return new ResponseEntity<>(createdEvent, HttpStatus.CREATED);
    }


}
