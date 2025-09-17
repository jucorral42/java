package ejerciciospdf;

public class ejercicos2Conversion {

	public static void main(String[] args) {
		int origenEntero = 10;
		double origenReal = 10.2;
		int destinoEntero;
		double destinoReal;
		float destinoReal2;

		destinoEntero = origenEntero;
		destinoReal = origenReal;
		destinoReal2 = (float) origenReal;

		int abonoTransporte = 30;
		double precioFinal;
		boolean esNumerosa = false;

		int edad = 18;
		precioFinal = (edad <18||edad>65) ? abonoTransporte * 0.5
				: (esNumerosa) ? abonoTransporte * 0 : abonoTransporte;

	}

}
