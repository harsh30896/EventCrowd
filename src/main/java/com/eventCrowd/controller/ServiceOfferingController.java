package com.eventCrowd.controller;

import com.eventCrowd.entity.ServiceOffering;
import com.eventCrowd.service.ServiceOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/ServiceOffer")
public class ServiceOfferingController {

    @Autowired
    ServiceOfferingService serviceOfferingService;

    @PostMapping("/createService")
    public ResponseEntity<ServiceOffering> createServiceOffering(@RequestBody Map<String, Object> serviceOfferingRequest) {
        String name = (String) serviceOfferingRequest.get("name");
        String description = (String) serviceOfferingRequest.get("description");
        Double price = Double.valueOf(serviceOfferingRequest.get("price").toString());
        Long userId = Long.valueOf(serviceOfferingRequest.get("userId").toString());
        ServiceOffering serviceOffering = new ServiceOffering();
        serviceOffering.setName(name);
        serviceOffering.setDescription(description);
        serviceOffering.setPrice(price);
        ServiceOffering createdServiceOffering = serviceOfferingService.createServiceOffering(serviceOffering, userId);
        return new ResponseEntity<>(createdServiceOffering, HttpStatus.CREATED);
    }

    @GetMapping("/getAllOffering")
    public List<ServiceOffering> getAllOffering(){
        return  serviceOfferingService.getAllServiceOfferings();
    }


}
