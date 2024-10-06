package com.eventCrowd.service;

import com.eventCrowd.entity.Availability;

import java.util.List;
import java.util.Optional;

public interface AvailabilityService {
    Availability setServiceAvailability(Availability availability);
    Availability updateServiceAvailability(Availability availability);
    Optional<Availability> findAvailabilityByServiceId(Long serviceId);
    List<Availability> findAllAvailableServices();
}
