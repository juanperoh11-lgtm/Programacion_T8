package Ejercicio9;

public class Main {

	public static void main(String[] args) {
		Empresa miEmpresa = new Empresa("Tech Corp", "B12345678");

        Empleado emp1 = new Empleado("Ana", "12345678A", 1000);
        Empleado emp2 = new Empleado("Luis", "87654321B", 2200);

        miEmpresa.añadirEmpleado(emp1);
        miEmpresa.añadirEmpleado(emp2);

        System.out.println("LISTADO COMPLETO:");
        miEmpresa.mostrarTodosLosEmpleados();

        System.out.println("\nLISTADO RESUMIDO:");
        miEmpresa.mostrarSueldosResumidos();

        System.out.println("\nTOTALES:");
        System.out.println("Total Brutos: " + miEmpresa.calcularSumaBrutos() + "€");
        System.out.println("Total Netos: " + miEmpresa.calcularSumaNetos() + "€");
    }
}