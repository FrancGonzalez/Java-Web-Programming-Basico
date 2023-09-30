package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

@SuppressWarnings("unused")
public class Conexion {

	private static final String Controlador = "com.mysql.cj.jdbc.Driver";
	private static final String Url = "jdbc:mysql://localhost/testeojwp";
	private static final String Usuario = "root";
	private static final String Clave = "";
	
	static Connection conexion = null;
	
	public static Connection Conectar() {
		try {
			Class.forName(Controlador);
			conexion = DriverManager.getConnection(Url, Usuario, Clave);
			System.out.println("CONECTADO A LA BASE DE DATOS");
		} catch (SQLException e) {
			System.out.println("NO SE PUDO HACER LA CONEXION");
			e.printStackTrace();
	    } catch (Exception e) {
		System.out.println("ERROR");
		e.printStackTrace();
		}
		return conexion;
	}
	
}
