package com.eventCrowd.enums;

public enum UserResponseMessage {

    UPDATE_SUCCESS("Update successful"),
    DELETE_SUCCESS("Delete successful"),
    DELETE_FAILED("Delete failed"),
    USER_CREATI0N("User created sucessfully"),
    FAILURE("Operation failed"),
    CREATION_FAILED("User cannot be created");

    private final String message;

    UserResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
