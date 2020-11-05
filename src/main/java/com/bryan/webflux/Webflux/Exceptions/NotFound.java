package com.bryan.webflux.Webflux.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class NotFound extends Exception {
    private static final long serialVersionUID = -7717691994704695707L;
    public static final String DESCRIPTION = "not found";

    public NotFound(String message) {
        super(DESCRIPTION + " "+message);
    }
}