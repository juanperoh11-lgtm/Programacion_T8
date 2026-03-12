package Ejercicio7;

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

		System.out.println(l1.toString());
		l1.emitenSonido();
		l1.volar();
		l1.saluda();
		System.out.println("---------------------------------------");

		/**
		 * Polimorfismo, es decir la cuarata clase
		 */

		Mascota mascotas[] = new Mascota[3];

		mascotas[0] = p1;
		mascotas[1] = g1;
		mascotas[2] = l1;

		for (Mascota m : mascotas)
			System.out.println(m);
		// Lo mismo que hacer System.out.println(m.toString) POLIMORFISMO
		// Llama a metodo toString de las clases llamadas
		
		for (Mascota m : mascotas)
			m.emitenSonido();
	}
}