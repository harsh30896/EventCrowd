package com.eventCrowd.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponse {
    private String message;
    private Boolean status;
    public ApiResponse(String message,Boolean status) {
        this.message = message;
        this.status=status;
    }
}
