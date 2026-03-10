package Ejercicio4;

public class Main {

	public static void main(String[] args) {
		Libro libro1 = new Libro("L001", "Cien años de soledad", 1967, 471, "Gabriel García Márquez");
        Revista revista1 = new Revista("R050", "National Geographic", 2023, 120, 512);

        System.out.println("Información del Libro");
        System.out.println(libro1.toString());
        System.out.println("Año de publicación: " + libro1.getAnioPublicacion());

        System.out.println("\nInformación de la Revista ");
        System.out.println(revista1.toString());
        System.out.println("Código: " + revista1.getCodigo());
    }
}