package com.puttuboi.EurekaClient.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(CentralExceptionHandler.class);

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<?> handleEntityNotFoundException(EntityNotFoundException exception){
        logger.error("Resource not Found: ",exception.getMessage());
        return new ResponseEntity(exception.getMessage(),HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<?> handleBadRequestException(BadRequestException exception){
        logger.error("Recived Bad Request: ",exception.getMessage());
        return new ResponseEntity(exception.getMessage(),HttpStatus.BAD_REQUEST);
    }
    
}
