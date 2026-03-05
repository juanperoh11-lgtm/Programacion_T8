package Ejercicio3;

public class Main {

	public static void main(String[] args) {
		Perro p1 = new Perro("Rex", "12/05/2021", "Ladrador", false);

		Gato g1 = new Gato("Pelusa", "01/01/2023", true, "Gris");

		Loro l1 = new Loro("Paco", "20/10/2020", "Brasil", true);

		System.out.println("--- GESTIÓN DE LA TIENDA DE MASCOTAS ---");

		System.out.println(p1.toString());
		p1.emitenSonido();
		System.out.println("------------------------------------------");

		System.out.println(g1.toString());
		g1.emitenSonido();
		System.out.println("---------------------------------------");

		// Probamos el Loro y sus métodos especiales
		System.out.println(l1.toString());
		l1.emitenSonido();
		l1.volar();
		l1.saluda();
		System.out.println("---------------------------------------");
	}
}