package com.si.rdog.service;

public class NoSuchDogException extends RuntimeException {
    public NoSuchDogException(String errorMessage) {
        super(errorMessage);
    }
}
