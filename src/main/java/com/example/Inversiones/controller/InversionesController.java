package com.example.Inversiones.controller;

import com.example.Inversiones.entity.Inversiones;
import com.example.Inversiones.service.InversionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiInversiones")
public class InversionesController {
    private Integer idUsuario;
    private List<Inversiones> cuentaCliente;
    private  Integer idCuenta;

    @Autowired
    private InversionesService inversionesService;

    @PostMapping("/crear")
    public ResponseEntity<String> crearNuevaCuenta(@RequestBody Inversiones inversiones) {
        if (inversionesService.crearNuevaInversion(inversiones)) {
            return new ResponseEntity<>("Transaccion Finalizada", HttpStatus.OK);
        }
        return new ResponseEntity<>("Transaccion Fallida", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/listarinversiones")
    public ResponseEntity<List> listaInversionesPorId(){
        List<Inversiones> inversiones = inversionesService.listaInversionesPorId();
        if(inversiones.isEmpty()){
            return new ResponseEntity<>(inversiones, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(inversiones, HttpStatus.OK);

    }
}
