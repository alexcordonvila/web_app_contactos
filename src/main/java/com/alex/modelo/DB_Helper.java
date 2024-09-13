package com.alex.modelo;
import org.json.JSONArray;
import org.json.JSONObject;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alex.modelo.dto.Contacto;

public class DB_Helper implements I_Conexion, I_Metodos {
	@Override
	public Connection conectar() {
		
		Connection con = null;
		
		try {
			Class.forName(DRIVER);
			con= DriverManager.getConnection(CONEXION, USUARIO ,PASS );
			System.out.println("BD conectada");
			
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR DE BD");
			System.out.println("No se encontro el driver");
			System.out.println(e.getMessage());
			
		} catch (SQLException e) {
			System.out.println("ERROR DE BD");
			System.out.println("No se pudo conectar a la BD");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("ERROR DE BD");
			System.out.println("Error desconocido");
			System.out.println(e.getMessage());
		}
		
		return con;
	}
	
	@Override
	public void desconectar(Connection con) {
		
		try {
			con.close();
			System.out.println("BD desconectada");
		} catch (SQLException e) {
			System.out.println("ERROR DE BD");
			System.out.println("No se pudo desconectar de la BD");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("ERROR DE BD");
			System.out.println("Error desconocido");
			System.out.println(e.getMessage());
		}
	}


	@Override
	public int insertarContacto(Connection con, Contacto contactoInsertar) {
		try {
			//call sp_insertar_contacto(nombre,apellidos, fecha nacimiento, telefono, foto);
			CallableStatement cStmt = con.prepareCall(SP_INSERTAR_CONTACTO);

			cStmt.setString(1, contactoInsertar.getNombre());
			cStmt.setString(2, contactoInsertar.getApellidos());
			cStmt.setDate(3, Date.valueOf(contactoInsertar.getFecha_nacimiento()));
			cStmt.setString(4, contactoInsertar.getTelefono());
			cStmt.setString(5, contactoInsertar.getFoto());
		
			return cStmt.executeUpdate();	
		} catch (SQLException e) {
			System.out.println("ERROR DE BD: INSERTAR CONTACTO");
			System.out.println("No se pudo insertar el contacto");
			
			return 0;
		}
	}

	public List<Contacto> obtenerContactosJson(Connection con) {
		List<Contacto> lista = new ArrayList<Contacto>();
		try {
			CallableStatement cStmt = con.prepareCall(SP_OBTENER_CONTACTOS_JSON);
				
			boolean hasResults  = cStmt.execute();

			if (hasResults) {
				StringBuilder nombres = new StringBuilder();
                try (ResultSet rs = cStmt.getResultSet()) {                                  
                     while (rs.next()) {
                    	 String contactosJsonString = rs.getString("contactos_json");
                         JSONArray jsonArray = new JSONArray(contactosJsonString);
          				System.out.println(contactosJsonString);

                         // Iterar a través del JSONArray
                         for (int i = 0; i < jsonArray.length(); i++) {
                        	 Contacto cont = new Contacto();
                             JSONObject jsonObject = jsonArray.getJSONObject(i);
                            
                             String nombre = jsonObject.getString("nombre");
                             cont.setNombre(nombre);
                             
                             String apellido = jsonObject.getString("apellidos");
                             cont.setApellidos(apellido);
                             
                             String fecha_nacimiento = jsonObject.getString("fecha_nacimiento");
                             cont.setFecha_nacimiento(fecha_nacimiento);
                             
                             String telefono = jsonObject.getString("telefono");
                             cont.setTelefono(telefono);
                            
                             String foto = jsonObject.getString("foto");
                             if(foto != null) {                            	 
                            	 cont.setFoto(foto);
                             }else {
                            	 foto = "";
                             }
                             
                             lista.add(cont);
                         }
                    }  
                     //System.out.println("Lista de todos los Productos obtenida:");
     				//System.out.println(lista);
     				
     				return lista;
                }
            }else {
            	System.out.println("No se pudo obtener una lista de contactos");
				System.out.println("El Stored procedure no tiene un RESULTSET");
            	return new ArrayList<Contacto>();
            }
        } catch (SQLException e) {
        	System.out.println("ERROR DE BD: OBTENER CONTACTO");
			System.out.println("No se han podido obtener los contactos");
            e.printStackTrace();
            return new ArrayList<Contacto>();	
        }
		
	}
}
