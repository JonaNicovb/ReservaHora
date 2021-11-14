package com.petSmile;

public class Mascota {
	
	int idMascota;
	String rutDueño;
	String tipoMascota;
	int edad;
	String nombreMascota;
	
	public Mascota(int idMascota, String rutDueño, String tipoMascota, int edad, String nombreMascota) {
		super();
		this.idMascota = idMascota;
		this.rutDueño = rutDueño;
		this.tipoMascota = tipoMascota;
		this.edad = edad;
		this.nombreMascota = nombreMascota;
	}

	public Mascota() {
		// TODO Auto-generated constructor stub
	}

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public String getRutDueño() {
		return rutDueño;
	}

	public void setRutDueño(String rutDueño) {
		this.rutDueño = rutDueño;
	}

	public String getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	
	

}


