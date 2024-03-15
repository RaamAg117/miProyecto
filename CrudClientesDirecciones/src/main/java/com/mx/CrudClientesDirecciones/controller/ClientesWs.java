package com.mx.CrudClientesDirecciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudClientesDirecciones.model.Clientes;
import com.mx.CrudClientesDirecciones.service.ClientesServImp;

@RestController
@RequestMapping(path = "ClientesWs")
@CrossOrigin
public class ClientesWs {

	@Autowired
	ClientesServImp clseim;

	// url: http://localhost:9000/ClientesWs/listar
	@GetMapping(path = "listar")
	public List<Clientes> listar() {
		return clseim.listarClientes();
	}

	// url: http://localhost:9000/ClientesWs/guardar
	@PostMapping(path = "guardar")
	public ResponseEntity<String> guardar(@RequestBody Clientes d) {
		String res = clseim.guardar(d);

		if (res.equals("idExiste")) {
			return new ResponseEntity<String>("Ese id de cliente ya existe", HttpStatus.OK);
		} else if (res.equals("DireccionExiste")) {
			return new ResponseEntity<String>("Se Ingreso registro de cliente", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("No existe la direccion", HttpStatus.OK);
		}

	}
}
