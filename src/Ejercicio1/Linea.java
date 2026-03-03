package Ejercicio1;

public class Linea {
    // Atributos por composición: una línea se define por dos puntos
    private Punto_Ej1 puntoInicio;
    private Punto_Ej1 puntoFin;

    // Constructor 1: Sobrecarga que acepta dos objetos Punto
    public Linea(Punto_Ej1 p1, Punto_Ej1 p2) {
        this.puntoInicio = p1;
        this.puntoFin = p2;
    }

    // Constructor 2: Sobrecarga que acepta 4 coordenadas (int)
    public Linea(int x1, int y1, int x2, int y2) {
        this.puntoInicio = new Punto_Ej1(x1, y1);
        this.puntoFin = new Punto_Ej1(x2, y2);
    }

    // Método para calcular la longitud usando el Teorema de Pitágoras
    public double obtenerLongitud() {
        int difX = puntoFin.getX() - puntoInicio.getX();
        int difY = puntoFin.getY() - puntoInicio.getY();
        //IA
        return Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));
    }

    // Método para mostrar las coordenadas de la línea
    public void mostrarCoordenadas() {
        System.out.println("Línea desde (" + puntoInicio.getX() + "," + puntoInicio.getY() + 
                           ") hasta (" + puntoFin.getX() + "," + puntoFin.getY() + ")");
    }
}