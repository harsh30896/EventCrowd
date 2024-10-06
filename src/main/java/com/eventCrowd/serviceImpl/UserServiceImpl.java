package com.eventCrowd.serviceImpl;


import com.eventCrowd.entity.User;
import com.eventCrowd.repository.UserRepo;
import com.eventCrowd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public User saveUser(User user) {
       return  userRepo.save(user);
    }

    @Override
    public Optional<User> findUserById(Long id) {
        Optional<User> user = userRepo.findById(id);
        return user;
    }

    @Override
    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User updateUser(User user,Long userId) {
        if(!userRepo.existsById(userId)){
            return null;
        }
        user.setUserId(userId);
        return userRepo.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}
