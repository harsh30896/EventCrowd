package com.eventCrowd.serviceImpl;

import com.eventCrowd.entity.Notification;
import com.eventCrowd.service.NotificationService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Override
    public Notification sendNotification(Notification notification) {
        return null;
    }

    @Override
    public List<Notification> findNotificationsByUserId(Long userId) {
        return List.of();
    }

    @Override
    public void deleteNotification(Long id) {

    }
}
