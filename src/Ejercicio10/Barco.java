package Ejercicio10;

public class Barco extends Acuatico {
	
	private boolean motor;
	
	public Barco(String matricula, String modelo, int eslora, boolean motor)  throws Exception{
		super(matricula, modelo, eslora);
		
		this.motor = motor;
	
	}

	/**
	 * @return the motor
	 */
	public boolean isMotor() {
		return motor;
	}

	/**
	 * @param motor the motor to set
	 */
	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return super.toString()+ "Barco [motor=" + motor + "]";
	}
	
	
}
