package Ejercicio9;

public class Empleado {
	private final String nombre;
	private final String dni;

	private double sueldoBruto;
	private int edad;
	private String telefono;
	private String direccion;

	public Empleado(String nombre, String dni, double sueldoBruto) {
		this.nombre = nombre;
		this.dni = dni;
		this.sueldoBruto = sueldoBruto;
	}

	public double calcularSueldoNeto() {
		if (this.sueldoBruto < 12000){
			return  this.sueldoBruto - (this.sueldoBruto *0.2 /12); 
		} else if((this.sueldoBruto >=12000) && (this.sueldoBruto <25000)){
			return this.sueldoBruto - this.sueldoBruto *0.3;
		}else
			return this.sueldoBruto - this.sueldoBruto *0.4;
	}

	@Override
	public String toString() {
		return "EMPLEADO -> Nombre: " + nombre + " | DNI: " + dni + " | Sueldo Bruto: " + sueldoBruto + "€"
				+ " | Sueldo Neto: " + calcularSueldoNeto() + "€" + " | Edad: " + (edad == 0 ? "N/D" : edad)
				+ " | Tel: " + (telefono == null ? "N/D" : telefono);
	}

	/**
	 * @return the sueldoBruto
	 */
	public double getSueldoBruto() {
		return sueldoBruto;
	}

	/**
	 * @param sueldoBruto the sueldoBruto to set
	 */
	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

}
