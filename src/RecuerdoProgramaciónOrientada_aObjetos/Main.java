package RecuerdoProgramaciónOrientada_aObjetos;

public class Main {

	public static void main(String[] args) {
		// En lugar de esto utilizamos una clase aparte para no tenerlo desperdigado por el código
		// No solo es para ordenar sino que tambian son mejores prácticas
		int edad =3;
		String nombre ="Ana";
		String dni = "111k";
		double sueldo = 999999.89;
		
		
		//Por el principio de encapsulamientu no deberias hacer esto porque es una mala práctica
		//Debiras crear diferente atributos y metodos detro de las diferentes classes
		/**Persona p = new Persona();
		p.edad=3;
		p.dni = "111k";
		p.nombre = "Ana";
		p.sueldo = 999999.89;
		p.nombre = p.nombre +"1234";
		*/
		// Esto deberías hacer:
		Persona p=  new Persona();
		p.setNombre("Ana");		
		p.setEdad(23);
		p.setDni("111K");
		p.setSueldo(2333.3);
		
		// Para mostrarlo usamos el toString dentro de la clase
		System.out.println(p);
		
		
		//Mostrar que dos personas son iguales
		Persona p1 = new Persona();
		///Ponemos los datos
		p1.setNombre("ANA");
		p1.setEdad(99);
		p1.setDni("111k");
		p1.setSueldo(9999);
		
		///Comparación, el metodo esta en la clase Persona
		if(p.equals (p1))
			System.out.println("Son la misma persona");
		else
			System.out.println("No son la misma persona");
		
		
	}
}
