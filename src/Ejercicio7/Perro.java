package Ejercicio7;

public class Perro extends Mascota {
	private String raza;
    private boolean pulgas;
    
    public Perro(String nombre, String fechaN, String raza, boolean pulgas) {
        super(nombre, fechaN);
        this.raza = raza; 
        this.pulgas = pulgas;
    }
    
    @Override
    public void emitenSonido() { 
        System.out.println("Guau guau!");
    }

    @Override
    public String toString() {
        String textoPulgas; 
        // This.pulgas se refiera a boolean pulgas
        if (this.pulgas) {
            textoPulgas = "Sí"; 
        } else {
            textoPulgas = "No";
        }
        return super.toString() + " Raza: " + raza + "  Pulgas: " + textoPulgas;
        // Tambien se puede poner: ((pulgas)?  "Sí" : "No tine") en lugar del if
    }
}
