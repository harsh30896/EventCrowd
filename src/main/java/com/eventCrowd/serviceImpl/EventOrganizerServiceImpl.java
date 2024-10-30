package com.eventCrowd.serviceImpl;

import com.eventCrowd.entity.Booking;
import com.eventCrowd.entity.EventOrganizer;
import com.eventCrowd.repository.BookingRepo;
import com.eventCrowd.repository.EventOrganizerRepo;
import com.eventCrowd.service.EventOrganizerService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventOrganizerServiceImpl implements EventOrganizerService {

    @Autowired
    EventOrganizerRepo eventOrganizerRepo;

    @Autowired
    BookingRepo bookingRepo;


    @Override
    public EventOrganizer createEvent(EventOrganizer eventOrganizer) {
        return eventOrganizerRepo.save(eventOrganizer);
    }

    @Override
    public Optional<EventOrganizer> getEventById(Long eventId) {
        Optional<EventOrganizer> eventOrganizer = eventOrganizerRepo.findById(eventId);
        return eventOrganizer;
    }


    @Override
    public EventOrganizer updateEvent(Long eventId, EventOrganizer eventDetails) {
       if(!eventOrganizerRepo.existsById(eventId)){
           return null;
       }
       eventDetails.setEventId(eventId);
       return eventOrganizerRepo.save(eventDetails);
    }

    // In EventOrganizerServiceImpl:
    @Transactional
    public boolean deleteEvent(Long eventId) {
        if (!eventOrganizerRepo.existsById(eventId)) {
            return false;
        }
        bookingRepo.deleteByEventId(eventId); // Delete related bookings
        eventOrganizerRepo.deleteById(eventId); // Then delete the event organizer
        return true;
    }


}
