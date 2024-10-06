package com.eventCrowd.service;


import com.eventCrowd.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    Optional<User> findUserById(Long id);
    List<User> findAllUsers();
    User updateUser(User user,Long userId);
    void deleteUser(Long id);
}
