package com.mx.CrudClientesDirecciones.service;

import java.util.List;

import com.mx.CrudClientesDirecciones.model.Clientes;

public interface ClientesServ {

	public List<Clientes> listarClientes();
	public String guardar(Clientes c);
	
}
