package Ejercicio3;

public class Loro extends Mascota {
	protected String nombre, fechaN;

	private String origen;
    private boolean habla;

    public Loro(String nombre, String fecha, String origen, boolean habla) {
        super(nombre, fecha);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    public void emitenSonido() {
        System.out.println("¡Lorito quiere galleta!");
    }

    public void volar() {
        System.out.println(this.getNombre() + " está volando.");
    }

    public void saluda() {
        System.out.println("Hola, soy de " + origen);
    }

    @Override
    public String toString() {
        String textoHabla;

        if (this.habla == true) {
            textoHabla = "Sí";
        } else {
            textoHabla = "No";
        }

        return super.toString() + "  Origen: " + origen + "  Habla: " + textoHabla;
    }
}