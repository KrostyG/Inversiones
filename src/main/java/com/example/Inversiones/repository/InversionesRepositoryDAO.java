package com.example.Inversiones.repository;

import com.example.Inversiones.entity.Inversiones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InversionesRepositoryDAO extends CrudRepository<Inversiones, Integer> {

    List<Inversiones> findByIdUsuario(Integer idUsuario);



}

