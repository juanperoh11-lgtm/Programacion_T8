package Ejemplo_ClasesAbstractas;

public class Triangulo extends Forma {

	protected double base, altura;
	
	public Triangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	// La clase abstracta de forma la cual sobreescribimos el metodo para cada clase 
	@Override
	double area (){
	
		return 0.5 * base * altura;
	}
}
