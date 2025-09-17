package dni;

import java.io.InputStream;
import java.util.Scanner;

public class CalculoDni {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		final int NUMERO_DIVISOR = 23;
		final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

		System.out.println("introduzca su numero del dni");
		int numero = scan.nextInt();
		System.out.println("La letra del dni es " + LETRAS_DNI.charAt(numero % NUMERO_DIVISOR));
		
		
	System.out.println("Introduzca su DNI con la letra");
	scan.next();
	String nuevoDni = scan.nextLine();
	char letraDni = nuevoDni.charAt(nuevoDni.length()-1);
	int numeroDni = Integer.valueOf(nuevoDni.substring(0, nuevoDni.length()-1));	
		System.out.println(letraDni == LETRAS_DNI.charAt(numeroDni%NUMERO_DIVISOR)?"La letra es correcta": "La letra no es correcta");
		
		
	}

}
