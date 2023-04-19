package com.switchfully.pamriksa.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;


@RestControllerAdvice
public class ControllerExceptionAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ApiError> handleCustomException(CustomException ex) {
        if (ex.getStatus().is5xxServerError()) {
            logger.error(ex, ex);
        } else {
            logger.warn(ex, ex);
        }

        return new ResponseEntity<>(
                ApiError.builder()
                        .title(ex.getTitle())
                        .message(ex.getMessage())
                        .status(ex.getStatus().name())
                        .code(ex.getStatus().value())
                        .build(),
                ex.getStatus()
        );
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        List<ValidationFieldError> details = new ArrayList<>();
        for (ObjectError objectError : ex.getBindingResult().getAllErrors()) {
            if (objectError instanceof FieldError error) {
                details.add(new ValidationFieldError(error.getField(), error.getObjectName(), error.getDefaultMessage()));
            }
        }
        ValidationError apiError = new ValidationError(HttpStatus.BAD_REQUEST.getReasonPhrase(), "Validation failed", HttpStatus.BAD_REQUEST.name(), status.value(), details);
        return new ResponseEntity<>(apiError, status);
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<String> handleException(AccessDeniedException ex) {
        logger.warn(ex, ex);
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler
    public ResponseEntity<String> handleException(Exception ex) {
        logger.warn(ex, ex);
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
