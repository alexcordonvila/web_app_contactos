package com.alex.controlador;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.alex.modelo.I_Conexion;
import com.alex.modelo.dto.Contacto;
import com.alex.modelo.DB_Helper;


@WebServlet("/FormularioContacto")
@MultipartConfig(
		  fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
		  maxFileSize = 1024 * 1024 * 2,      // 2 MB
		  maxRequestSize = 1024 * 1024 * 10   // 10 MB
		)
public class FormularioContacto extends HttpServlet implements I_Conexion {
	private static final long serialVersionUID = 1L;
       

    public FormularioContacto() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1 Obtengo los parametros del formulario
		System.out.println("AHORA TOCA RELLENAR LA BASE DE DATOS");
		
		//1 recepcion de parametros
				String nombre = "";
				if(request.getParameter("p_nombre")!=null) {
					nombre=request.getParameter("p_nombre");
					if (nombre.length()>45) {
						nombre=nombre.substring(0, 45);
					}
				}
				String apellidos = "";
				if(request.getParameter("p_apelldio")!=null) {
					apellidos=request.getParameter("p_apelldio");
					if (apellidos.length()>45) {
						apellidos=apellidos.substring(0, 45);
					}
				}
		
				String fecha = "";
				if(request.getParameter("p_fecha")!=null) {
					fecha=request.getParameter("p_fecha");
					if (fecha.length()>45) {
						fecha=fecha.substring(0, 45);
					}
				}
				
				String telefono = "";
				if(request.getParameter("p_telefono")!=null) {
					telefono=request.getParameter("p_telefono");
					if (apellidos.length()>45) {
						telefono=telefono.substring(0, 45);
					}
				}
				
				//guardado de la imagen
				
				Part filePart = request.getPart("p_foto");
				String fileName = filePart.getSubmittedFileName();
				
				 // Obtén el directorio de la aplicación web
	            //String appPath = request.getServletContext().getRealPath("");
				String appPath = "C:\\Users\\Usuario\\eclipse-workspace\\LISTA_CONTACTOS\\src\\main\\webapp";
	            String savePath = appPath + "\\img";
	         // Crea el directorio si no existe
	            File fileSaveDir = new File(savePath);
	            if (!fileSaveDir.exists()) {
	                fileSaveDir.mkdirs();
	            }
	            
				String foto = "";
				if (fileName!=null) {
					foto=fileName;
				}
				
				if (foto != "" && nombre != "" && apellidos != "" && fecha != "" && telefono != "") {
					for (Part part : request.getParts()) {
						 part.write(savePath + File.separator +fileName);
						 System.out.println(savePath + File.separator + fileName);
						//part.write("C:\\fotosContactos" +fileName);

					}
				}
		//2 Maqueteado de los datos para ser enviados a la base de datos
		Contacto contactoInsertar= new Contacto(0,nombre, apellidos, fecha, telefono, foto);
		//3 Creo el objeto base de datos y lo uso
				DB_Helper db = new DB_Helper();
				Connection con = db.conectar();
		//4 Actuar en la base de datos
				int resultadoInsert=db.insertarContacto(con, contactoInsertar);
		
		//5 Desconecto la base de datos
				db.desconectar(con);
		//6 Seteo los atributos para el JSP
		//7 viaje
				request.getRequestDispatcher(JSP_FORMULARIO).forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
