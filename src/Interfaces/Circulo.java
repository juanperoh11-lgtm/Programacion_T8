package Interfaces;

public class Circulo implements Informacion {
	private static final double PI = 3.141516;
	
	private double radio;
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double area() {
		return 2*PI*this.radio;
	}
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	/**
	 * @return the pi
	 */
	public static double getPi() {
		return PI;
	}

	public String muestraInformacion() {
		return this.toString();
	}

	@Override
	public String muesraInfromación() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}