package com.eventCrowd.entity;

import jakarta.persistence.*;

@Entity
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user; // This user has userRole = "SERVICE_PROVIDER"
}
