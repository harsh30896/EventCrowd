package com.eventCrowd.serviceImpl;
import com.eventCrowd.entity.ServiceOffering;
import com.eventCrowd.entity.User;
import com.eventCrowd.repository.ServiceOfferingRepo;
import com.eventCrowd.repository.UserRepo;
import com.eventCrowd.service.ServiceOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceOfferingServiceImpl implements ServiceOfferingService {

    @Autowired
    ServiceOfferingRepo serviceOfferingRepo;

    @Autowired
    UserRepo userRepo;

    @Override
    public ServiceOffering createServiceOffering(ServiceOffering serviceOffering) {
        return serviceOfferingRepo.save(serviceOffering);
    }

    @Override
    public Optional<ServiceOffering> getServiceById(Long serviceId) {
      Optional<ServiceOffering> serviceOffering = serviceOfferingRepo.findById(serviceId);
      if(serviceOffering.isPresent()){
          return serviceOffering;
      }
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
        List<ServiceOffering> serviceOfferings = serviceOfferingRepo.findAll();
        return serviceOfferings;
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
