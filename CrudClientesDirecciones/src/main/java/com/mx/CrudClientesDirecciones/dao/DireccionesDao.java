package com.mx.CrudClientesDirecciones.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.CrudClientesDirecciones.model.Direcciones;

public interface DireccionesDao extends JpaRepository<Direcciones, Integer> {

}
