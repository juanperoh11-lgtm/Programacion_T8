package Ejercicio4;

public class Libro extends Publicacion {
	private String autor;

	public Libro(String codigo, String titulo, int anioPublicacion, int numPaginas, String autor) {
		super(codigo, titulo, anioPublicacion, numPaginas);
		this.autor = autor;
	}

	@Override
	public String toString() {
		return super.toString() + ", Autor: " + autor;
	}
}