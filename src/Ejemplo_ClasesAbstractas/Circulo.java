package Ejemplo_ClasesAbstractas;

public class Circulo extends Forma {
	
	protected double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	// La clase abstracta de forma la cual sobreescribimos el metodo para cada clase  
	@Override
	double area (){
	
		return Math.PI * radio * radio;
	}
}
