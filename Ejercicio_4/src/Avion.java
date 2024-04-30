
public class Avion extends Aeroplano{

	private String tipoMotor[];
	private double rango; //millas
	
	public Avion(int numPasajeros, double cantidadCarga, double rango) {
		super(numPasajeros, cantidadCarga);
		tipoMotor = new String[2];
		tipoMotor[0] = "propulsion";
		tipoMotor[1] = "jet";
		this.rango = rango;
	}

	
	
	public String[] getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String[] tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public double getRango() {
		return rango;
	}

	public void setRango(double rango) {
		this.rango = rango;
	}
	
}
