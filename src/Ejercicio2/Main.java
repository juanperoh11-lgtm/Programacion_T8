package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		Punto p1 = new Punto(0,5);
		Punto p2 = new Punto(10,0);
		
		// 2. Creamos el objeto Rectangulo usando composición
        Rectangulo rect1 = new Rectangulo(p1, p2);

        // 3. Probamos el toString (Java llamará al toString de Rectangulo y este al de Punto)
        System.out.println("Datos del " + rect1.toString());

        // 4. Calculamos área y perímetro
        System.out.println("Área: " + rect1.calcularArea());
        System.out.println("Perímetro: " + rect1.calcularPerimetro());
        
        // 5. Demostración de equals y puntos iguales
        Punto p3 = new Punto(0, 5); 
        // p1 y p3 tienen las mismas coordenadas, pero son objetos distintos en memoria
        
        System.out.println("¿Es p1 igual a p3 (coordenadas)? " + p1.equals(p3));
        System.out.println("¿Es p1 el mismo objeto físico que p3? " + (p1 == p3));

        // 6. Modificamos un punto usando el Setter
        p1.setX(2);
        System.out.println("Nuevo valor de p1 tras usar setX(2): " + p1);
        System.out.println("Área actualizada del rect1: " + rect1.calcularArea());
	}

}
