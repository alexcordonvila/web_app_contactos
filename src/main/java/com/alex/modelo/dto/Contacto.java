package com.alex.modelo.dto;

import java.sql.Date;

public class Contacto {
	
	private int id;
	private String nombre;
	private String apellidos;
	private String fecha_nacimiento;
	private String telefono;
	private String foto;
	public Contacto(int id, String nombre, String apellidos, String fecha_nacimiento, String telefono, String foto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		this.telefono = telefono;
		this.foto = foto;
	}
	
	public Contacto() {
		super();
		this.id = 0;
		this.nombre = "";
		this.apellidos = "";
		this.fecha_nacimiento = "";
		this.telefono = "";;
		this.foto = "";
	}
	
	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nacimiento="
				+ fecha_nacimiento + ", telefono=" + telefono + ", foto=" + foto + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}


}
