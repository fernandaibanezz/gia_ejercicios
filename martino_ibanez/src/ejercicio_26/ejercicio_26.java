package ejercicio_26;

import java.util.Scanner;

public class ejercicio_26 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int contra=2006,intentos=0;
		
		System.out.println("Ingrese la contrase�a: ");
		contra = datos.nextInt();
		
		while(contra !=2006 && intentos < 3 ) {
		 
		intentos++;
		System.out.println("Contrase�a incorrecta. La cantidad de intentos es: "+intentos);
			
		System.out.println("Ingresa otra vez la contrase�a");
			contra = datos.nextInt();
		
		if (contra == 2006){
		System.out.println("Contrase�a correcta");
	}
		
		else if (intentos == 3) {
		System.out.println("El usario est� bloqueado");	
		}
		
		}
}
}