package ejercicio_11;

import java.util.Scanner;

public class ejercicio_11 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int var;
		
		System.out.println("ingrese un n�mero positivo u negativo" );
		var = entrada.nextInt();
		
		if (var > 0 ) {
			
			System.out.println("el n�mero es positivo");
	
		}
		else if (var < 0) {
			
			
			System.out.println("el n�mero es negativo");
			
		}
		else {
			
			System.out.println("el n�mero es 0");
			
	}

}
}