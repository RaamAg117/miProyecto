package com.mx.CrudClientesDirecciones.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.CrudClientesDirecciones.model.Clientes;

public interface ClientesDao extends JpaRepository<Clientes, Integer>{

}
