package com.example.exceptionandgithubactions.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LicensePlateException extends BadRequestException {
    public static final String LICENSE_PLATE_DOESNT_MATCH = "Your current membership level does not allow for multiple license plates";

    public LicensePlateException() {
        super(LICENSE_PLATE_DOESNT_MATCH, LICENSE_PLATE_DOESNT_MATCH);
        log.debug(LICENSE_PLATE_DOESNT_MATCH);
    }

    public LicensePlateException(String message) {
        super(LICENSE_PLATE_DOESNT_MATCH, message);
        log.debug(LICENSE_PLATE_DOESNT_MATCH);
    }
}
