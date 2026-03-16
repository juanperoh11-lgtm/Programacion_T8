package Ejercicio8;

public class Main {

	public static void main(String[] args) {
		CuentaBancaria cb1 = new CuentaAhorro("ES12345", 1000);
		CuentaBancaria cb2 = new CuentaCorriente("ES12346", 300);
		cb1.traspasar(cb2, 300);
		System.out.println(cb1.getSaldo());
		System.out.println(cb2.getSaldo());
		CuentaAhorro ch = new CuentaAhorro("ES1234567", 1000);
		ch.calcularInteres();
		System.out.println(ch.getSaldo());
		System.out.println(ch);

		cb1.ingresar(400);
		System.out.println(cb1.getSaldo());
	}
}