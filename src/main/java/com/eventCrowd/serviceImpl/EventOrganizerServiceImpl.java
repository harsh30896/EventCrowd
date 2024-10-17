package com.eventCrowd.serviceImpl;

import com.eventCrowd.entity.EventOrganizer;
import com.eventCrowd.repository.EventOrganizerRepo;
import com.eventCrowd.service.EventOrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventOrganizerServiceImpl implements EventOrganizerService {

    @Autowired
    EventOrganizerRepo eventOrganizerRepo;

    @Override
    public EventOrganizer createEvent(EventOrganizer event) {
            EventOrganizer eventOrganizer=eventOrganizerRepo.save(event);
            return eventOrganizer;
    }

    @Override
    public EventOrganizer getEventById(Long eventId) {
        return null;
    }

    @Override
    public EventOrganizer updateEvent(Long eventId, EventOrganizer eventDetails) {
        return null;
    }

    @Override
    public void deleteEvent(Long eventId) {

    }

    @Override
    public List<EventOrganizer> getAllEvents() {
        return List.of();
    }

    @Override
    public List<EventOrganizer> getEventsByOrganizer(Long userId) {
        return List.of();
    }

    @Override
    public EventOrganizer addServicesToEvent(Long eventId, List<Long> serviceIds) {
        return null;
    }

    @Override
    public EventOrganizer removeServiceFromEvent(Long eventId, Long serviceId) {
        return null;
    }

    @Override
    public List<EventOrganizer> getEventsByServiceProvider(Long serviceProviderId) {
        return List.of();
    }
}
