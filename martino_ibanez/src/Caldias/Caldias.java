package Caldias;

import java.util.Scanner;

public class Caldias {
	
	public static void main (String args []) {
		Scanner entrada = new Scanner (System.in);
		
		int a�o,meses,semanas,dias;
		
		System.out.println("ingrese los a�os");
		a�o=entrada.nextInt();
		
	
		dias=a�o*365;
		meses=a�o*12;
		semanas=a�o*52;
		
		System.out.println("El a�o tiene:"+dias);
		System.out.println("El a�o tiene:"+meses);
		System.out.println("El a�o tiene:"+semanas);
				
		
		
		
		
}
}