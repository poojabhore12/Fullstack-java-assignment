package com.example.demo.controller;

public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L; // Add this line

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
