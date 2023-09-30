package Servlets;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CiudadanoDAO;
import VO.CiudadanoVO;


public class FormularioCiudadano extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FormularioCiudadano() {}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String edad = request.getParameter("edad");
		String nombreapellido = request.getParameter("nombreapellido");
		String genero = request.getParameter("genero");
		String pais = request.getParameter("pais");
		String provincia = request.getParameter("provincia");
		String ciudad = request.getParameter("ciudad");
		String codigopostal = request.getParameter("codigopostal");
		String estadocivil = request.getParameter("estadocivil");
		String situacionlaboral = request.getParameter("situacionlaboral");
		
		CiudadanoDAO CDAO = new CiudadanoDAO();
		CiudadanoVO C1 = new CiudadanoVO(edad, nombreapellido, genero, pais, provincia, ciudad, codigopostal, estadocivil, situacionlaboral);
		CDAO.InsertarCiudadano(C1);
		
		if (edad.isEmpty() && nombreapellido.isEmpty() && genero.isEmpty() && pais.isEmpty() && provincia.isEmpty() && codigopostal.isEmpty() && estadocivil.isEmpty() && situacionlaboral.isEmpty()) {
			request.setAttribute("mensajeTodoVacio", "Olvidaste Ingresar Datos En Los Todos Los Campos");
			request.getRequestDispatcher("Formulario.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
