package com.example.Inversiones.controller;

import com.example.Inversiones.entity.Tasa;
import com.example.Inversiones.service.TasaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasas")
public class TasaControlador {
    @Autowired
    TasaServicio tasaServicio;

    @PostMapping("/crear")
    public ResponseEntity<String> crearTasas(){
        if(tasaServicio.crearTasas()){
            return new ResponseEntity<>("Se crearon las tasas", HttpStatus.OK);
        }
        return new ResponseEntity<>("Fallo al crear las tasas", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/verTodas")
    public ResponseEntity<List> encontrarTodasLasTasas(){
        List<Tasa> tasas = tasaServicio.encontrarTodasLasTasas();
        if(tasas.isEmpty()){
            return new ResponseEntity<>(tasas, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(tasas, HttpStatus.OK);
    }
}
