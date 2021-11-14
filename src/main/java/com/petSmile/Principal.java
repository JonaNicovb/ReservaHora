package com.petSmile;

import java.util.Scanner;

public class Principal {	
	
	public static void main(String[] args) {

		Scanner entradaEscaner = new Scanner (System.in);		
		acciones acc = new acciones();
		
		
		
		System.out.print("BIENVENIDO\n"
				+ "1.- INGRESAR UN USUARIO\n"
				+ "2.- REGISTRAR HORA MEDICA VETERINARIA\n"
				+ "3.- CERRAR");
		System.out.print("\nOPCION: ");
		
		int opcion = entradaEscaner.nextInt();
		
		switch(opcion)
		{
		   
		   case 1 : 
			   System.out.println("********************************************"); 
			   	  System.out.print("Ingrese el nombre del usuario : "); 
			   	  String nombreUsuario = entradaEscaner.next();
			      
			      System.out.println(" "); 
			      
			      System.out.print("\nIngrese la contraseña del usuario :"); 
			      String password = entradaEscaner.next();
			    
			      acc.insertarUsuario(nombreUsuario, password);
		      break; 
		   
		   case 2:
			   
			   System.out.println("INGRESA A TU SESION\n");
			   System.out.println("***************************");
			    System.out.print("Ingresa tu nombre de usuario");
			    String nombreUsu = entradaEscaner.next();
			    System.out.print("Ingresa tu password");
			    String pass = entradaEscaner.next();
			    
			    String listarNombre = acc.listarNombre();
			    String listarPassword = acc.listarPassword();
			    
			    if(nombreUsu==listarNombre && pass== listarPassword) {
			    	
			    	System.out.println("********************************************"); 
			    	System.out.println("BIENVENIDO INGRESEMOS LOS DATOS DEL DUEÑO\n"); 
				   	System.out.print("Ingresa el rut: ");
				   	String rut = entradaEscaner.next();
				   	System.out.print("Ingresa el nombre: ");
				   	String nombre = entradaEscaner.next();
				   	System.out.print("Ingresa el apellido: ");
				   	String apellido = entradaEscaner.next();
				   	System.out.print("Ingresa la direccion: ");
				    String direccion = entradaEscaner.next();
				    System.out.println("Ingresa tu correo: ");
				    String correo = entradaEscaner.next();
				    System.out.print("Ingresa tu numero de telefono: ");
				    int telefono = entradaEscaner.nextInt();
				    System.out.print("Ingresa el nombre de tu mascota: ");
				    String nombreMascota = entradaEscaner.next();
				    
				   
				    
				    
				    System.out.println("*****************************************"); 
				    System.out.println("INGRESEMOS LOS DATOS DE LA MASCOTA\n");
				    System.out.print("Ingresa el rut: ");
				   	String rutM = entradaEscaner.next();
				    System.out.print("Ingresa tipo de mascota: ");
				   	String tipoMascota = entradaEscaner.next();
				   	System.out.print("Ingresa la edad de tu mascota: ");
				   	int edad = entradaEscaner.nextInt();
				    String rutMasc = rut + " - " + rutM;
				   
				    System.out.println("*****************************************"); 
				    System.out.println("AGENDANDO LA HORA\n");
				    System.out.print("Ingresa el rutAgenda: ");
				   	String rutAgend = entradaEscaner.next();
				 	System.out.print("Ingresa la hora: ");
				    String hora = entradaEscaner.next();
				    System.out.print("Ingresa la fecha: ");
				    String fecha = entradaEscaner.next();
				    
				    acc.recogerId(rut);			
				    
				    acc.insertarDueño(rut, nombre, apellido, direccion, correo, telefono, nombreMascota);
				    acc.insertarMascota(rutMasc,tipoMascota, edad, nombreMascota);
				    acc.insertarAgenda(rutAgend, nombreMascota, hora, fecha);
				   
				    
			      break;
			    }else {
			    	System.out.println("NOMBRE O USUARIO INCORRECTO VUELVA A INGRESAR");
			    	break;
			    }
		
			    
			    

		   case 3: System.out.print("HASTA LUEGO");
		   			break;
			   	
		   default : 
			   System.out.print("ADVERTENCIA EL NUMERO NO CORRESPONDE"); 
			   
			   
		}
		
	}
}
