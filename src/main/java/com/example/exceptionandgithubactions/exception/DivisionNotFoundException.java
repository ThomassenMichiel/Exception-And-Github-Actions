package com.example.exceptionandgithubactions.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DivisionNotFoundException extends NotFoundException{

    public static final String DIVISION_NOT_FOUND = "Division not found";

    public DivisionNotFoundException(){
        super(DIVISION_NOT_FOUND, DIVISION_NOT_FOUND);
        log.debug(DIVISION_NOT_FOUND);
    }

    public DivisionNotFoundException(String message){
        super(DIVISION_NOT_FOUND, message);
        log.debug(DIVISION_NOT_FOUND);
    }

}
