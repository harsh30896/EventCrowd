package com.eventCrowd.controller;

import com.eventCrowd.dto.ApiResponse;
import com.eventCrowd.entity.User;
import com.eventCrowd.enums.ResponseMessage;
import com.eventCrowd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<ApiResponse> createUser(@RequestBody User user){
        if (user.getRole() == null) {
            return new ResponseEntity<>(new ApiResponse(ResponseMessage.CREATION_FAILED.getMessage()), HttpStatus.BAD_REQUEST); // Role must be provided
        }
        User createdUser = userService.saveUser(user);
        return new ResponseEntity<>(new ApiResponse(ResponseMessage.USER_CREATI0N.getMessage()), HttpStatus.CREATED);
    }

    @PutMapping("/updateUser/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long userId,User user) {
        User updatedUser = userService.updateUser(user,userId);
        return new ResponseEntity<>(updatedUser,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteUser(@PathVariable Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @GetMapping("/getMapping")
    public List<User> getAllUsers(){
        List<User> allUser = userService.findAllUsers();
        return allUser;
    }
}
