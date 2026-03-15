package Ejercicio8;

public class CuentaCorriente extends CuentaBancaria {

	private static final double SALDO_MINIMO = 1000.0;

	public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    public void calcularIntereses() {
        // Se incrementa el saldo según el interés anual básico
        double intereses = saldo * INTERES_BASICO;
        saldo += intereses;
        System.out.println("Intereses aplicados a Cuenta Corriente: " + intereses + "€");
    }

    @Override
    public String toString() {
        return "[Cuenta Corriente] " + super.toString();
    }
}