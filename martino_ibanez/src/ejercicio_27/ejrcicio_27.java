package ejercicio_27;

import java.util.Scanner;

public class ejrcicio_27 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int contra=2006,intentos=0;
		boolean bandera = false;
		
		System.out.println("Ingrese la contrase�a: ");
		contra = datos.nextInt();
		
		while(contra !=2006 && bandera == false ) {
		 
		intentos++;
		System.out.println("Contrase�a incorrecta. La cantidad de intentos es: "+intentos);
			
		System.out.println("Ingresa otra vez la contrase�a");
			contra = datos.nextInt();
			
			if (intentos == 3 ) {
			bandera = true;
				}
	
	}
		
	   
		if (contra == 2006){
			System.out.println("Contrase�a correcta");
		}
		else if (bandera =true) {
		System.out.println("El usuario est� bloqueado");
		}	
			
			
			
}
}

