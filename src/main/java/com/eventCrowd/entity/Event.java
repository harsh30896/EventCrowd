package com.eventCrowd.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String location;
    private LocalDate eventDate;
    private Double budget;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User organizer;
}

