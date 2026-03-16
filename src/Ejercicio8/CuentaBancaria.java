package Ejercicio8;

public abstract class CuentaBancaria {

	private final String iban;
	protected double saldo;
	//Si es general para todos es statico
	private static final double INTERES_BASICO = 0.015;
	private double interesAnualBasico;

	public CuentaBancaria(String iban, double saldo) {
		this.iban = iban;
		this.saldo = saldo;
		this.interesAnualBasico = INTERES_BASICO;
	}

	// Setters y getters
	
	public double getInteresAnualBasico() {
		return interesAnualBasico;
	}

	/**
	 * @return the iban
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
			System.out.println("Ingreso realizado. Nuevo saldo: " + saldo);
		}
	}

	public void retirar(double cantidad) {
		if (cantidad > 0 && saldo >= cantidad) {
			saldo -= cantidad;
			System.out.println("Has returado " + cantidad + "€");
		} else {
			System.out.println("Error: No se ha podido realizar la operación.");
		}
	}

	public void traspasar(CuentaBancaria destino, double cantidad) {
		if (destino instanceof CuentaBancaria) {
			if (this.saldo >= cantidad) {
				destino.saldo += cantidad;
				this.saldo -= cantidad;
				System.err.println("Operación Realizada");
			} else {
				System.out.println("No hay saldo suficiente");
			}
		} else {
			System.out.println("No se a podido realizar la operación");
		}
	}

	

	@Override
	public String toString() {
		return "CuentaBancaria [iban=" + iban + ", saldo=" + saldo + ", interesAnualBasico=" + interesAnualBasico + "]";
	}

	public abstract void calcularInteres();
}