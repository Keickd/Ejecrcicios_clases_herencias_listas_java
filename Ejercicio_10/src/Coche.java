
public class Coche extends Vehiculo{
	
	private int numPlazas;
	
	public Coche(int potencia, int numPlazas) {
		super(potencia);
		this.numPlazas = numPlazas;
	}
	
	/*public int numPlazas() {
		return 0;
	}*/

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	
}
