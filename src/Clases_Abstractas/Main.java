package Clases_Abstractas;

public class Main {

	public static void main(String[] args) {
		// Los metodos absatrartos son metodos que no programas pero que continen info
		// Si el metodo es abstrato la clase tiene que ser abstractas
		// Tampoco se puede llamar desde el main

		Esfera e = new Esfera();
		// Tampoco se puede llamar desde el main la clase Abstracta
		/// Figura f = new Figura();
	
		// Encambio si se puede crear un array de una clse abstrarcta
		// En otras palabras no se puede llamar directamente a la clase
		Figura f[] = new Figura[2];
		f[0] = e;
	}

}
