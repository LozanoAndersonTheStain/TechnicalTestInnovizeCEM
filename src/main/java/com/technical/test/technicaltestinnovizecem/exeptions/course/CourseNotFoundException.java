package com.technical.test.technicaltestinnovizecem.exeptions.course;

public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(String message) {
        super(message);
    }
}
