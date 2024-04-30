
public class Aeroplano {

	private int numPasajeros;
	private double cantidadCarga;
	
	public Aeroplano(int numPasajeros, double cantidadCarga) {
		this.numPasajeros = numPasajeros;
		this.cantidadCarga = cantidadCarga;
	}
	
	

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public double getCantidadCarga() {
		return cantidadCarga;
	}

	public void setCantidadCarga(double cantidadCarga) {
		this.cantidadCarga = cantidadCarga;
	}
	
}
