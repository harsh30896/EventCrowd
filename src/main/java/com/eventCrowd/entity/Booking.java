package com.eventCrowd.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    // Many bookings are associated with one event organizer
    @ManyToOne
    @JoinColumn(name = "eventId")
  //  @JsonBackReference
    private EventOrganizer eventOrganizer;

    // Many bookings are associated with one service offering
    @ManyToOne
    @JoinColumn(name = "serviceOfferingId")
 //   @JsonBackReference
    private ServiceOffering serviceOffering;
}
