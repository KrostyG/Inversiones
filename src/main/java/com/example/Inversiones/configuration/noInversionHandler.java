package com.example.Inversiones.configuration;

import com.example.Inversiones.controller.noInversion;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class noInversionHandler extends ResponseEntityExceptionHandler {
    //@ExceptionHandler({noInversion.class})
    //protected ResponseEntity<Object> handleNotFound(
      //      Exception ex, WebRequest request){
        //return handleExceptionInternal(ex,"No tiene ninguna inversion",
          //      new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    //}
}
