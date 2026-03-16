package Ejercicio8;

public class CuentaAhorro extends CuentaBancaria {

	private final double SALDO_MINIMO = 100;

	public CuentaAhorro(String iban, double saldo) {
		super(iban, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularInteres() {
		/*
		if (this.getSaldo() < SALDO_MINIMO) {
			this.setSaldo(this.getSaldo() * (this.getInteresAnualBasico() / 2) + this.getSaldo());
			return this.getSaldo() * (this.getInteresAnualBasico() / 2);
		} else {
			return this.getSaldo() * (this.getInteresAnualBasico() * 2);
		}
		*/
	}

}