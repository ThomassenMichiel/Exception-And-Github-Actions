package com.switchfully.pamriksa.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ParentIdCanNotBeNullToCreateASubDivision extends NotFoundException{

    public static final String PARENT_ID_CAN_NOT_BE_NULL = "parent is null";

    public ParentIdCanNotBeNullToCreateASubDivision(){
        super(PARENT_ID_CAN_NOT_BE_NULL, PARENT_ID_CAN_NOT_BE_NULL);
        log.debug(PARENT_ID_CAN_NOT_BE_NULL);
    }

    public ParentIdCanNotBeNullToCreateASubDivision(String message){
        super(PARENT_ID_CAN_NOT_BE_NULL, message);
        log.debug(PARENT_ID_CAN_NOT_BE_NULL);
    }

}
