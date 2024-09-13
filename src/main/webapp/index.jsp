
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.alex.modelo.dto.Contacto"%>
<%@page import="com.alex.modelo.I_Conexion"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="css/cuadricula_prod.css">
<title>Lista De Contactos</title>
</head>
<body>
	<form class="insertar" method="post" action="FormularioContacto"
		enctype="multipart/form-data">

		<H3><label>Nombre:</label></H3>
		<input type="tipo" id="p_nombre" size="tamaño" name="p_nombre" placeholder="Nombre" value="" /> <br>
			
		<H3><label>Apellidos:</label></H3>
		<input type="tipo" id="p_apelldio" size="tamaño" name="p_apelldio" placeholder="Apellidos" /> <br>
			
		<H3><label>Fecha de nacimiento:</label></H3>
		<input type="Date" id="p_fecha" size="tamaño" name="p_fecha" placeholder="2017-06-01" /><br>
		
		<H3><label>Telefono:</label></H3>
		<input type="tipo" id="p_telefono" size="tamaño" name="p_telefono" value="" placeholder="612 33 22 11" /></H3><br> <label>Foto:</label> 
		<br>
		<input type="file" name="p_foto" id="p_foto" required accept="image/*"><br>
		
		<input type="submit" value="Soy un botón submit" /> <br>
			<a href="ObtenerContactosJson"><input type="button" value="Abrir JSON" /></a>
		
	</form>

</body>
</html>