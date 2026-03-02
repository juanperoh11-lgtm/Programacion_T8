package Composición;

public class Rectangulo {
    // Composición: el rectángulo utiliza dos objetos de la clase Punto
    Punto a, b;

    // Constructor 1: Crea puntos por defecto (0,0)
    public Rectangulo() {
        this.a = new Punto();
        this.b = new Punto();
    }

    // Constructor 2: Recibe objetos Punto ya existentes
    public Rectangulo(Punto x, Punto y) {
        this.a = x;
        this.b = y;
    }

    // Constructor 3: Recibe coordenadas enteras y crea los objetos Punto internamente
    public Rectangulo(int x1, int x2, int y1, int y2) {
        this.a = new Punto(x1, y1);
        this.b = new Punto(x2, y2);
    }

    // Calcula el área usando el valor absoluto de la diferencia de coordenadas
    public int calculaAreal() {
        return Math.abs(this.b.getX() - this.a.getX()) * Math.abs(this.b.getY() - this.a.getY());
    }

    // Método completado para calcular el perímetro: 2 * (ancho + alto)
    public int getPerimetro() {
        int ancho = Math.abs(this.b.getX() - this.a.getX());
        int alto = Math.abs(this.b.getY() - this.a.getY());
        return 2 * (ancho + alto);
    }
    
    @Override
    public String toString() {
    	return this.a.toString() + ", " + this.b.toString();
    }
    
    //Ver si dos rectangulos son iguales
    public boolean esIgualRectangulo(Rectangulo r) {
        return (this.a.esIgualPunto(r.a) && (this.b.esIgualPunto(r.b)));
    }
}