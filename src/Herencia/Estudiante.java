package Herencia;

public class Estudiante extends Persona { // El extends hace que todos los metodos, classes...
										  //de persona los tenga estudiante

	private String nExpediente, ciclo, curso;
	private double notaMedia;

	public Estudiante(String nombre, String dni, String telefono, String direccion, String nExpediente, String ciclo,
			String curso, double notaMedia) {

		super(nombre, dni, telefono, direccion);
		this.nExpediente = nExpediente;
		this.ciclo = ciclo;
		this.curso = curso;
		this.notaMedia = notaMedia;
	}

	public Estudiante(String nombre, String dni, String dirección) {
		super(nombre,dni,dirección);
	}

	/**
	 * @return the nEstudiante
	 */
	public String getnExpediente() {
		return nExpediente;
	}

	/**
	 * @param nEstudiante the nEstudiante to set
	 */
	public void setnExpediente(String nExpediente) {
		this.nExpediente = nExpediente;
	}

	/**
	 * @return the ciclo
	 */
	public String getCiclo() {
		return ciclo;
	}

	/**
	 * @param ciclo the ciclo to set
	 */
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * @param cirso the curso to set
	 */
	public void setCirso(String curso) {
		this.curso = curso;
	}

	/**
	 * @return the notaMedia
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * @param notaMedia the notaMedia to set
	 */
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	public String dameNombre() {
		return this.getNombre();
	}
		
	@Override
	public String toString() {
		String datosPersona = super.toString();
		return datosPersona + "Numero Expediente: " + nExpediente + "Ciclo " +
				this.ciclo+ " Curso: " + this.curso + "notaMedia: " + notaMedia;
	}
	
	public static String dato() {
		return "Soy un estudiante";
	}
	
}
