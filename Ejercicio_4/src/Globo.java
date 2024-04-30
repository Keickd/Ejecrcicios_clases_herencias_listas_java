
public class Globo extends Aeroplano {

	private String tipoCombustible[];
	private int altitudMaxima; //pies
	
	public Globo(int numPasajeros, double cantidadCarga, int altitudMaxima) {
		super(numPasajeros, cantidadCarga);
		tipoCombustible = new String[2];
		tipoCombustible[0] = "hidrógeno";
		tipoCombustible[1] = "helio";
		this.altitudMaxima = altitudMaxima;
	}
	
	

	public String[] getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String[] tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public int getAltitudMaxima() {
		return altitudMaxima;
	}

	public void setAltitudMaxima(int altitudMaxima) {
		this.altitudMaxima = altitudMaxima;
	}
	
}