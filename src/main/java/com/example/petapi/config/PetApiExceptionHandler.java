package com.example.petapi.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PetApiExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handle(Exception ex, HttpServletRequest request, HttpServletResponse response) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
