package Interfaces;

public class Cuadrado implements Informacion,InfoArea{

	
	private double lado;

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	/**
	 * @return the lado
	 */
	public double getLado() {
		return lado;
	}

	/**
	 * @param lado the lado to set
	 */
	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}
	
	public double area() {
		return this.lado*this.lado;
	}

	@Override
	public String muestraInformacion() {
		return this.toString();
	}

	@Override
	public String muesraInfromación() {
		// TODO Auto-generated method stub
		return null;
	}
	
}