package Ejercicio6;

public class Circulo extends Figura {

	private double radio;
	
	public Circulo (double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radio;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return Math.PI * radio * radio;
	}

}
