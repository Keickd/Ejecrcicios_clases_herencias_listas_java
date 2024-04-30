
public class Garaje {

	private int numPlazasGaraje;
	private Vehiculo plazas[];
	
	public Garaje() {
		numPlazasGaraje = 4;
		plazas = new Vehiculo[numPlazasGaraje];
		
		plazas[0] = new Coche(120, 5);
		plazas[1] = new Moto(150);
		plazas[2] = new Coche(180, 2);
	}

	public double devolverCuotaMensual(int plaza) {
		if (plazas[plaza] instanceof Coche) {
			
			return ((Coche) plazas[plaza]).getNumPlazas() * plazas[plaza].getPotencia();
		}else if(plazas[plaza] instanceof Moto) {
			return plazas[plaza].getPotencia() * 2;
		}else {
			return 0;
		}
	}
	
	public int getNumPlazasGaraje() {
		return numPlazasGaraje;
	}

	public void setNumPlazasGaraje(int numPlazasGaraje) {
		this.numPlazasGaraje = numPlazasGaraje;
	}

	public Vehiculo[] getPlazas() {
		return plazas;
	}

	public void setPlazas(Vehiculo[] plazas) {
		this.plazas = plazas;
	}

}
