package com.eventCrowd.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String,Object>> handlerException(RuntimeException ex){
        Map<String,Object> response=new HashMap<>();
        response.put("message",ex.getMessage());
        response.put("status",false);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
