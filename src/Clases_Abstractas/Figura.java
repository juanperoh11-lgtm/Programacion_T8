package Clases_Abstractas;

public abstract class Figura {
	private String color; 
	
	//Como es un atributo abstract se tine que poner que la clase es abstract
	//Las clases que ereden de Figura tiene que implementar un metodo abstract
	abstract public double area();
	
	public Figura () {
		String color = "Blanco";
	}
}
