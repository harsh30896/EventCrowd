package com.eventCrowd.repository;

import com.eventCrowd.entity.ServiceOffering;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceOfferingRepo extends JpaRepository<ServiceOffering, Long> {
}
