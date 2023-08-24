package ejercicio_63;

import java.util.Scanner;

public class ejercicio_63 {

	static String gmail;

	public static void ingreso() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese su coreo eectronico");
		gmail = entrada.next();
		gmail.indexOf("@");
		gmail.indexOf(".");

		System.out.println(gmail.indexOf("@"));
		System.out.println(gmail.indexOf("."));

		while (gmail.indexOf("@") == -1 || gmail.indexOf(".") == -1 || gmail.indexOf("@") > gmail.indexOf(".")) {

			System.out.println("gmail invalido, intente de nuevo");

			System.out.println("ingrese su coreo eectronico");
			gmail = entrada.next();

		}
		
		public static void contr() {
			
			System.out.println("ingrese su contraseña");
			
			
			
			
			
		}
	}

	public static void main(String[] args) {
		ingreso();
		contrasena();
		System.out.println(gmail);
	}
}
