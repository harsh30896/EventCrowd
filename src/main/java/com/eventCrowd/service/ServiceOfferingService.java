package com.eventCrowd.service;

import com.eventCrowd.entity.ServiceOffering;

import java.util.List;
import java.util.Optional;

public interface ServiceOfferingService {

    ServiceOffering createServiceOffering(ServiceOffering serviceOffering,Long userId);

    Optional<ServiceOffering> getServiceById(Long serviceId);

    ServiceOffering updateServiceOffering(Long serviceId, ServiceOffering serviceOfferingDetails);

    void deleteServiceOffering(Long serviceId);

    List<ServiceOffering> getAllServiceOfferings();

    List<ServiceOffering> getServicesByServiceProvider(Long userId);

    List<ServiceOffering> getServicesByEvent(Long eventId);
}
