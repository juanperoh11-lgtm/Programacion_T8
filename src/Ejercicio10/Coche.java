package Ejercicio10;

public class Coche extends Terreste {
	
	private  boolean Aire; 
	
	public Coche(String matricula, String modelo, int numRuedas, boolean Aire) throws Exception {
		super(matricula, modelo, numRuedas);
		
		this.Aire =  Aire;
	}

	/**
	 * @return the aire
	 */
	public boolean isAire() {
		return Aire;
	}

	/**
	 * @param aire the aire to set
	 */
	public void setAire(boolean aire) {
		Aire = aire;
	}

	@Override
	public String toString() {
		return  super.toString()+ "Coche [Aire=" + Aire + "]";
	}
	
	
	
}