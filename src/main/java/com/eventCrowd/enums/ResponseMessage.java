package com.eventCrowd.enums;

public enum ResponseMessage {

    UPDATE_SUCCESS("Update successful"),
    DELETE_SUCCESS("Delete successful"),
    CREATE_SUCCESS("Creation successful"),
    USER_CREATI0N("User created sucessfully"),
    FAILURE("Operation failed"),
    CREATION_FAILED("User cannot be created");

    private final String message;

    ResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
