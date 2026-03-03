package Herencia;

public class Main {

	public static void main(String[] args) {
		/**
		 * TEORÍA DE DISEÑO:
		 * - Herencia ("Es un"): Un Alumno ES UNA Persona. Se usa 'extends'.
		 * - Composición ("Pertenece a" / "Tiene un"): Una Persona TIENE UNA Dirección.
		 */
		
		Persona p1 = new Persona("Ana", "111k", "9123414", "C/A");
		Persona p2 = new Persona("Jose", "222k", "C/A"); // Usa el constructor sin teléfono
		Persona p3 = new Persona("Ana", "111k", "9123414", "C/A");
		Persona p11 = new Persona("Ana", "111k", "913169106", "C/B");
		
		// El método println llama automáticamente al método toString() de la clase Persona
		System.out.println("Datos de p1: " + p1);
		
		/** PRUEBA DE IGUALDAD (Método equals)
		 * IMPORTANTE: En tu código original había un ';' después del if. 
		 * Eso hacía que el System.out se ejecutara siempre. Aquí lo corregimos:
		 */

		// Comparación 1: Ana vs Jose (Diferentes)
		if (p1.equals(p2)) {
			System.out.println("p1 y p2 son iguales");
		} else {
			System.out.println("p1 y p2 son diferentes");
		}
			
		// Comparación 2: Ana vs Ana (Iguales según nuestro criterio de DNI y Nombre)
		if (p1.equals(p3)) {
			System.out.println("p1 y p3 son iguales");
		}

		// Comparación 3: p1 y p11 (Mismo DNI/Nombre pero diferente dirección/teléfono)
		// Como nuestro equals solo mira nombre y dni, dirá que son iguales.
		if (p1.equals(p11)) {
			System.out.println("p1 y p11 se consideran la misma persona (mismo DNI)");
		}
	}
}