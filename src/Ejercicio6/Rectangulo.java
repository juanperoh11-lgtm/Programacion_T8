package Ejercicio6;

public class Rectangulo extends Figura {

	private double base, altura;
	
	public Rectangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*(base + altura);
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return base * altura;
	}
	

}