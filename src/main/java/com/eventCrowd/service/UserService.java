package com.eventCrowd.service;


import com.eventCrowd.dto.ApiResponse;
import com.eventCrowd.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void saveUser(User user);
    Optional<User> findUserById(Long id);
    List<User> findAllUsers();
    Boolean updateUser(User user, Long userId);
    void deleteUser(Long id);
}
