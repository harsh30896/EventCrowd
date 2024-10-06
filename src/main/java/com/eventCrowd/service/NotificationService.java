package com.eventCrowd.service;

import com.eventCrowd.entity.Notification;

import java.util.List;

public interface NotificationService {
    Notification sendNotification(Notification notification);
    List<Notification> findNotificationsByUserId(Long userId);
    void deleteNotification(Long id);
}
