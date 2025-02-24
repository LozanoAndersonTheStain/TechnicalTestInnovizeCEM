package com.technical.test.technicaltestinnovizecem.exeptions.teacher;

public class TeacherAlreadyExistsException extends RuntimeException {
    public TeacherAlreadyExistsException(String message) {
        super(message);
    }
}