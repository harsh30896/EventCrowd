package com.eventCrowd.controller;

import com.eventCrowd.dto.ApiResponse;
import com.eventCrowd.entity.ServiceOffering;
import com.eventCrowd.enums.ResponseMessage;
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
    public ResponseEntity<ApiResponse> createServiceOffering(@RequestBody ServiceOffering serviceOffering) {
        ServiceOffering createdServiceOffering = serviceOfferingService.createServiceOffering(serviceOffering);
        return new ResponseEntity<>(new ApiResponse(ResponseMessage.CREATE_SUCCESS.getMessage()), HttpStatus.CREATED);
    }

    @GetMapping("/getAllOffering")
    public List<ServiceOffering> getAllOffering(){
        return  serviceOfferingService.getAllServiceOfferings();
    }

    @PutMapping("/updateServiceOffering")
    public ResponseEntity<ApiResponse> updateServiceOffering(@PathVariable Long serviceId,@RequestBody ServiceOffering serviceOffering){
        ServiceOffering updateServiceOffering = serviceOfferingService.updateServiceOffering(serviceId,serviceOffering);
        return new ResponseEntity<>(new ApiResponse(ResponseMessage.UPDATE_SUCCESS.getMessage()),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteServiceOffering/{id}")
    public ResponseEntity<ApiResponse> deleteServiceOffering(@PathVariable Long serviceId){
         serviceOfferingService.deleteServiceOffering(serviceId);
         return new ResponseEntity<>(new ApiResponse(ResponseMessage.DELETE_SUCCESS.getMessage()),HttpStatus.OK);
    }


}
