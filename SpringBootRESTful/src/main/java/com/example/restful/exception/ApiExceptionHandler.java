package com.example.restful.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;
import java.util.Map;


@RestControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler({MethodArgumentNotValidException.class, BindException.class})
    public ResponseEntity<?> validation(Exception e) {
        return ResponseEntity.badRequest().body(err("VALIDATION_ERROR", e.getMessage()));
    }
    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<?>runtime(RuntimeException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err("NOT_FOUND", e.getMessage()));
    }
    @ExceptionHandler({Exception.class})
    public ResponseEntity<?> other(Exception e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(err("INTERNAL_SERVER_ERROR", e.getMessage()));
    }



    private Map<String, Object> err(String code, String msg){
        return Map.of("timestamp", Instant.now().toString(),"code", code,"message", msg);
    }

}
