package com.example.Inversiones.configuration;

import com.example.Inversiones.controller.InversionesExito;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class InversionesExitoHandler extends ResponseEntityExceptionHandler {
   // @ExceptionHandler({InversionesExito.class})
    //protected ResponseEntity<Object> handleNotFound(
      //      Exception ex, WebRequest request){
        //return handleExceptionInternal(ex,"Exito",
          //      new HttpHeaders(), HttpStatus.ACCEPTED, request);
    //}
}
