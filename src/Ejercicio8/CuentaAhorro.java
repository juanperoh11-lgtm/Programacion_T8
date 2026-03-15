package Ejercicio8;

public class CuentaAhorro extends CuentaBancaria {
	private static final double SALDO_MINIMO = 1000.0;

	public CuentaAhorro(String iban, double saldo) {
		super(iban, saldo);
	}

	@Override
	public void calcularIntereses() {
		double interesAplicado;

		if (saldo < SALDO_MINIMO) {
			// Si no llega al mínimo, interés es la mitad del básico
			interesAplicado = INTERES_BASICO / 2;
		} else {
			// Si lo supera, el interés es el doble
			interesAplicado = INTERES_BASICO * 2;
		}

		double intereses = saldo * interesAplicado;
		saldo += intereses;
		System.out.println("Intereses aplicados a Cuenta Ahorro: " + intereses + "€");
	}

	@Override
	public String toString() {
		return "Cuenta Ahorro " + super.toString() + " Mínimo para premio: " + SALDO_MINIMO + "€";
	}
}