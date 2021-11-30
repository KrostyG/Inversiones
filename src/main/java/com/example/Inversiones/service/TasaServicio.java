package com.example.Inversiones.service;

import com.example.Inversiones.entity.Tasa;
import com.example.Inversiones.repository.TasaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasaServicio {
    @Autowired
    TasaRepositorio tasaRepositorio;

    public boolean crearTasas(){
        return tasaRepositorio.crearTasas();
    }

    public List<Tasa> encontrarTodasLasTasas(){
        return tasaRepositorio.encontrarTodasLasTasas();
    }
}
