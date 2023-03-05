package com.UserService.exception;


import com.UserService.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobleExceptionHandel {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity <ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex){
         String massage = ex.getMessage();
         ApiResponse response =  ApiResponse.builder().massage(massage).succes(true).status(HttpStatus.NOT_FOUND).build();
         return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
    }
}
