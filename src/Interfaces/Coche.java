package Interfaces;

public class Coche implements Informacion{
	private String marca,modelo;
	private int anio;
	public Coche(String marca, String modelo, int anio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + "]";
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}
	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String muestraInformacion() {
		return this.toString();
	}
	@Override
	public String muesraInfromación() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}