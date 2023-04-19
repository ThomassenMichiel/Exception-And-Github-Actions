package com.example.exceptionandgithubactions.exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends CustomException {
    public BadRequestException(String title, String message) {
        super(HttpStatus.BAD_REQUEST, title, message);
    }
}
