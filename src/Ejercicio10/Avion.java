package Ejercicio10;

public class Avion extends Aerio {
	
	private int tiempoMaximoVuelo;
	
	public Avion(String matricula, String modelo, int numAsientos, int tiempoMaximoVuelo )  throws Exception{
		super(matricula, modelo, numAsientos);
		
		this.tiempoMaximoVuelo = tiempoMaximoVuelo;
	}

	/**
	 * @return the tiempoMaximoVuelo
	 */
	public int getTiempoMaximoVuelo() {
		return tiempoMaximoVuelo;
	}

	/**
	 * @param tiempoMaximoVuelo the tiempoMaximoVuelo to set
	 */
	public void setTiempoMaximoVuelo(int tiempoMaximoVuelo) {
		this.tiempoMaximoVuelo = tiempoMaximoVuelo;
	}

	@Override
	public String toString() {
		return super.toString() +"Avion [tiempoMaximoVuelo=" + tiempoMaximoVuelo + "]";
	}
	
	
}
