package com.eventCrowd.service;

import com.eventCrowd.entity.EventOrganizer;

import java.util.Optional;

public interface EventOrganizerService {

    EventOrganizer createEvent(EventOrganizer event);

    Optional<EventOrganizer> getEventById(Long eventId);

    EventOrganizer updateEvent(Long eventId, EventOrganizer eventDetails);

    boolean deleteEvent(Long eventId);


}
