package es.jlcm01.cdr.programacion.ut01.ejemplos;

public class Ejemplo03 {

	public static void main(String[] args) {

		System.out.println();
		int n1 = 1;
		int n2 = 2;
				{
			System.out.println("En el primer subbloque");
			int n3 = 3;
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
				}
				System.out.println("Vuelta al principal");
				System.out.println(n1);
				System.out.println(n2);
				//System.out.println(n3); Esta variable aqui no existe
				
	}

}
