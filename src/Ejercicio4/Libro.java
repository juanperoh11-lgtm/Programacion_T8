package Ejercicio4;

public class Libro extends Publicacion {
	private String autor;

	public Libro(String codigo, String titulo, int anioPublicacion, int numPaginas, String autor) {
		super(codigo, titulo, anioPublicacion, numPaginas);
		this.autor = autor;
	}

	
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}



	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}



	@Override
	public String toString() {
		return super.toString() + ", Autor: " + autor;
	}
}