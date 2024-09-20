package com.eventCrowd.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate availableFrom;
    private LocalDate availableTo;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private EventService eventService;
}
