package com.eventCrowd.repository;

import com.eventCrowd.entity.Booking;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookingRepo extends JpaRepository<Booking,Long> {
    @Modifying
    @Transactional
    @Query("DELETE FROM Booking b WHERE b.eventOrganizer.eventId = :eventId")
    void deleteByEventId(@Param("eventId") Long eventId);
}
