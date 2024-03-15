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

import com.mx.CrudClientesDirecciones.model.Direcciones;
import com.mx.CrudClientesDirecciones.service.DireccionesServImp;

@RestController
@RequestMapping(path = "DireccionesWs")
@CrossOrigin
public class DireccionesWs {

	//Inyectamos dependencias
	@Autowired
	DireccionesServImp diseim;
	
	//url: http://localhost:9000/DireccionesWs/listar
	@GetMapping(path = "listar")
	public List<Direcciones> listar(){
		return diseim.listarDirecciones();
	}
	
	//url: http://localhost:9000/DireccionesWs/guardar
	@PostMapping(path = "guardar")
	public ResponseEntity<String> guardar(@RequestBody Direcciones d){
		String res = diseim.guardar(d);
		
		if(res.equals("idExiste")) {
			return new ResponseEntity<String>("Ese id ya existe",HttpStatus.OK);
		}else
		{
			return new ResponseEntity<String>("Se Ingreso registro",HttpStatus.OK);
		}
		
	}
	
	
}
