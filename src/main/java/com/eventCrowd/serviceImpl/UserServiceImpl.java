package com.eventCrowd.serviceImpl;


import com.eventCrowd.dto.ApiResponse;
import com.eventCrowd.entity.User;
import com.eventCrowd.exceptionHandler.ResourceNotFoundException;
import com.eventCrowd.repository.UserRepo;
import com.eventCrowd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepo userRepo;
    public UserServiceImpl(UserRepo userRepo){
        this.userRepo=userRepo;
    }

    @Override
    public void saveUser(User user) {
        userRepo.save(user);
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
    public Boolean updateUser(User user, Long userId) {
        Optional<User> existingUser= userRepo.findById(userId);
        if(existingUser.isEmpty())
        {
         throw new ResourceNotFoundException("User Not Found With the Given Id: "+userId);
        }
        User dbUser=existingUser.get();
        if(user.getName() != null){
            dbUser.setName(user.getName());
        }
        if(user.getRole() != null){
            dbUser.setRole(user.getRole());
        }

        if(user.getEmail() != null){
            dbUser.setEmail(user.getEmail());
        }
        if(user.getPassword() != null){
            dbUser.setPassword(user.getPassword());
        }
        if(user.getLocation() != null){
            dbUser.setLocation(user.getLocation());
        }
        userRepo.save(dbUser);
        return true;
    }

    @Override
    public Boolean deleteUser(Long id) {
    	if(userRepo.existsById(id)) {
    	    userRepo.deleteById(id);
    	    return true;
    	}
    	else {
    		return false;
    	}
    }

}
