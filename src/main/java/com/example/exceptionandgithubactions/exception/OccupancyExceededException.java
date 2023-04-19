package com.example.exceptionandgithubactions.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OccupancyExceededException extends BadRequestException {
    public static final String OCCUPANCY_EXCEEDED = "The current occupancy of this parking lot has been exceeded";

    public OccupancyExceededException() {
        super(OCCUPANCY_EXCEEDED, OCCUPANCY_EXCEEDED);
        log.debug(OCCUPANCY_EXCEEDED);
    }

    public OccupancyExceededException(String message) {
        super(OCCUPANCY_EXCEEDED, message);
        log.debug(OCCUPANCY_EXCEEDED);
    }
}
