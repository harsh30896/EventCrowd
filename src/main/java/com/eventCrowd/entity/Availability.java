package com.eventCrowd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long availabilityId;
    private LocalDate availableFrom;
    private LocalDate availableTo;

    // Many availabilities for one service offering
    @ManyToOne
    @JoinColumn(name = "serviceId")
    private ServiceOffering serviceOffering; // Reference to the specific service offering
}
