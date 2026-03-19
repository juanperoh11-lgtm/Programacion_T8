package Ejercicio10;

public class Moto extends Terreste  {
	
	private String color;
	
	public Moto (String matricula, String modelo, int numRuedas, String color )  throws Exception{
		super(matricula, modelo, numRuedas);
		
		this.color = color;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString()+ "Moto [color=" + color + "]";
	}
	
	
	
}
