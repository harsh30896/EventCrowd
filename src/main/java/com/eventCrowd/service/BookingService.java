package com.eventCrowd.service;

import com.eventCrowd.entity.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingService {
    Booking createBooking(Booking booking);
    Booking updateBooking(Booking booking);
    Optional<Booking> findBookingById(Long id);
    List<Booking> findAllBookings();
    void cancelBooking(Long id);
}
