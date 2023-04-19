package com.example.exceptionandgithubactions.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubDivisionNotFoundException extends NotFoundException{

    public static final String SUBDIVISION_NOT_FOUND = "Subdivision not found";

    public SubDivisionNotFoundException(){
        super(SUBDIVISION_NOT_FOUND, SUBDIVISION_NOT_FOUND);
        log.debug(SUBDIVISION_NOT_FOUND);
    }

    public SubDivisionNotFoundException(String message){
        super(SUBDIVISION_NOT_FOUND, message);
        log.debug(SUBDIVISION_NOT_FOUND);
    }
}
