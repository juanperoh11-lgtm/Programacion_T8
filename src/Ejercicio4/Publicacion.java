package Ejercicio4;

public class Publicacion {
	private String codigo;
	private String titulo;
	private int anioPublicacion;
	private int numPaginas;

	// Constructor común
	public Publicacion(String codigo, String titulo, int anioPublicacion, int numPaginas) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
		this.numPaginas = numPaginas;
	}

	// Métodos específicos 
	public String getCodigo() {
		return codigo;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	// sobre escribir el contructor
	public String toString() {
		return "Código: " + codigo + ", Título: " + titulo + ", Año: " + anioPublicacion + ", Páginas: " + numPaginas;
	}
}