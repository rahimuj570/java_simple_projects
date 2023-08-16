package com.resttest.restTest.controller;

public class StudentNotFound extends RuntimeException{
    public StudentNotFound(Long roll) {
        super("The roll number "+roll+" is not found");
    }
}
