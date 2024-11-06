package com.eventCrowd.enums;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;

public enum BookingResponseMessage {
	BOOKING_CREATION("Booking created sucessfully"),
	BOOKING_DELETION("Booking deleted sucessfully"),
	BOOKING_UPDATED("Booking updaed sucessfully"),
	BOOKING_FAILED("Booking cannot be made");
	
	private String message;
	
	BookingResponseMessage(String message) {
	        this.message = message;
	    }

	    public String getMessage() {
	        return message;
	    }
}
