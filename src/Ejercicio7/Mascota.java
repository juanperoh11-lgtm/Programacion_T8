package Ejercicio7;

public abstract class Mascota {
	protected String nombre, fechaN;

	public Mascota(String nombre, String fechaN) {
		this.nombre = nombre;
		this.fechaN = fechaN;
	}

	public abstract void emitenSonido() ;

	@Override
	public String toString() {
		return "Nombre: " + nombre + "Fecha de Nacimiento: " + fechaN;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the fechaN
	 */
	public String getFechaN() {
		return fechaN;
	}

	/**
	 * @param fechaN the fechaN to set
	 */
	public void setFechaN(String fechaN) {
		this.fechaN = fechaN;
	}

}