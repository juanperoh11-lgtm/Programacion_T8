package Ejercicio10;

public class Submarino extends Acuatico {
	
	private int profundidadMaxima;
	
	
	public Submarino (String matricula, String modelo, int eslora, int profundidadMaxima )  throws Exception{
		super(matricula, modelo, eslora );
		
		this.profundidadMaxima = profundidadMaxima;
	}


	/**
	 * @return the profundidadMaxima
	 */
	public int getProfundidadMaxima() {
		return profundidadMaxima;
	}


	/**
	 * @param profundidadMaxima the profundidadMaxima to set
	 */
	public void setProfundidadMaxima(int profundidadMaxima) {
		this.profundidadMaxima = profundidadMaxima;
	}


	@Override
	public String toString() {
		return  super.toString() +"Submarino [profundidadMaxima=" + profundidadMaxima + "]";
	}
	
	

}
