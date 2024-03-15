package com.mx.CrudClientesDirecciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudClientesDirecciones.dao.ClientesDao;
import com.mx.CrudClientesDirecciones.dao.DireccionesDao;
import com.mx.CrudClientesDirecciones.model.Clientes;
import com.mx.CrudClientesDirecciones.model.Direcciones;

@Service
public class ClientesServImp implements ClientesServ {

	// inyeccion de dependcias
	@Autowired
	ClientesDao clientesdao;
	@Autowired
	DireccionesDao direccionesdao;

	@Transactional(readOnly = true)
	@Override
	public List<Clientes> listarClientes() {
		// TODO Auto-generated method stu
		return clientesdao.findAll();
	}

	@Override
	public String guardar(Clientes c) {
		// TODO Auto-generated method stub
		String res = "";
		boolean banderaC = false;
		boolean banderaD = false;
		for (Direcciones ld : direccionesdao.findAll()) {

			if (ld.getId() == c.getDireccion().getId()) {
				res = "DireccionExiste";

				banderaD = true;

				for (Clientes lc : clientesdao.findAll()) {

					if (lc.getId() == c.getId()) {
						res = "idExiste";
						banderaC = true;
						break;
					}
				}
				break;
			}
			

		}

		if (banderaD == false) {

			res = "DireccionNo";
			banderaC = true;
			
		} else if (banderaC == false) {
			clientesdao.save(c);
		}
		return res;
	}

}
