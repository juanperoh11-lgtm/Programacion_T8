package Interfaces;

public class Main {

	public static void main(String[] args) {
		Informacion info[] = new Informacion[4];
		InfoArea infoArea[] = new InfoArea[2];
		
		info[0] = new Circulo(2);
		info[1] = new Coche("Seat","Toledo",2008);
		info[2] = new Cuadrado(3);
		info[3] = new Persona("Ana","111k");
		
		infoArea[0] = (InfoArea) new Circulo(3);
		infoArea[1] = new Cuadrado(4);
		
		for(InfoArea i:infoArea)
			System.out.println(((Circulo) i).area());
		
		System.out.println("////////////////////////");
		
		for(Informacion i:info)
			System.out.println(((InfoArea) i).muestraInformacion());

	}

}