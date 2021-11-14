package com.petSmile;

public class Agenda {
	
	int id;
	int idMascota;
	String rutDueño;
	String nombreMascota;
	String hora;
	String fecha;
	
	public Agenda(int id, int idMascota, String rutDueño, String nombreMascota, String hora, String fecha) {
		super();
		this.id = id;
		this.idMascota = idMascota;
		this.rutDueño = rutDueño;
		this.nombreMascota = nombreMascota;
		this.hora = hora;
		this.fecha = fecha;
	}
	
	
	public Agenda() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	

}
