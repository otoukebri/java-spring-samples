package tn.zelda.projects.spring.stockservice.exception;

public class ApiConflictException extends Exception {

    public ApiConflictException(String message) {
        super(message);
    }
}
