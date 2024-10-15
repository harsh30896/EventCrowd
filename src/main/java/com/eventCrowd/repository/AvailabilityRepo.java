package com.eventCrowd.repository;

import com.eventCrowd.entity.Availability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvailabilityRepo extends JpaRepository<Availability,Long> {
}
