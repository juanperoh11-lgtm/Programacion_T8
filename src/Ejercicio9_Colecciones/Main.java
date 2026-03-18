package Ejercicio9_Colecciones;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Empresa emp = new Empresa("Coca-Cola", "11113k", "91213423", "C/A");

		int op;
		do {
			menu();
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 1:
				System.out.println("Introduce el dni del empleado");
				String dni = sc.nextLine();
				System.out.println("Introduce el nombre");
				String nombre = sc.nextLine();
				System.out.println("Introduce el sueldo bruto");
				double sb = sc.nextDouble();
				emp.anadirEmpleado(new Empleado(nombre, dni, sb));
				break;
			case 2:
				System.out.println("Introduce el dni del empleado a borrar");
				emp.borrarEmpleado(sc.nextLine());
				break;
			case 3:
				emp.mostrarInfoTodosLosEmpleados();
				break;
			case 4:
				emp.mostrarDniSueldoBrutoYNetoDeTodos();
				break;
			case 5:
				System.out.println(emp.calculaSumaTodosLosSueldosBrutosEmpleados());
				break;
			case 6:
				System.out.println(String.format("%.2f", emp.calculaSumaTotalSueldoNetoTodosLosEmpleados()));
				break;
			case 7:
				emp.mostrarLosEMpleadosOrdenadosAlfabéticamente();
				//Como no hay suficientes Empleados no va ha funcionar, ya que es un array de 5 y solo hay 2 personas añadidas
			case 8:
				System.out.println("saliendo");
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (op !=8 );

	}

	private static void menu() {

		System.out.println("1. Introduce empleado\n2. Borra empleado\n3. Mostrar todos\n4. Mostrar DNI,SB y SN\n5. "
				+ "Suma total sueldos brutos\n6. Suma total sueldos netos\n7. ORdenados Alfabeticamente, \n8. Salir");

	}

}