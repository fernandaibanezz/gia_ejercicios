package ejercicio_62;

import java.util.Scanner;

public class ejercicio_62 {

	static String apellidos[] = new String[5];
	static String apellido_max = "", apellido_min = "{";

	public static void ingresar() {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("Ingresar un apellido");
			apellidos[i] = entrada.next();
		}
	}

	public static void comparacion() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {

				if (apellidos[j].compareTo(apellidos[j + 1]) > 0) {
					String temp = apellidos[j];
					apellido_max = apellidos[j];

				}

				if (apellidos[j].compareTo(apellidos[j + 1]) < 0) {
					String temp = apellidos[j];
					apellido_min = apellidos[j];

				}

			}
		}

	}

	public static void main(String[] args) {
		ingresar();
		comparacion();

		int ultima_posicion = apellidos.length - 1;

		System.out.println("El apellido mayor es: " + apellidos[ultima_posicion]);
		System.out.println("El apellido menor es: " + apellidos[0]);

	}
}