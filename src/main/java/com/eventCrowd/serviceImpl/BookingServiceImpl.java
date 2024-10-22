package com.eventCrowd.serviceImpl;

import com.eventCrowd.entity.Booking;
import com.eventCrowd.entity.EventOrganizer;
import com.eventCrowd.entity.ServiceOffering;
import com.eventCrowd.repository.BookingRepo;
import com.eventCrowd.repository.EventOrganizerRepo;
import com.eventCrowd.repository.ServiceOfferingRepo;
import com.eventCrowd.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepo bookingRepo;

    @Autowired
    private EventOrganizerRepo eventOrganizerRepo;

    @Autowired
    private ServiceOfferingRepo serviceOfferingRepo;

    @Override
    public Booking createBooking(Booking booking) {
        if (booking.getEventOrganizer() == null || booking.getEventOrganizer().getEventId() == null) {
            throw new IllegalArgumentException("Event organizer is required for booking.");
        }

        EventOrganizer eventOrganizer = eventOrganizerRepo.findById(booking.getEventOrganizer().getEventId())
                .orElseThrow(() -> new IllegalArgumentException("Event organizer not found."));

        if (booking.getServiceOffering() == null || booking.getServiceOffering().getServiceId() == null) {
            throw new IllegalArgumentException("Service offering is required for booking.");
        }

        ServiceOffering serviceOffering = serviceOfferingRepo.findById(booking.getServiceOffering().getServiceId())
                .orElseThrow(() -> new IllegalArgumentException("Service offering not found."));

        if (booking.getBookingDate() == null || booking.getBookingDate().isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Booking date is invalid or in the past.");
        }

        booking.setEventOrganizer(eventOrganizer);
        booking.setServiceOffering(serviceOffering);
        return bookingRepo.save(booking);
    }

    @Override
    public Booking updateBooking(Booking booking) {
        return null;
    }

    @Override
    public Optional<Booking> findBookingById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Booking> findAllBookings() {
        return List.of();
    }

    @Override
    public void cancelBooking(Long id) {

    }
}
