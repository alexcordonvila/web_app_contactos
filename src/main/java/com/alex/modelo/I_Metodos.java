package com.alex.modelo;

import java.sql.Connection;
import java.util.List;

import com.alex.modelo.dto.Contacto;

public interface I_Metodos {
	
	public Connection conectar();
	public void desconectar(Connection con);
	
	int insertarContacto(Connection con, Contacto contactoInsertar);
	List<Contacto> obtenerContactosJson(Connection con);
}
