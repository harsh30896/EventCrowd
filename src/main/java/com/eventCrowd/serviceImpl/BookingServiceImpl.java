package com.eventCrowd.serviceImpl;

import com.eventCrowd.entity.Booking;
import com.eventCrowd.repository.BookingRepo;
import com.eventCrowd.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepo bookingRepo;

    @Override
    public Booking createBooking(Booking booking) {
       Booking booking1 = bookingRepo.save(booking);
       return booking1;
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
