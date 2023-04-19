package com.switchfully.pamriksa.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserNotFoundException extends NotFoundException {
    public static final String USER_NOT_FOUND = "User not found";

    public UserNotFoundException() {
        super(USER_NOT_FOUND, USER_NOT_FOUND);
        log.debug(USER_NOT_FOUND);
    }

    public UserNotFoundException(String message) {
        super(USER_NOT_FOUND, message);
        log.debug(USER_NOT_FOUND);
    }
}
