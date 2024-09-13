package com.alex.modelo;

import java.sql.Connection;

public interface I_Conexion {

    // Constantes para BD
    String BASE_DATOS = "db_lista_contactos";
    String DRIVER = "com.mysql.jdbc.Driver";
    String CONEXION = "jdbc:mysql://localhost:3306/" + BASE_DATOS;
    String USUARIO = "root";
    String PASS = "1234";

    // Archivos JSP
    String JSP_FORMULARIO = "index.jsp";
    String JSP_CONTACTOS_JSON = "contactos_json.jsp";

    // stored procedures
    String SP_INSERTAR_CONTACTO = "call sp_insertar_contacto(?, ?, ?, ?, ?);";
    String SP_OBTENER_CONTACTOS_JSON = "call sp_obtener_contactos_json();";

    // atributos de la mochila
    String ATR_LISTA_CONTACTOS = "atr_lista_contactos";
}
