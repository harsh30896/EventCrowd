package com.eventCrowd.serviceImpl;

import com.eventCrowd.entity.Admin;
import com.eventCrowd.service.AdminService;

import java.util.List;
import java.util.Optional;

public class AdminServiceImpl implements AdminService {
    @Override
    public Admin addAdmin(Admin admin) {
        return null;
    }

    @Override
    public Optional<Admin> findAdminById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Admin> findAllAdmins() {
        return List.of();
    }

    @Override
    public void deleteAdmin(Long id) {

    }
}
