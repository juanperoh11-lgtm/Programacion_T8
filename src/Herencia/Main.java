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
		
		
		
		/**
		 * Tercera clase T8 de programción
		 */
		
		Estudiante e1 = new Estudiante("Juan", "333k", "35935", "C/H", "EXP-001", "DAM", "1º", 8.5);
		System.out.println(e1);
		
		
		// Como esta declarado como estudiante llama al toString de estudiante
		Persona p4 = new Estudiante("Manu", "666k" + "35935", "C/z" + "8989564" + "DAM" + "1º" + 6.5);
		System.out.println(p4);
		//En este caso como es contructur es estatico muestra la frase de la clase persona
		System.out.println(p4.dato());
		
		String[] modulosPedro = {"Dam", "Daug"};
		Profesor pr1 = new Profesor("Pedro", "777k", "600112233", "Calle Falsa 123", "35855",        
		        "Informática", "Mañana", modulosPedro );
		System.out.println(pr1.toString());
		
		Profesor pr2 = new Profesor("Pedro", "777k", "600112233", "Calle Falsa 123", "35855",           
		        "Informática", "Mañana", modulosPedro );
		System.out.println("----------------------------------------------------------------------------------");
		
		if (pr1.equals(pr2)) {
			System.out.println("Son iguales");
		}
	}
}