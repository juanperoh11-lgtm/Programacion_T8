package RecuerdoProgramaciónOrientada_aObjetos;

public class Persona {
	private int edad;
	private String nombre, dni;
	private double sueldo;
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int nuevaEdad) {
		if(nuevaEdad <0) {
			System.out.println("Edad nueva Incorrecta, deve ser mayor que 0");
		return;
	}
	this.edad = nuevaEdad;
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	
	public void setSueldo(double nuevoSueldo) {
		if( (nuevoSueldo <0)||(nuevoSueldo> 1000000)){
			System.out.println("Error sueldo no aceptado");
			return;
		}
		this.sueldo = nuevoSueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	//Metodo para mostrar los datos en el main
	@Override
	public String toString() {
		return "El nombre es: " + this.getNombre() + "La edad es: " + this.getEdad() + "El dni es: " + this.getDni()
		 +  "El sueldo es: " + this.getSueldo();	
	}
	
	//Metodo para comparar con los datos puestos en el main
	public boolean equals(Persona pComparar) {
		//2 personas son iguales si su dni y se llaman igual
		if (this.dni.equals(pComparar.dni)) {
		    if (this.nombre.equals(pComparar.nombre))
		        return true;
		}
		return false;
	}
}
