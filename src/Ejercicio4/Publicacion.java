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
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	public String getCodigo() {
		return codigo;
	}

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