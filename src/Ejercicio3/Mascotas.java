package Ejercicio3;

public class Mascotas {
	protected String nombre, fechaN;

	public Mascotas(String nombre, String fechaN) {
		this.nombre = nombre;
		this.fechaN = fechaN;
	}

	public void emitenSonido() {
		System.out.println(nombre + "Su sonido clásico");
	}

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