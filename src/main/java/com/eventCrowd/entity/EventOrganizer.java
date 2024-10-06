package com.eventCrowd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class EventOrganizer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    private String title;
    private String location;
    private LocalDate eventDate;
    private Double budget;

    // Many events can be created by a single client (User)
    @ManyToOne
    @JoinColumn(name = "userId")
    private User organizer; // Client (user) who organizes the event

    // Many-to-Many relationship with EventService
    @ManyToMany
    @JoinTable(name = "event_services",
            joinColumns = @JoinColumn(name = "eventId"),
            inverseJoinColumns = @JoinColumn(name = "serviceId"))
    private List<ServiceOffering> services; // Services used in this event
}

