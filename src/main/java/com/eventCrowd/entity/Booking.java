package com.eventCrowd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    private String status;
    private LocalDate bookingDate;

    // Many bookings for one event organizer (event)
    @ManyToOne
    @JoinColumn(name = "eventId")
    private EventOrganizer eventOrganizer;

    // Many bookings for one service offering
    @ManyToOne
    @JoinColumn(name = "serviceOfferingId")
    private ServiceOffering serviceOffering;
}
