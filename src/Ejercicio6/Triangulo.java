package Ejercicio6;

public class Triangulo  extends Figura{
	
private double base, altura, lado2, lado3;
    
    public Triangulo(double base, double altura, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularPerimetro() {
        return base + lado2 + lado3;
    }

    @Override
    public double calculaArea() {
        return (base * altura) / 2;
    }
}