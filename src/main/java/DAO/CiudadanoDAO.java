package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.Conexion;
import VO.CiudadanoVO;

public class CiudadanoDAO {

	public void InsertarCiudadano (CiudadanoVO c) {
		try {
			Connection conexion = Conexion.Conectar();
			String sql = "INSERT INTO CIUDADANO (edad, nombreapellido, genero, pais, provincia, ciudad, codigopostal, estadocivil, situacionlaboral) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"; 
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1, c.getEdad());
			stmt.setString(2, c.getNombreApellido());
			stmt.setString(3, c.getGenero());
			stmt.setString(4, c.getPais());
			stmt.setString(5, c.getProvincia());
			stmt.setString(6, c.getCiudad());
			stmt.setString(7, c.getCodigopostal());
			stmt.setString(8, c.getEstadocivil());
			stmt.setString(9, c.getSituacionlaboral());
			stmt.execute();
			stmt.close();
			conexion.close();	
			System.out.println("DATOS INTRODUCIDOS A LA BASE DE DATOS " + "\n" + c.toString());
		} catch (Exception e) {
			System.out.println("ERROR DE INSERCCION DE DATOS");
			e.printStackTrace();
		}
	}
	
	public void ConsultarCiudadano() {
		try {
			Connection conexion = Conexion.Conectar();
			java.sql.Statement stmt = conexion.createStatement();
			ResultSet set = stmt.executeQuery("select * from ciudadano");			
			while (set.next()) {
				
				int IdCiudadano = set.getInt("IdCiudadano");
				String Edad = set.getString("edad");
				String NombreApellido = set.getString("nombreapellido");
				String Genero = set.getString("genero");
				String Pais = set.getString("pais");
				String Provincia = set.getString("provincia");
				String Ciudad = set.getString("ciudad");
				String CodigoPostal = set.getString("codigopostal");
				String EstadoCivil = set.getString("estadocivil");
				String SituacionLaboral = set.getString("situacionlaboral");
				
				System.out.println("------------------------------ ID CIUDADANO NUM " + IdCiudadano +"------------------------------");
				System.out.println("Nombre Completo: " + NombreApellido + "\nEdad: " + 
				Edad + "\nGenero: " + Genero + "\nPais: " + Pais + "\nProvincia: " + Provincia + "\nCiudad: " + Ciudad +
				"\nCodigo Postal: " + CodigoPostal + "\nEstado Civil: " + EstadoCivil + "\nSituacion Laboral: " + SituacionLaboral);
		
			}
			stmt.close();
			set.close();
		} catch (Exception e) {
			System.out.println("ERROR DE CONSULTA DE DATOS");
			e.printStackTrace();
		}
	}
	
		public void EliminarCiudadano (int IdEliminar) {
		
		try {
			Connection conexion = Conexion.Conectar();
		String sql = "DELETE FROM ciudadano where idCiudadano = " + IdEliminar;
		java.sql.Statement stmt = conexion.createStatement();
		stmt.execute(sql);
		System.out.println("DATOS DE CIUDADANO ELIMINADOS");
		stmt.close();
		conexion.close();
		} catch (Exception e) {
			System.out.println("ERROR, DATOS NO ELIMINADOS");
			e.printStackTrace();
		}
		
		
	}
		
		public void EditarCiudad(int idCiudadanoCambiar, CiudadanoVO c) {
			
			Connection conexion = Conexion.Conectar();
			String sql = "UPDATE ciudadano set Edad = '" + c.getEdad()  + "', nombreapellido = '" + c.getNombreApellido()
						 + "', genero = " + c.getGenero() + ",Pais = " + c.getPais() + ", provincia = " + c.getProvincia() + 
						 ", ciudad = " + c.getCiudad() + ", codigopostal = " + c.getCodigopostal() + ", estadocivil = " + c.getEstadocivil() + 
						", situacionlaboral = " + c.getSituacionlaboral() + "WHERE idCiudadano = " + idCiudadanoCambiar; 
						
			try {
				java.sql.Statement stmt = conexion.createStatement();
				stmt.execute(sql);
				System.out.println("DATOS DE CIUDAD CAMBIADOS");
				conexion.close();
				stmt.close();
			} catch (SQLException e) {
				System.out.println("ERROR AL CAMBIAR DATOS DE CIUDAD");
				e.printStackTrace();
			}
			
			
		}
	
	
	
	

	
	
	
}
