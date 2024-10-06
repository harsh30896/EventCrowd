package com.eventCrowd.serviceImpl;

import com.eventCrowd.entity.ServiceOffering;
import com.eventCrowd.service.ServiceOfferingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceOfferingServiceImpl implements ServiceOfferingService {
    @Override
    public ServiceOffering createServiceOffering(ServiceOffering serviceOffering) {
        return null;
    }

    @Override
    public ServiceOffering getServiceById(Long serviceId) {
        return null;
    }

    @Override
    public ServiceOffering updateServiceOffering(Long serviceId, ServiceOffering serviceOfferingDetails) {
        return null;
    }

    @Override
    public void deleteServiceOffering(Long serviceId) {

    }

    @Override
    public List<ServiceOffering> getAllServiceOfferings() {
        return List.of();
    }

    @Override
    public List<ServiceOffering> getServicesByServiceProvider(Long userId) {
        return List.of();
    }

    @Override
    public List<ServiceOffering> getServicesByEvent(Long eventId) {
        return List.of();
    }
}
