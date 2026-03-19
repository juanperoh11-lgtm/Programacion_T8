package Ejercicio10;

public class Helicoptero extends Aerio  {
	
	private final int helices;
	
	public Helicoptero (String matricula, String modelo, int numAsientos, int helices )  throws Exception{
		super(matricula, modelo, numAsientos);
		
		this.helices = helices;
	}

	/**
	 * @return the helices
	 */
	public int getHelices() {
		return helices;
	}

	@Override
	public String toString() {
		return super.toString() +"Helicoptero [helices=" + helices + "]";
	}
	
	
	
}
