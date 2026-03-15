package Ejemplo_ClasesAbstractas;

public class Rectangulo extends Forma {

	protected double base, altura;
	
	public Rectangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	// La clase abstracta de forma la cual sobreescribimos el metodo para cada clase 
	@Override
	double area (){
	
		return base * altura;
	}
}
