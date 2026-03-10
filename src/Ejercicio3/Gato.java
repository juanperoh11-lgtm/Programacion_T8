package Ejercicio3;

public class Gato extends Mascota {
	private boolean peloLargo;
	private String color;

	public Gato(String nombre, String fecha, boolean peloLargo, String color) {
		super(nombre, fecha);
		this.peloLargo = peloLargo;
		this.color = color;
	}

	@Override
	public void emitenSonido() {
		System.out.println("Miau miau!");
	}

	@Override
	public String toString() {
		String tipoPelo;

		if (this.peloLargo == true) {
			tipoPelo = "Largo";
		} else {
			tipoPelo = "Corto";
		}
		return super.toString() + " Pelo: " + tipoPelo + " Color: " + color;
	}
}