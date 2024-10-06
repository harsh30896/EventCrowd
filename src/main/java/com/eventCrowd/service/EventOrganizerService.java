package com.eventCrowd.service;

import com.eventCrowd.entity.EventOrganizer;

import java.util.List;

public interface EventOrganizerService {

    EventOrganizer createEvent(EventOrganizer event);

    EventOrganizer getEventById(Long eventId);

    EventOrganizer updateEvent(Long eventId, EventOrganizer eventDetails);

    void deleteEvent(Long eventId);

    List<EventOrganizer> getAllEvents();

    List<EventOrganizer> getEventsByOrganizer(Long userId);

    EventOrganizer addServicesToEvent(Long eventId, List<Long> serviceIds);

    EventOrganizer removeServiceFromEvent(Long eventId, Long serviceId);

    List<EventOrganizer> getEventsByServiceProvider(Long serviceProviderId);
}
