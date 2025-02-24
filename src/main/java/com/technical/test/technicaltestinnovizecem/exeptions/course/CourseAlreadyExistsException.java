package com.technical.test.technicaltestinnovizecem.exeptions.course;

public class CourseAlreadyExistsException extends RuntimeException {
    public CourseAlreadyExistsException(String message) {
        super(message);
    }
}
