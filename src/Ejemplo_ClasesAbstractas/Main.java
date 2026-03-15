package Ejemplo_ClasesAbstractas;

public class Main {

	public static void main(String[] args) {
		
		//Como la clase forma es abstracta no se puede crear un objeto forma
		
		Circulo c1 = new Circulo(2); //Como el metodo pide un radio se pone el un uno para el radio
		Triangulo t1 = new Triangulo(2,2);
		Rectangulo r1 = new Rectangulo(2,2);
		
		//Para mostrarlo 
		System.out.println(c1.area());
		System.out.println(t1.area());
		System.out.println(r1.area());
	}

}
