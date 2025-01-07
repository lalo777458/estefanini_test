package com.test.estefanini.entity.dto;

import java.util.Date;

import com.test.estefanini.entity.Person;

public class PersonDto {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String nombre;

	private String apellido;

	private Date fechaNacimiento;

	private String puesto;

	private Double sueldo;

	public PersonDto() {
		super();
	}

	
	public PersonDto(Person obj) {
		super();
		this.id = obj.getId();
		this.nombre = obj.getNombre();
		this.apellido = obj.getApellido();
		this.fechaNacimiento = obj.getFechaNacimiento();
		this.puesto = obj.getPuesto();
		this.sueldo = obj.getSueldo();
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
