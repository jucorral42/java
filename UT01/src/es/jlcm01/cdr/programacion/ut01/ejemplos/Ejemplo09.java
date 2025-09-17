package es.jlcm01.cdr.programacion.ut01.ejemplos;

public class Ejemplo09 {

	public static void main(String[] args) {
		System.out.println("haciendo comparaciones");
		int num = 10;
		int num2 = 10;
		System.out.println((num>=num2) ? "el primero es mayor" + num :"el segundo es mayor");
		int precio = 10;
		int ahorros = 9;
		boolean esVerano = true;
		boolean estaLloviendo = false;
		
		String resultado = (precio<=ahorros&&(!estaLloviendo||esVerano))? "Vete al cine":"No te vallas al cine";
		System.out.println(resultado); 

	}

}
