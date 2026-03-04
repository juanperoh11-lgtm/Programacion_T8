package Herencia;

public class Profesor extends Persona {
	
	private String codProfesor, Departamento, Horario;
	private  Modulos listaModulos;
	
	public Profesor(String nombre, String dni, String telefono, String direccion, String codProfesor,
	        String Departamento, String Horario, String modulos[]) {
	    super(nombre, dni, telefono, direccion);
	    this.codProfesor = codProfesor;
	    this.Departamento = Departamento;
	    this.Horario = Horario;
	    
	    // Solución: Inicializamos y asignamos el array que recibimos por parámetro
	    this.listaModulos = new Modulos();
	    this.listaModulos.modulo = modulos; 
	}
	
	
	/**
	 * @return the codProfesor
	 */
	public String getCodProfesor() {
		return codProfesor;
	}
	/**
	 * @param codProfesor the codProfesor to set
	 */
	public void setCodProfesor(String codProfesor) {
		this.codProfesor = codProfesor;
	}
	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return Departamento;
	}
	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	/**
	 * @return the horario
	 */
	public String getHorario() {
		return Horario;
	}
	/**
	 * @param horario the horario to set
	 */
	public void setHorario(String horario) {
		Horario = horario;
	}
	/**
	 * @return the modulos
	 */
	public Modulos getModulos() {
	    return listaModulos;
	}

	/**
	 * @param listaModulos el objeto Modulos a asignar
	 */
	public void setModulos(Modulos listaModulos) {
	    this.listaModulos = listaModulos; // Antes tenías un error de asignación aquí
	}
	
	@Override
	public String toString() {
	    // Usamos el atributo de la clase (this.listaModulos) en lugar de crear uno nuevo
	    return super.toString() + " Codigo Profesor: " + codProfesor + " Departamento: " + Departamento +
	           " Horario: " + Horario + " Modulos: " + java.util.Arrays.toString(this.listaModulos.modulo);
	}
	
}