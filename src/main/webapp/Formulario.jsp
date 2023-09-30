<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Informacion De Ciudadano</title>
</head>
<body>

<h2>Bienvenido Al Sector De Tramite Para El Renovamiento Del DNI (Documento Nacional De Identidad)</h2>

<h3>Ingrese Sus Datos</h3>

<form action = "FormularioCiudadano" method ="get">

<label for = "edad">Ingresa Tu Edad</label> <br> 
<input type = "number" name = "edad" id = "edad" placeholder = "Ingresa Edad" required> <br> <br>

<label for = "nombreapellido">Ingresa Tu Nombre Completo</label> <br>
<input type = "text" name = "nombreapellido" id = "nombreapellido" placeholder = "Ingresa Tu Nombre" required> <br> <br>

<label for = "genero">Ingrese Genero</label> <br>
<input type = "text" name = "genero" id = "genero" placeholder = "Ingrese Genero" required> <br> <br>
 
<label for = "pais">Ingrese Pais</label> <br>
<input type = "text" name = "pais" id = "pais" placeholder = "Ingrese Pais" required> <br> <br>

<label for = "provincia">Ingrese Provincia</label> <br>
<input type = "text" name = "provincia" id = "provincia" placeholder = "Ingrese Provincia " required> <br> <br>

<label for = "ciudad">Ingrese Ciudad</label> <br>
<input type = "text" name = "ciudad" id = "ciudad" placeholder = "Ingrese Ciudad" required> <br> <br>

<label for = "codigopostal">Ingrese Codigo Postal</label> <br>
<input type = "number" name = "codigopostal" id = "codigopostal" placeholder = "Ingrese Codigo Postal" required> <br> <br>

<label for = "estadocivil">Ingrese Estado Civil</label> <br>
<input type = "text" name = "estadocivil" id = "estadocivil" placeholder= "Ingrese Estado Civil" required> <br> <br>

<label for = "situacionlaboral">Ingrese Situacion Laboral</label> <br>
<input type = "text" name = "situacionlaboral" id = "situacionlaboral" placeholder="Ingrese Situacion Laboral" required> <br> <br>

<button type = "submit">Ingresar Datos</button>

</form>

<%

String mensajetodovacio = (String) request.getAttribute("mensajeTodoVacio");

if (mensajetodovacio != null){
	out.print("<h3>" + mensajetodovacio + " </h3>");
} 

%>




</body>
</html>