package com.eventCrowd.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOffering {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;
    private String name;
    private String description;
    private Double price;

    // One service can be provided by one service provider (User)
    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonBackReference // Prevents infinite recursion
    private User serviceProvider;

    // Many-to-Many relationship with EventOrganizer
    @ManyToMany(mappedBy = "services")
    private List<EventOrganizer> events;
}
