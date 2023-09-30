package VO;

import java.sql.Date;

@SuppressWarnings("unused")
public class CiudadanoVO {
	
	private static int id = 0;
	private String edad;
	private String nombreApellido;
	private String genero;
	private String pais;
	private String provincia;
	private String ciudad;
	private String codigopostal;
	private String estadocivil;
	private String situacionlaboral;
	
	public CiudadanoVO(String edad, String nombreApellido, String genero, String pais,
			String provincia, String ciudad, String codigopostal, String estadocivil, String situacionlaboral) {
		id++;
		this.edad = edad;
		this.nombreApellido = nombreApellido;
		this.genero = genero;
		this.pais = pais;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.codigopostal = codigopostal;
		this.estadocivil = estadocivil;
		this.situacionlaboral = situacionlaboral;
	}
	@Override
	public String toString() {
		return "Ciudadano Nro: " + id + " Edad:" + edad + ", NombreApellido: " + nombreApellido
				+ ", Genero: " + genero + ", Pais: " + pais + ", Provincia: " + provincia + ", Ciudad: " + ciudad
				+ ", Codigopostal: " + codigopostal + ", Estadocivil: " + estadocivil + ", Situacion Laboral: "
				+ situacionlaboral;
	}
	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodigopostal() {
		return codigopostal;
	}

	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public String getSituacionlaboral() {
		return situacionlaboral;
	}

	public void setSituacionlaboral(String situacionlaboral) {
		this.situacionlaboral = situacionlaboral;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
