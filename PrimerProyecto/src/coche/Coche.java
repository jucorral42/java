package coche;

import java.util.Scanner;

public class Coche {
	String marca = "Ferrari";
	String modelo;
	int potencia;
	String matricula;
	double consumo;
	String giro;
	boolean electrico;

	void arrancarCoche() {
	}

	String girarCoche(String giro) {

		return giro;
	}

	public Coche(String modelo, int potencia) {
		this.modelo = modelo;
		this.potencia = potencia;
	}

	public Coche(String modelo, String matricula, double consumo) {
		super();
		this.modelo = modelo;
		this.matricula = matricula;
		this.consumo = consumo;
	}
	public Coche() {} ;

	public static void main(String[] args) {

		Coche ferrari1 = new Coche();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserte modelo");
		ferrari1.modelo = scanner.nextLine();
		System.out.println("Inserte potencia");
		ferrari1.potencia = scanner.nextInt();
		System.out.println("Inserte marca");
		scanner.nextLine();
		ferrari1.marca = scanner.nextLine();
		System.out.println("Inserte consumo");
		ferrari1.consumo = scanner.nextDouble();
		System.out.println("Inserte giro");
		ferrari1.giro = scanner.next();
		System.out.println("Inserte si es electrico true/false");
		ferrari1.electrico = scanner.nextBoolean();

		scanner.close();

		System.out.println(ferrari1.consumo + ferrari1.giro + ferrari1.marca + ferrari1.electrico + ferrari1.matricula
				+ ferrari1.potencia);
	}

}
