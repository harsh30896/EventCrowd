package com.eventCrowd.repository;

import com.eventCrowd.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepo extends JpaRepository<Notification,Long> {
}
