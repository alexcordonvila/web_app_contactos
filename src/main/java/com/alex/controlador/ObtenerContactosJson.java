package com.alex.controlador;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alex.modelo.DB_Helper;
import com.alex.modelo.I_Conexion;
import com.alex.modelo.dto.Contacto;

/**
 * Servlet implementation class ObtenerContactosJson
 */
@WebServlet("/ObtenerContactosJson")
public class ObtenerContactosJson extends HttpServlet implements I_Conexion{
	private static final long serialVersionUID = 1L;
       

    public ObtenerContactosJson() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("VAMO A LEER LA BASE DE DATOS");
		//3 Creo el objeto base de datos y lo uso
		DB_Helper db = new DB_Helper();
		Connection con = db.conectar();
		
		//4 Actuar en la base de datos
		List<Contacto> listaContactos = db.obtenerContactosJson(con);
		System.out.println("HEY:"+listaContactos);
		//5 Desconecto la base de datos
		db.desconectar(con);
		//Pasar valores al jsp
		request.setAttribute(ATR_LISTA_CONTACTOS, listaContactos);
		
		// TODO Auto-generated method stub
		request.getRequestDispatcher(JSP_CONTACTOS_JSON).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
