package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		Punto_Ej1 p1 = new Punto_Ej1(0, 0);
		Punto_Ej1 p2 = new Punto_Ej1(3, 4);

		Linea miLinea = new Linea(p1, p2);
		miLinea.mostrarCoordenadas();
		System.out.println("Longitud: " + miLinea.obtenerLongitud()); 
	}

}
