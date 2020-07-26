package tn.zelda.projects.spring.stockservice.exception;

public class ApiBadRequestException extends Exception {
    public ApiBadRequestException(String message) {
        super(message);
    }
}
