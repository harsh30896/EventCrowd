package com.eventCrowd.controller;

import com.eventCrowd.entity.ServiceOffering;
import com.eventCrowd.service.ServiceOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ServiceOffer")
public class ServiceOfferingController {

    @Autowired
    ServiceOfferingService serviceOfferingService;

    @PostMapping("/createService")
    public ResponseEntity<ServiceOffering> createServiceOffering(@RequestBody ServiceOffering serviceOffering){
       ServiceOffering serviceOffering1 = serviceOfferingService.createServiceOffering(serviceOffering);
        return new ResponseEntity<>(serviceOffering1, HttpStatus.CREATED);
    }
}
