package com.eventCrowd.entity;

import jakarta.persistence.*;

@Entity
public class EventService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "business_id")
    private Business business;
}
