package Ejercicio8;

public class Main {

	public static void main(String[] args) {

		CuentaBancaria[] misCuentas = new CuentaBancaria[2];

		misCuentas[0] = new CuentaCorriente("ES01-1111", 500.0);
		misCuentas[1] = new CuentaAhorro("ES02-2222", 2000.0);

		System.out.println(" ESTADO INICIAL ");
		for (CuentaBancaria cuenta : misCuentas) {
			System.out.println(cuenta);
		}

		System.out.println("\nREALIZANDO OPERACIONES");
		// Ingreso en la corriente
		misCuentas[0].ingresar(500.0);

		// Retirada en la de ahorro
		misCuentas[1].retirar(100.0);

		// Traspaso de la de ahorro a la corriente
		misCuentas[1].traspasar(misCuentas[0], 400.0);

		System.out.println("\nCALCULANDO INTERESES");
		for (CuentaBancaria cuenta : misCuentas) {
			cuenta.calcularIntereses();
		}

		System.out.println("\nESTADO FINAL");
		for (CuentaBancaria cuenta : misCuentas) {
			System.out.println(cuenta);
		}
	}
}