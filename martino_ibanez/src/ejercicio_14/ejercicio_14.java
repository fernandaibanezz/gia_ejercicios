package ejercicio_14;

import java.util.Scanner;

public class ejercicio_14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.println("ingrese un n�mero para dividir");
		num = entrada.nextInt();
		
		if (num <=0 ) {
			
			System.out.println("la divici�n no se puede realizar: ");
			
	}
		else {
			System.out.println("la divici�n se puede realizar");
		}
}
}