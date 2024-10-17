package com.eventCrowd.controller;

import com.eventCrowd.entity.Booking;
import com.eventCrowd.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @PostMapping("/createBooking")
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking){
        Booking booking1 = bookingService.createBooking(booking);
        return new ResponseEntity<>(booking1, HttpStatus.CREATED);
    }
}
