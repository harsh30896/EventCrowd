package com.eventCrowd.repository;

import com.eventCrowd.entity.EventOrganizer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventOrganizerRepo extends JpaRepository<EventOrganizer, Long> {
}
