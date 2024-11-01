package com.eventCrowd.exceptionHandler;

import com.eventCrowd.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ApiResponse> handlerException(RuntimeException ex){
        ApiResponse response= getApiResponse(ex);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handleResourceNotFound(ResourceNotFoundException ex){
        ApiResponse response= getApiResponse(ex);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    private ApiResponse getApiResponse(Exception e){
        ApiResponse response=new ApiResponse();
        response.setMessage(e.getMessage());
        response.setStatus(false);
        return  response;
    }
}
