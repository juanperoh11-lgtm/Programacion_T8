package Ejercicio6;

public class Main {

	public static void main(String[] args) {

		Circulo c1 = new Circulo(2);
		Rectangulo r1 = new Rectangulo (2,2);
		Triangulo  t1 = new Triangulo (2,2,2,2);
		
		System.out.println("Circulo");
		System.out.println(c1.calcularPerimetro());
		System.out.println(c1.calculaArea());
		
		System.out.println("\nRectangulo");
		System.out.println(r1.calcularPerimetro());
		System.out.println(r1.calculaArea());
		
		System.out.println("\nTriangulo");
		System.out.println(t1.calcularPerimetro());
		System.out.println(t1.calculaArea());
	}
}
