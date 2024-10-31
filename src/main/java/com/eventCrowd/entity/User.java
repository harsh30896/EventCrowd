package com.eventCrowd.entity;

import com.eventCrowd.enums.Role;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;
    private String email;
    private String password;
    private String location;

    @Enumerated(EnumType.STRING)
    private Role role;

    // One user (client) can organize multiple events
    @OneToMany(mappedBy = "organizer", cascade = CascadeType.ALL)
    private List<EventOrganizer> organizedEvents;

    // One user (service provider) can offer multiple services
    @OneToMany(mappedBy = "serviceProvider", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<ServiceOffering> servicesOffered;
}

