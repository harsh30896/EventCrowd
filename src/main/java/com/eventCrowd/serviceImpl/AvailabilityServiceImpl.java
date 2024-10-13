package com.eventCrowd.serviceImpl;

import com.eventCrowd.entity.Availability;
import com.eventCrowd.service.AvailabilityService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AvailabilityServiceImpl implements AvailabilityService {
    @Override
    public Availability setServiceAvailability(Availability availability) {
        return null;
    }

    @Override
    public Availability updateServiceAvailability(Availability availability) {
        return null;
    }

    @Override
    public Optional<Availability> findAvailabilityByServiceId(Long serviceId) {
        return Optional.empty();
    }

    @Override
    public List<Availability> findAllAvailableServices() {
        return List.of();
    }
}
