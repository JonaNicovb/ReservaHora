package com.petSmile;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class acciones {
	
Conexion conexion = new Conexion();
private Connection con;

Usuario usuario = new Usuario();
Dueño dueño = new Dueño();
Mascota mascota = new Mascota();
Agenda agenda = new Agenda();

public void insertarUsuario(String nombreUsuario, String password){
	PreparedStatement ps;
	String sql;
	usuario.setNombreUsuario(nombreUsuario);
	usuario.setPassword(password);
	
	try{
		con = conexion.getConectar();
		sql = "insert into usuario(NombreUsuario, password) values(?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1,usuario.getNombreUsuario());
		ps.setString(2, usuario.getPassword());
		
		ps.executeUpdate();
		JOptionPane.showMessageDialog(null, "Se han insertado los datos");
		
	}catch(SQLException e){
	   JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
	}
	
}


public String listarNombre(){
	Conexion conexion = new Conexion();
	Connection cn = null;
	Statement stm = null;
	ResultSet rs = null;
	String nombre;
	String clave;
	
	
	
	
	
	try {
		cn=conexion.getConectar();
		stm=cn.createStatement();
		rs= stm.executeQuery("SELECT * FROM usuario");
		
		while(rs.next()) {
			
			nombre= rs.getString(2);
			clave = rs.getString(3);	
			usuario.setNombreUsuario(nombre);
			usuario.setPassword(clave);
		}
		
	}catch (SQLException e) {
		e.printStackTrace();
	
	}
	
	
    return usuario.getNombreUsuario();

}

public String listarPassword(){
	Conexion conexion = new Conexion();
	Connection cn = null;
	Statement stm = null;
	ResultSet rs = null;
	String nombre;
	String clave;
	
	
	
	
	
	try {
		cn=conexion.getConectar();
		stm=cn.createStatement();
		rs= stm.executeQuery("SELECT * FROM usuario");
		
		while(rs.next()) {
			
			nombre= rs.getString(2);
			clave = rs.getString(3);	
			usuario.setNombreUsuario(nombre);
			usuario.setPassword(clave);
		}
		
	}catch (SQLException e) {
		e.printStackTrace();
	
	}
	
	
    return usuario.getPassword();

}
	
	

public void insertarDueño(String rut, String nombre, String apellido, String direccion, String correo, int telefono, String nombreMascota){
	PreparedStatement ps;
	String sql;
	dueño.setRut(rut);
	dueño.setNombre(nombreMascota);
	dueño.setApellido(apellido);
    dueño.setDireccion(direccion);
    dueño.setCorreo(correo);
    dueño.setTelefono(telefono);
    dueño.setNombreMascota(nombreMascota);
	
	try{
		con = conexion.getConectar();
		sql = "insert into dueño(rut, nombre, apellido, direccion, correo, telefono, nombreMascota) values(?,?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1,dueño.getRut());
		ps.setString(2, dueño.getNombre());
		ps.setString(3, dueño.getApellido());
		ps.setString(4, dueño.getDireccion());
		ps.setString(5, dueño.getCorreo());
		ps.setInt(6, dueño.getTelefono());
		ps.setString(7, dueño.getNombreMascota());
		
		ps.executeUpdate();
		JOptionPane.showMessageDialog(null, "Se han insertado dueño");
		
	}catch(SQLException e){
	   JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
	}
	
}



public void insertarMascota(String rutDueño, String tipoMascota, int edad, String nombreMascota){
	PreparedStatement ps;
	String sql;
	mascota.setRutDueño(rutDueño);
	mascota.setTipoMascota(tipoMascota);
	mascota.setEdad(edad);
	mascota.setNombreMascota(nombreMascota);
	try{
		con = conexion.getConectar();
		sql = "insert into mascota(rutDueño, tipoMascota, edad, nombreMascota) values(?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, mascota.getRutDueño());
		ps.setString(2, mascota.getTipoMascota());
		ps.setInt(3, mascota.getEdad());
		ps.setString(4, mascota.getNombreMascota());
		
		ps.executeUpdate();
		JOptionPane.showMessageDialog(null, "Se ha insertado la Mascota");
		
	}catch(SQLException e){
	   JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
	}
	
}

public int recogerId(String rutDueño){
	Conexion conexion = new Conexion();
	Connection cn = null;
	Statement stm = null;
	ResultSet rs = null;
	int idMascota;
	
	try {
		cn=conexion.getConectar();
		stm=cn.createStatement();
		rs= stm.executeQuery("SELECT * FROM mascota WHERE rutDueño = " + rutDueño);
		
		
		while(rs.next()) {
			
			idMascota= rs.getInt(1);
			agenda.setIdMascota(idMascota);
		}
		
	}catch (SQLException e) {
		e.printStackTrace();
	
	}
	
	
    return agenda.getIdMascota();

}

public void insertarAgenda(String rutDueño, String nombreMascota, String hora, String fecha){
	PreparedStatement ps;
	String sql;
	agenda.setRutDueño(rutDueño);
	agenda.setNombreMascota(nombreMascota);
	agenda.setHora(hora);
	agenda.setFecha(fecha);
	try{
		con = conexion.getConectar();
		sql = "insert into agenda(idMascota, rutDueño, nombreMascota, hora, fecha) values(?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setInt(1,agenda.getIdMascota());
		ps.setString(2,agenda.getRutDueño());
		ps.setString(3, agenda.getNombreMascota());
		ps.setString(4, agenda.getHora());
		ps.setString(5, agenda.getFecha());
		
		ps.executeUpdate();
		JOptionPane.showMessageDialog(null, "Se ha insertado la Agenda");
		
	}catch(SQLException e){
	   JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
	}
	
}


}
