package Ejercicio10;

public class Acuatico extends Vehiculo {

	private final int eslora;
	
	public Acuatico(String matricula, String modelo,int eslora) throws Exception {
		if (!(matriculaValida(matricula)))
			throw new Exception("Matricula inválida");
		this.setMatricula(matricula);
		this.setModelo(modelo);
		this.eslora = eslora;
	}

	@Override
	public boolean matriculaValida(String matricula) {
		//Si NO cumple con las condiciones del enunciado 
		if ((matricula.length() <3) || (matricula.length() >10))
			return false;
		
		///En caso de cumplir con las condiciones anteriores se continua con el resto del código
		
		//Si todosa los caracteres son alfabeticos  
		for(int i=0; i<matricula.length(); i++) {
			Character c = matricula.charAt(i);
			//Mirar si todos son letras
			if(!(Character.isDigit(matricula.charAt(i))))
				return false;

			}
		return true;
	}
}
