package com.grootan.jwtrolebasedauthorization.exceptions;

import org.springframework.http.HttpStatus;

public class CustomSecurityException extends RuntimeException {
    private String message;
    private HttpStatus httpStatus;

    public CustomSecurityException(String message) {
        this.message = message;
    }
    public CustomSecurityException(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
