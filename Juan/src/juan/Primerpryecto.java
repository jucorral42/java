package juan;

import java.util.Scanner;

public class Primerpryecto {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int edad = 25;
		String nombre = scanner.nextLine();
		double salario = 1200.34;
		char codigo = 'c';
		System.out.println("El empleado  .\n " + edad + nombre + salario + codigo );
		
		 int nueva = scanner.nextInt();
	
		 System.out.println("Dato = " + nueva);
		 System.out.println();
		 
		scanner.close();
	}


}
