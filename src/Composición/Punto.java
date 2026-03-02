package Composición;

public class Punto {
    // Atributos privados para encapsulamiento
    private int x, y;

    // Constructor por defecto: inicializa el punto en el origen (0,0)
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor con parámetros: permite definir coordenadas específicas
    public Punto(int x1, int y1) { 
        this.x = x1;
        this.y = y1;
    }

    // Métodos Getter y Setter para acceder y modificar los atributos privados
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    // Representación en texto del objeto Punto
    @Override
    public String toString() {
        return " " + this.x + " " + this.y;
    }
    
    //Ver si dos puntos son iguales 
    public boolean esIgualPunto (Punto p) {
    	return (this.x==p.x) && (this.y == p.y);
    }
}
