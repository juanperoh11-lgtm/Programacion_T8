package Ejercicio9;

public class Empresa {
	private String nombre;
	private String cif;
	private String telefono;
	private String direccion;
	private Empleado[] listaEmpleados;
	private int contador;

	public Empresa(String nombre, String cif) {
		this.nombre = nombre;
		this.cif = cif;
		// Creamos un array con un tamaño máximo (ejemplo 50)
		this.listaEmpleados = new Empleado[50];
		this.contador = 0;
	}

	public void añadirEmpleado(Empleado e) {
		if (contador < listaEmpleados.length) {
			listaEmpleados[contador] = e;
			contador++;
		} else {
			System.out.println("No se pueden añadir más empleados. Capacidad llena.");
		}
	}

	public void eliminarEmpleado(Empleado e) {
		for (int i = 0; i < contador; i++) {
			if (listaEmpleados[i].getDni().equals(e.getDni())) {
				// Desplazar elementos para no dejar huecos
				for (int j = i; j < contador - 1; j++) {
					listaEmpleados[j] = listaEmpleados[j + 1];
				}
				listaEmpleados[contador - 1] = null;
				contador--;
				return;
			}
		}
	}

	public void mostrarTodosLosEmpleados() {
		for (int i = 0; i < contador; i++) {
			System.out.println(listaEmpleados[i].toString());
		}
	}

	public void mostrarSueldosResumidos() {
		System.out.println("Resumen de Sueldos (DNI, Bruto y Neto)");
		for (int i = 0; i < contador; i++) {
			Empleado e = listaEmpleados[i];
			// Construimos la salida manualmente aquí
			System.out.println("DNI: " + e.getDni() + " | Bruto: " + e.getSueldoBruto() 
								+ "€" + " | Neto: "+ e.calcularSueldoNeto() + "€");
		}
	}

	public double calcularSumaBrutos() {
		double total = 0;
		for (int i = 0; i < contador; i++) {
			total += listaEmpleados[i].getSueldoBruto();
		}
		return total;
	}

	public double calcularSumaNetos() {
		double total = 0;
		for (int i = 0; i < contador; i++) {
			total += listaEmpleados[i].calcularSueldoNeto();
		}
		return total;
	}
}