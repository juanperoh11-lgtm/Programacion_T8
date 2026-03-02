package Composición;

public class Main {
    public static void main(String[] args) {
        // Creación de puntos individuales
        Punto p1 = new Punto(3, 1);
        Punto p2 = new Punto(1, 4);
        System.out.println(p1);
        System.out.println(p2);

        //  Formas diferentes de crear un rectángulo 

        // r1: Usando variables de tipo Punto ya creadas
        Rectangulo r1 = new Rectangulo(p1, p2);

        // r2: Creando puntos  dentro del constructor
        Rectangulo r2 = new Rectangulo(new Punto(2, 3), new Punto(4, 5));

        // r3: Pasando directamente las coordenadas enteras
        Rectangulo r3 = new Rectangulo(6, 7, 8, 9);

        // r4: Usando el constructor vacío (puntos en 0,0)
        Rectangulo r4 = new Rectangulo();
        
        System.out.println(r3);
        System.out.println(r2);
        System.out.println(r1);
        
        //Como saber si dos rectangulso son iguales
        if (r2.esIgualRectangulo(r3))
        	System.out.println("...");
    }
}