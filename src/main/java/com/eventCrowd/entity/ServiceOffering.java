package com.eventCrowd.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class ServiceOffering {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;
    private String name;
    private String description;
    private Double price;

    // Many services can be provided by one service provider (User)
    @ManyToOne
    @JoinColumn(name = "userId") // Reference to the service provider user
    private User serviceProvider;

    // Many-to-Many relationship with EventOrganizer
    @ManyToMany(mappedBy = "services")
    private List<EventOrganizer> events;
}
