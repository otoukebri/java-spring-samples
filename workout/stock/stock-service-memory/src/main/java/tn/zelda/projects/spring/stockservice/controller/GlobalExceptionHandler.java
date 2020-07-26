package tn.zelda.projects.spring.stockservice.controller;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import tn.zelda.projects.spring.stockservice.exception.ApiBadRequestException;
import tn.zelda.projects.spring.stockservice.exception.ApiConflictException;
import tn.zelda.projects.spring.stockservice.exception.ApiInternalServerException;
import tn.zelda.projects.spring.stockservice.exception.ApiNotFoundException;
import tn.zelda.projects.spring.stockservice.model.ApiError;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
@RestController
public class GlobalExceptionHandler {


    @ExceptionHandler(ApiNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    private ApiError handleStock(ApiNotFoundException apiNotFoundException) {
        return new ApiError(404, apiNotFoundException.getMessage());
    }


    @ExceptionHandler(ApiConflictException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    private ApiError handleStock(ApiConflictException apiConflictException) {
        return new ApiError(409, apiConflictException.getMessage());
    }

    @ExceptionHandler(ApiInternalServerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    private ApiError handleStock(ApiInternalServerException apiInternalServerException) {
        return new ApiError(500, apiInternalServerException.getMessage());
    }

    @ExceptionHandler(ApiBadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    private ApiError handleStock(ApiBadRequestException apiBadRequestException) {
        return new ApiError(400, apiBadRequestException.getMessage());
    }
}
