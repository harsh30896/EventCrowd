package com.eventCrowd.service;

import com.eventCrowd.entity.Admin;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    Admin addAdmin(Admin admin);
    Optional<Admin> findAdminById(Long id);
    List<Admin> findAllAdmins();
    void deleteAdmin(Long id);
}
