package ejercicio_61;

import java.util.Scanner;

public class ejercicio_61 {
	
	static String nombre;
	static String apellido;
	
	public static void nomyap () {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingerese su nombre  ");
		nombre = entrada.next();
		
	System.out.println("ingrese su apellido ");
		apellido = entrada.next();
	}
	public static void maymin() {
		
		String minuscula = nombre.toLowerCase();
		String mayuscula = apellido.toUpperCase();
		
	}
	public static void parametro(String s1, String s2){
		
		s1 = nombre;
		s2 = apellido;
		
	}
	
	public static void main (String[]arg) {
		nomyap () ;
		maymin();
		parametro(nombre,apellido);
		
		System.out.println( ":"+ nombre + apellido );
		System.out.println("parametro: "+ nombre.length() + apellido.length());
		
		
}
	}