package Ejercicio10;

public class Main {

	public static void main(String[] args) {
		
		try {
			Terreste t1 = new Terreste ("1234abc", "Volvo",4);
			
			Coche c1 = new Coche("333aaa", "seat", 4, true);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
