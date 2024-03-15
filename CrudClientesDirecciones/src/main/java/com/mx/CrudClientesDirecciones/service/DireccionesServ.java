package com.mx.CrudClientesDirecciones.service;

import java.util.List;

import com.mx.CrudClientesDirecciones.model.Direcciones;

public interface DireccionesServ {

	public List<Direcciones> listarDirecciones();
	public String guardar(Direcciones d);
	
}
