package com.mx.CrudClientesDirecciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudClientesDirecciones.dao.DireccionesDao;
import com.mx.CrudClientesDirecciones.model.Direcciones;

@Service
public class DireccionesServImp implements DireccionesServ {

	// inyeccion de dependencias
	@Autowired
	DireccionesDao direcciondao;

	@Transactional(readOnly = true)
	@Override
	public List<Direcciones> listarDirecciones() {
		// TODO Auto-generated method stub

		return direcciondao.findAll();
	}

	@Override
	public String guardar(Direcciones d) {
		// TODO Auto-generated method stub

		String res = "";
		boolean bandera = false;
		for (Direcciones ld : direcciondao.findAll()) {

			if (ld.getId() == d.getId()) {
				res = "idExiste";
				bandera = true;
			}

		}

		if (bandera == false) {
			res = "se guardo";
			direcciondao.save(d);
		}
		return res;
	}

}
