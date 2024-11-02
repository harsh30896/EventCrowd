package com.eventCrowd.serviceImpl;
import com.eventCrowd.dto.ApiResponse;
import com.eventCrowd.entity.ServiceOffering;
import com.eventCrowd.enums.UserResponseMessage;
import com.eventCrowd.exceptionHandler.ResourceNotFoundException;
import com.eventCrowd.repository.ServiceOfferingRepo;
import com.eventCrowd.repository.UserRepo;
import com.eventCrowd.service.ServiceOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceOfferingServiceImpl implements ServiceOfferingService {

    @Autowired
    ServiceOfferingRepo serviceOfferingRepo;

    @Autowired
    UserRepo userRepo;

    @Override
    public ApiResponse createServiceOffering(ServiceOffering serviceOffering) {
       serviceOfferingRepo.save(serviceOffering);
        ApiResponse apiResponse=new ApiResponse(UserResponseMessage.USER_CREATI0N.getMessage(), true);
        return  apiResponse;
    }

    @Override
    public Optional<ServiceOffering> getServiceById(Long serviceId) {
      Optional<ServiceOffering> serviceOffering = serviceOfferingRepo.findById(serviceId);
      if(serviceOffering.isPresent()){
          return serviceOffering;
      }
      return Optional.empty();
    }

    @Override
    public ServiceOffering updateServiceOffering(Long serviceId, ServiceOffering serviceOfferingDetails) {
        if(serviceOfferingRepo.existsById(serviceId)){
          return serviceOfferingRepo.save(serviceOfferingDetails);
        }
        else
            return null;
    }

    @Override
    public void deleteServiceOffering(Long serviceId) {
        if(serviceOfferingRepo.existsById(serviceId)){
            serviceOfferingRepo.deleteById(serviceId);
        }else{
            throw new ResourceNotFoundException("Service Not Found With Given Service Id :"+serviceId);
        }
    }

    @Override
    public List<ServiceOffering> getAllServiceOfferings() {
        List<ServiceOffering> serviceOfferings = serviceOfferingRepo.findAll();
        return serviceOfferings;
    }

    @Override
    public List<ServiceOffering> getServicesByServiceProvider(Long userId) {
     List<ServiceOffering> serviceOfferingList=serviceOfferingRepo.findAllById(Collections.singleton(userId));
    return serviceOfferingList;
    }

    @Override
    public List<ServiceOffering> getServicesByEvent(Long eventId) {
         List<ServiceOffering> gettingServiceById = serviceOfferingRepo.findAllById(Collections.singleton(eventId));
         return gettingServiceById;
    }
}
