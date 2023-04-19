package com.switchfully.pamriksa.exception;

import org.springframework.http.HttpStatus;

public class InvalidMembershipLevelException extends BadRequestException {

    public static final String BAD_REQUEST = "Invalid Membership Level";

    public InvalidMembershipLevelException() {
        super(BAD_REQUEST, BAD_REQUEST);
    }
}
