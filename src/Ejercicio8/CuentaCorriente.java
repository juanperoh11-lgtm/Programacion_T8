package Ejercicio8;

public class CuentaCorriente extends CuentaBancaria {

	private static final double SALDO_MINIMO = 1000.0;

	public CuentaCorriente(String iban, double saldo) {
		super(iban, saldo);
	}

	@Override
	public void calcularInteres(){
	    //double interes = this.getSaldo()*this.getInteresAnualBasico();
	    this.setSaldo(this.getSaldo()*this.getInteresAnualBasico()+this.getSaldo());
	    //return this.getSaldo() *this.getInteresAnualBasico();
	}

	@Override
	public String toString() {
		return "[Cuenta Corriente] " + super.toString();
	}
}