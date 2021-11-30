package com.example.Inversiones.repository;

import com.example.Inversiones.entity.Tasa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TasaRepositorioDAO extends CrudRepository<Tasa, Integer> {
}
