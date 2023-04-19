package com.switchfully.pamriksa.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ValidationFieldError {
    private String field;
    private String objectName;
    private String defaultMessage;
}
