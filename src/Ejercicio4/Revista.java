package Ejercicio4;

public class Revista extends Publicacion {
    private int numRevista;

    public Revista(String codigo, String titulo, int anioPublicacion, int numPaginas, int numRevista) {
        super(codigo, titulo, anioPublicacion, numPaginas);
        this.numRevista = numRevista;
    }
    
    
    
    /**
	 * @return the numRevista
	 */
	public int getNumRevista() {
		return numRevista;
	}



	/**
	 * @param numRevista the numRevista to set
	 */
	public void setNumRevista(int numRevista) {
		this.numRevista = numRevista;
	}



	@Override
    public String toString() {
        return super.toString() + ", Número de revista: " + numRevista;
    }
}