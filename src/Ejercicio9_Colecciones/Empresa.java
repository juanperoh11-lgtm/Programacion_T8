package Ejercicio9_Colecciones;

import java.util.Arrays;

public class Empresa {

	private final String nombre, cif;
	private String telefono, direccion;

	// este atributo idx lo utilizaremos como indice de dónde insertar en el array
	private int idx;

	private Empleado empleados[];

	public Empresa(String nombre, String cif, String tle, String direccion) {
		this.nombre = nombre;
		this.cif = cif;
		this.telefono = tle;
		this.direccion = direccion;
		empleados = new Empleado[5];
		idx = 0;
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
	 * @return the cif
	 */
	public String getCif() {
		return cif;
	}

	public void anadirEmpleado(Empleado e) {

		if (idx == empleados.length) {
			System.out.println("No hay espacio para más empleados");
		} else {
			this.empleados[idx] = e;
			idx++;
		}
	}

	// este método busca un empleado en el array y devuelve la posición en el array
	// donde se encuentra o un -1
	private int buscarEmpleado(String dni) {
		for (int i = 0; i < idx; i++) {
			if (empleados[i].getDni().equals(dni)) {
				return i;
			}
		}
		return -1;

	}

	public void borrarEmpleado(String dni) {
		// necesito el indice del array donde se encuentra el dni
		int pos = buscarEmpleado(dni);
		if (pos != -1) {
			// lo hemos encontrado
			empleados[pos] = empleados[idx - 1];
			idx--;
			empleados[idx] = null;
			System.out.println("Empleado borrado correctamente");
		} else {
			System.out.println("Empleado no encontrado");
		}

	}

	public void mostrarInfoTodosLosEmpleados() {
		for (int i = 0; i < idx; i++) {
			System.out.println(empleados[i]);
		}
	}

	public void mostrarDniSueldoBrutoYNetoDeTodos() {
		for (int i = 0; i < idx; i++) {
			System.out.println("DNI: " + empleados[i].getDni() + " Sueldo Bruto: " + empleados[i].getSueldoBruto()
					+ " sueldo Neto: " + empleados[i].calculaSueldoNeto());
		}
	}

	public double calculaSumaTodosLosSueldosBrutosEmpleados() {
		double resultado = 0;
		for (int i = 0; i < idx; i++) {
			resultado += empleados[i].getSueldoBruto();
		}
		return resultado;
	}

	public double calculaSumaTotalSueldoNetoTodosLosEmpleados() {
		double resultado = 0;
		for (int i = 0; i < idx; i++) {
			// cambiamos la coma por punto
			resultado += empleados[i].calculaSueldoNeto();
		}
		return resultado;
	}
	public void mostrarLosEMpleadosOrdenadosAlfabéticamente() {
		//Se necista ordenar el array por nombre, no por hash o identificar de instancia
		Arrays.sort(this.empleados);
		
		for(Empleado e:empleados)
			System.out.println(e);
	}
}