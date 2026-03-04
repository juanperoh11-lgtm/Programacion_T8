package Herencia;

public class Persona {
	
//En caso de no hacer operaciones con numeros estos se ponen como string entre doble comillas
	// Atributos privados para cumplir con el principio de encapsulamiento.
    protected String nombre, dni, telefono, dirección;
    
    public static String dato() {
    	return "Soy una persona";
    }

    /**
     * Constructor por defecto.
     * Inicializa el teléfono como cadena vacía para evitar errores de puntero nulo (NullPointerException).
     */
    public Persona() {
        this.telefono = "";
    }

    /**
     * Constructor completo.
     * @param nombre Nombre de la persona.
     * @param dni Documento Nacional de Identidad.
     * @param telefono Número de teléfono.
     * @param dirección Dirección de residencia.
     */
    public Persona(String nombre, String dni, String telefono, String dirección) {
        super(); // Llamada explícita al constructor de la clase Object.
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.dirección = dirección;
    }

    /**
     * Constructor simplificado (sin teléfono).
     * Invoca al constructor vacío para asegurar la inicialización por defecto del teléfono.
     */
    public Persona(String nombre, String dni, String dirección) {
        this(); 
        this.nombre = nombre;
        this.dni = dni;
        this.dirección = dirección;
    }

    /** @return El nombre de la persona */
    public String getNombre() {
        return nombre;
    }

    /** @param nombre El nuevo nombre a establecer */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** @return El DNI de la persona */
    public String getDni() {
        return dni;
    }

    /** @param dni El nuevo DNI a establecer */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /** @return El teléfono de contacto */
    public String getTelefono() {
        return telefono;
    }

    /** @param telefono El nuevo teléfono a establecer */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /** @return La dirección actual */
    public String getDirección() {
        return dirección;
    }

    /** @param dirección La nueva dirección a establecer */
    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    /**
     * Crea una representación textual del objeto Persona.
     * @return Cadena con los datos de la persona.
     */
    @Override
    public String toString() {
        return "Persona nombre=" + nombre + ", dni=" + dni + 
               ", telefono=" + telefono + ", dirección=" + dirección ;
    }

    /**
     * Compara si dos objetos Persona son iguales.
     * Criterio: Deben compartir el mismo Nombre y DNI.
     * @param p Objeto a comparar.
     * @return true si son iguales, false en caso contrario.
     */
    @Override 
    public boolean equals(Object p) {
        // 1. Verificamos si el objeto es nulo o no es de tipo Persona
        if (!(p instanceof Persona)) {
            return false;
        }
        
        if (this == p)
        	return true;

        // 2. Casting (conversión de tipo) para acceder a los atributos de Persona
        Persona a = (Persona) p;

        // 3. Comparación lógica: Nombre y DNI deben coincidir
        // Usamos .equals() para comparar el contenido de los Strings, no sus referencias.
        return this.nombre.equals(a.nombre) && this.dni.equals(a.dni);
    }
}