package com.example.exceptionandgithubactions.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class ApiError {
    private String title;
    private String message;
    private String status;
    private int code;
}
