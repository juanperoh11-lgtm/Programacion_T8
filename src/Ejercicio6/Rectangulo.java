package Ejercicio6;

import Ejercicio2.Punto;

public class Rectangulo extends Figura {
	private Punto a, b;

	public Rectangulo(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public double calcularPerimetro() {
		int base = Math.abs(b.getX() - a.getX());
		int altura = Math.abs(b.getY() - a.getY());
		return 2 * (base + altura);
	}

	@Override
	public double calculaArea() {
		int base = Math.abs(b.getX() - a.getX());
		int altura = Math.abs(b.getY() - a.getY());
		return base * altura;
	}

	/**
	 * @return the a
	 */
	public Punto getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(Punto a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public Punto getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(Punto b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Rectángulo formado por los puntos: " + a + " y " + b;
	}

}