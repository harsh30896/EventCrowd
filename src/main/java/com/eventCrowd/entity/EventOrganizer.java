package com.eventCrowd.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long eventId;
    private String title;
    private String location;
    private LocalDate eventDate;
    private Double budget;
    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonBackReference
    private User organizer;
    @ManyToMany
    @JoinTable(name = "event_services",
            joinColumns = @JoinColumn(name = "eventId"),
            inverseJoinColumns = @JoinColumn(name = "serviceId"))
    private List<ServiceOffering> services;

    @OneToMany(mappedBy = "eventOrganizer", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Booking> bookings;


}
