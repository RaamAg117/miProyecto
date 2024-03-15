	package com.mx.CrudClientesDirecciones.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "DIRECCIONES")///Esta es mi tabla fuerte
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Direcciones {

	/*
	 * ID          NUMBER PRIMARY KEY NOT NULL,
DIRECCION   VARCHAR2(100)NOT NULL,
CIUDAD      VARCHAR2(100)NOT NULL,
ESTADO      VARCHAR2(100)NOT NULL,
PAIS        VARCHAR2(100)
	 * */
	///Mapear la tabla
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "DIRECCION")
	private String nomdireccion;
	@Column(name="CIUDAD")
	private String ciudad;
	@Column(name = "ESTADO")
	private String estado;
	@Column(name = "PAIS")
	private String pais;
	
	@OneToMany(mappedBy = "direccion",cascade = CascadeType.ALL)
	@JsonIgnore
	List<Clientes> cliente = new ArrayList<>();
	
}
