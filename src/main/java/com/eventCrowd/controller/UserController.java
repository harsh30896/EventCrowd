package com.eventCrowd.controller;

import com.eventCrowd.dto.ApiResponse;
import com.eventCrowd.entity.User;
import com.eventCrowd.enums.ResponseMessage;
import com.eventCrowd.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/user")
public class UserController {

    private UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping("/createUser")
    public ResponseEntity<ApiResponse> createUser(@RequestBody User user){
        if (user.getRole() == null) {
            return new ResponseEntity<>(new ApiResponse(ResponseMessage.CREATION_FAILED.getMessage(),true), HttpStatus.BAD_REQUEST); // Role must be provided
        }
        userService.saveUser(user);
        return new ResponseEntity<>(new ApiResponse(ResponseMessage.USER_CREATI0N.getMessage(),true), HttpStatus.CREATED);
    }

    @PutMapping("/updateUser/{id}")
    public ResponseEntity<ApiResponse> updateUser(@PathVariable("id") Long userId,@RequestBody User user) {
        User updatedUser = userService.updateUser(user,userId);
        return new ResponseEntity<>(new ApiResponse(ResponseMessage.UPDATE_SUCCESS.getMessage(),true),HttpStatus.OK);
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
