package ejerciciospdf;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numero = 10;
		double decimal = 19.2;
		int numero2 = 23;
		String nombre = "juan";
		boolean esEstudiante = true;
		System.out.println(numero);
		System.out.println(decimal);
		System.out.println(esEstudiante);
		System.out.println(numero + decimal);
		String saludo = "hola" + nombre;
		System.out.println(saludo);
		System.out.println((decimal == numero) ? "Son numeros iguales"
				: (decimal > numero ? "El primer numero es mayor" : "El segundo numero es mayor"));
		System.out.println((decimal > numero && decimal > numero2) ? "decimal es el numero mayor " + decimal
				: (numero > numero2) ? "El numero 1 es mayor " + numero : "El numero 2 es mayor " + numero2);
	}

}
