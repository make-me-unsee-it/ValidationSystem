package com.exception;

public class ValidationFailedException extends Exception {
    public ValidationFailedException(String msg) {
        super(msg);
    }
}
