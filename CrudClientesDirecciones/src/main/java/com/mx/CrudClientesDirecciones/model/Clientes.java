package com.mx.CrudClientesDirecciones.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity//es una tabla
@Table(name = "Clientes")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Clientes {
/*
 * ID          NUMBER PRIMARY KEY NOT NULL,
NOMBRE      VARCHAR2(100) NOT NULL,
APP         VARCHAR2(100) NOT NULL,
APM         VARCHAR2(100) NOT NULL,
CORREO      VARCHAR2(100)NOT NULL,
TELEFONO    NUMBER NOT NULL,
ID_DIRECCION   NUMBER,
FOREIGN KEY (ID_DIRECCION) REFERENCES DIRECCIONES(ID)
 * */
	
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name = "APP")
	private String app;
	@Column(name = "APM")
	private String apm;
	@Column(name = "correo")
	private String correo;
	@Column(name = "telefono")
	private Integer telefono;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_DIRECCION")
	Direcciones direccion;
	
}
