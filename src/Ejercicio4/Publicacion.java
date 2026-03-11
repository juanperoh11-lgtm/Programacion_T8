package Ejercicio4;

public class Publicacion {

	private String titulo;
	private int anioPublicacion;
	private int numPaginas;

	private int codigo;
	// Estatico porque no es comun a todos
	private static int contador = 1;

	// Constructor común
	public Publicacion(String titulo, int anioPublicacion, int numPaginas) {
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
		this.numPaginas = numPaginas;

		this.codigo = contador;
		incrementarContador();
	}

	public static void incrementarContador() {
		contador++;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @param anioPublicacion the anioPublicacion to set
	 */
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	/**
	 * @param numPaginas the numPaginas to set
	 */
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	// Métodos específicos
	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	// Sobrescribiendo un método de la clase Object
	public String toString() {
		return "Código: " + codigo + ", Título: " + titulo + ", Año: " + anioPublicacion + ", Páginas: " + numPaginas;
	}
}