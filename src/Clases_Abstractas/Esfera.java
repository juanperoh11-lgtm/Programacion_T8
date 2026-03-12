package Clases_Abstractas;

public class Esfera  extends Figura{
	//Al no implementar el metodo abstracto da error
	double radio;
	
	public Esfera() {
		super();
		radio =2;
	}
	
	
	public double area() {
		return 2.2;
	}
}
