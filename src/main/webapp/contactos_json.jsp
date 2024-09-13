<%@page import="com.alex.modelo.I_Conexion"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.alex.modelo.dto.Contacto"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	
<% 
List<Contacto> listaContactos= new ArrayList<Contacto>();
if(request.getAttribute(I_Conexion.ATR_LISTA_CONTACTOS)!=null){
	listaContactos=(List)request.getAttribute(I_Conexion.ATR_LISTA_CONTACTOS);
}else{
	//TAREA PARA METER EN EL LOG
}
%> 	
	
	
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<meta charset="UTF-8">
<title>Contactos en JSON</title>
</head>
<body>
<table class="tabla">
  <caption>
    Lista de contactos JSON
  </caption>
  <thead>
    <tr>
      <th scope="col"><h2>Nombre</h2></th>
      <th scope="col"><h2>Apellidos</h2></th>
      <th scope="col"><h2>Fecha Nacimiento</h2></th>
      <th scope="col"><h2>Telefono</h2></th>
       <th scope="col"><h2>Foto</h2></th>
    </tr>
  </thead>
  <tbody>
  <%for(Contacto elem:listaContactos ){%>
    <tr>
      <th scope="row"><%=elem.getNombre()%></th>
      <td><%=elem.getApellidos()%></td>
      <td><%=elem.getFecha_nacimiento()%></td>
      <td><%=elem.getTelefono()%></td>
      <td><%=elem.getFoto()%></td>
    </tr>
    <%}%>
  </tbody>
  <tfoot>
    <tr>
      <th scope="row" colspan="2"># Contactos:</th>
      <td><%=listaContactos.size()%></td>
    </tr>
  </tfoot>
</table>
	
</body>
</html>