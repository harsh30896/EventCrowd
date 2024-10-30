package com.eventCrowd.dto;

import com.eventCrowd.entity.EventOrganizer;
import com.eventCrowd.entity.ServiceOffering;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.time.LocalDate;

public class BookingDto {

    private Long bookingId;
    private String status;
    private LocalDate bookingDate;
    private EventOrganizer eventOrganizer;
    private ServiceOffering serviceOffering;
}
