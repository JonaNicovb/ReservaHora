package com.petSmile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
	
	public static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/bd_ejemplo";
	public static final String USUARIO ="root";
	public static final String CLAVE = "";
	
	static {
		try{
			Class.forName(CONTROLADOR);
		}catch(ClassNotFoundException e) {
			System.out.print("Error al cargar el controlador");
			e.printStackTrace();
		}
	}
	
	
	public Connection getConectar() {		
		Connection conexion= null;
			try {		
				conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
				System.out.println("Conexion OK");
				}catch(SQLException e) {
				System.out.print("ERROR EN LA CONEXION");
				e.printStackTrace();
			}
			
			return conexion;
				
		}
	}
	

