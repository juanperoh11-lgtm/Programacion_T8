package Ejercicio5;

public class Electrodomestico {
	// Por defecto, el color sera blanco, el consumo energético sera F, el
	// precioBase es de
	// 100 € y el peso de 5 kg. Usa constantes para ello.
	final static String COLOR = "blanco";
	final static char CONSUMO_ENERGETICO = 'F';
	final static double PRECIO = 100;
	final static double PESO = 5;

	// Atributos del primer apartado
	protected String color;
	protected char consumoEnergetico;
	protected double precioBase;
	protected double peso;

	// Constructor por defecto
	public Electrodomestico() {
		this.precioBase = PRECIO;
		this.peso = PESO;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.color = COLOR;
	}

	// Constructor con el precio y peso. El resto por defecto
	public Electrodomestico(double precioBase, double peso) {
		this();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	// Constructor con todos los atributos.
	public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
		this.precioBase = precioBase;
		this.peso = peso;
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

	// Getters y setters
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the consumoEnergetico
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * @param consumoEnergetico the consumoEnergetico to set
	 */
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @param precioBase the precioBase to set
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	private void comprobarConsumoEnergetico(char letra) {
		if (letra >= 'A' && letra <= 'F') {
			this.consumoEnergetico = letra;
		} else {
			this.consumoEnergetico = CONSUMO_ENERGETICO;
		}

	}
	
	private void comprobarColor(String color) {
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;
        for (int i = 0; i < colores.length && !encontrado; i++) {
            if (colores[i].equalsIgnoreCase(color)) {
                encontrado = true;
            }
        }
        //this.color = (encontrado) ? color : COLOR;
        
         if (encontrado) {
    		this.color = color;
		} else {
    		this.color = COLOR;
		}
    }
	
	// Constructor del precio Final
	public double precioFinal() {
		//Variable para los incrementos
		double plus = 0;
		switch (consumoEnergetico) {
		case 'A': plus += 100; break;
		case 'B': plus += 80; break;
		case 'C': plus += 60; break;
		case 'D': plus += 50; break;
		case 'E': plus += 30; break;
		case 'F': plus += 10; break;
	}
		if (peso >= 0 && peso <= 19) {
			plus += 10;
		} else if (peso >= 20 && peso <= 49) {
			plus += 50;
		} else if (peso >= 50 && peso <= 79) {
			plus += 80;
		} else if (peso >= 80) {
			plus += 100;
		}

		return precioBase + plus;
	}
}