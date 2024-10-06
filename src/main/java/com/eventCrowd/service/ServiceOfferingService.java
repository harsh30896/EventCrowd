package com.eventCrowd.service;

import com.eventCrowd.entity.ServiceOffering;

import java.util.List;

public interface ServiceOfferingService {

    ServiceOffering createServiceOffering(ServiceOffering serviceOffering);

    ServiceOffering getServiceById(Long serviceId);

    ServiceOffering updateServiceOffering(Long serviceId, ServiceOffering serviceOfferingDetails);

    void deleteServiceOffering(Long serviceId);

    List<ServiceOffering> getAllServiceOfferings();

    List<ServiceOffering> getServicesByServiceProvider(Long userId);

    List<ServiceOffering> getServicesByEvent(Long eventId);
}
