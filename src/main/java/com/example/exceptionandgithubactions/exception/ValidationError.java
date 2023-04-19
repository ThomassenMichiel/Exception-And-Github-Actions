package com.example.exceptionandgithubactions.exception;

import lombok.Getter;

import java.util.List;

@Getter
public class ValidationError extends ApiError {
    private final List<ValidationFieldError> details;

    public ValidationError(String title, String message, String status, int code, List<ValidationFieldError> details) {
        super(title, message, status, code);
        this.details = details;
    }
}
