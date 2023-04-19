package com.switchfully.pamriksa.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j  // lombok annotation for logger -> shortcut for loggerfactory...
public class CanNotFindParkingLotException extends NotFoundException {
    public static final String PARKING_LOT_NOT_FOUND = "parking lot not found";

    public CanNotFindParkingLotException() {
        super(PARKING_LOT_NOT_FOUND, PARKING_LOT_NOT_FOUND);
        log.debug(PARKING_LOT_NOT_FOUND);
    }

    public CanNotFindParkingLotException(String message) {
        super(PARKING_LOT_NOT_FOUND, message);
        log.debug(PARKING_LOT_NOT_FOUND);
    }
}
