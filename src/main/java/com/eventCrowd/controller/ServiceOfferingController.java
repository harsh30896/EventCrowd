package com.eventCrowd.controller;

import com.eventCrowd.dto.ApiResponse;
import com.eventCrowd.entity.ServiceOffering;
import com.eventCrowd.enums.ResponseMessage;
import com.eventCrowd.service.ServiceOfferingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/ServiceOffer")
public class ServiceOfferingController {

    private ServiceOfferingService serviceOfferingService;
    ServiceOfferingController(ServiceOfferingService serviceOfferingService){
        this.serviceOfferingService=serviceOfferingService;
    }

    @PostMapping("/createService")
    public ResponseEntity<ApiResponse> createServiceOffering(@RequestBody ServiceOffering serviceOffering) {
        serviceOfferingService.createServiceOffering(serviceOffering);
        return new ResponseEntity<>(new ApiResponse(ResponseMessage.CREATE_SUCCESS.getMessage(),true), HttpStatus.CREATED);
    }

    @GetMapping("/getAllOffering")
    public List<ServiceOffering> getAllOffering(){
        return  serviceOfferingService.getAllServiceOfferings();
    }

    @PutMapping("/updateServiceOffering")
    public ResponseEntity<ApiResponse> updateServiceOffering(@PathVariable("id") Long serviceId,@RequestBody ServiceOffering serviceOffering){
         serviceOfferingService.updateServiceOffering(serviceId,serviceOffering);
        return new ResponseEntity<>(new ApiResponse(ResponseMessage.UPDATE_SUCCESS.getMessage(),true),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteServiceOffering/{id}")
    public ResponseEntity<ApiResponse> deleteServiceOffering(@PathVariable("id") Long serviceId){
         serviceOfferingService.deleteServiceOffering(serviceId);
         return new ResponseEntity<>(new ApiResponse(ResponseMessage.DELETE_SUCCESS.getMessage(),true),HttpStatus.OK);
    }

}
