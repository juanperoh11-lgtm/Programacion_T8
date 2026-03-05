package Herencia;

public class Profesor extends Persona {

	private String codigoProfesor, departamento, horario;
	private String modulos[];

	/**
	 * 
	 * @param nombre
	 * @param dni
	 * @param telefono
	 * @param direccion
	 * @param codigoProfesor
	 * @param departamento
	 * @param horario
	 * @param modulos
	 */

	public Profesor(String nombre, String dni, String telefono, String direccion, String codigoProfesor,
			String departamento, String horario, String[] modulos) {
		super(nombre, dni, telefono, direccion);
		this.codigoProfesor = codigoProfesor;
		this.departamento = departamento;
		this.horario = horario;
		this.modulos = modulos;
	}

	/**
	 * @return the codigoProfesor
	 */
	public String getCodigoProfesor() {
		return codigoProfesor;
	}

	/**
	 * @param codigoProfesor the codigoProfesor to set
	 */
	public void setCodigoProfesor(String codigoProfesor) {
		this.codigoProfesor = codigoProfesor;
	}

	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}

	/**
	 * @param horario the horario to set
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}

	/**
	 * @return the modulos
	 */
	public String[] getModulos() {
		return modulos;
	}

	/**
	 * @param modulos the modulos to set
	 */
	public void setModulos(String[] modulos) {
		this.modulos = modulos;
	}

	// programacion BD SI
	private String dameModulos() {
		String m = "";
		for (String s : this.modulos)
			m += s + " ";
		return m;
	}

	@Override
	public String toString() {

		String datosPersona = super.toString();
		return datosPersona + " código " + this.codigoProfesor + " departamento: " + this.departamento + " horario: "
				+ this.horario + " módulos que imparte: " + this.dameModulos();
	}

	

	// 2 profesores son iguales sí el Nombre, dni y departamento iguales
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Persona))
			return false;

		Profesor pr = (Profesor) obj;
		return this.dni.equals(pr.dni) && this.nombre.equals(pr.nombre) && this.dameModulos().equals(pr.dameModulos());

	}

}