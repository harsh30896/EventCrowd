package com.eventCrowd.entity;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String userRole; // Can be "EVENT_ORGANIZER" or "SERVICE_PROVIDER"
}

