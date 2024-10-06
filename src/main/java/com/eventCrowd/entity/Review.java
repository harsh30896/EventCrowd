package com.eventCrowd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;
    private int rating;
    private String comment;

    // Many reviews for one eventOrganizer
    @ManyToOne
    @JoinColumn(name = "eventId")
    private EventOrganizer eventOrganizer;

    // Many reviews for one serviceOffering
    @ManyToOne
    @JoinColumn(name = "serviceId")
    private ServiceOffering serviceOffering;
}
