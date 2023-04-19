package com.example.exceptionandgithubactions.exception;

public class InvalidMembershipLevelException extends BadRequestException {

    public static final String BAD_REQUEST = "Invalid Membership Level";

    public InvalidMembershipLevelException() {
        super(BAD_REQUEST, BAD_REQUEST);
    }
}
