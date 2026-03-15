package Ejercicio8;

public abstract class CuentaBancaria {

	protected String iban;
	protected double saldo;
	protected static final double INTERES_BASICO = 0.015;

	public CuentaBancaria(String iban, double saldo) {
		this.iban = iban;
		this.saldo = saldo;
	}

	// Setters y getters

	/**
	 * @return the iban
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * @param iban the iban to set
	 */
	public void setIban(String iban) {
		this.iban = iban;
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
			System.out.println("Retirada realizada con éxito.");
		} else {
			System.out.println("Error: No se ha podido realizar la operación.");
		}
	}

	public void traspasar(CuentaBancaria destino, double cantidad) {
		if (this.saldo >= cantidad) {
			this.retirar(cantidad);
			destino.ingresar(cantidad);
			System.out.println("Traspaso realizado con éxito.");
		} else {
			System.out.println("No hay saldo suficiente para el traspaso.");
		}
	}

	@Override
	public String toString() {
		return "IBAN: " + iban + " | Saldo: " + saldo + "€";
	}

	public abstract void calcularIntereses();
}