package Ejercicio10;

public class Terreste extends Vehiculo {
	
	private final int numRuedas;
	
	public Terreste(String matricula, String modelo, int numRuedas) throws Exception {
		if (!(matriculaValida(matricula)))
			throw new Exception("Matricula inválida");
		this.setMatricula(matricula);
		this.setModelo(modelo);
		this.numRuedas = numRuedas;
	}

	@Override
	public boolean matriculaValida(String matricula) {
		int letras = 0, digito = 0;

		if ((matricula.length() != 10))
			return false;
		for (int i = 0; i < 4; i++) {
			// Miramos si los cuatro primeros caracteres son dígitos
			Character c = matricula.charAt(i);
			if (!(Character.isDigit(matricula.charAt(i))))
				return false;
		}
		for (int i = 4; i < matricula.length(); i++) {
			Character c = matricula.charAt(i);
			if ((Character.isDigit(matricula.charAt(i))))
				return false;
		}

		return true;

	}
}