
public class Casa extends Edificio {
	
	private int numeroDormitorios;
	private int numeroBaños;
	
	public Casa(int numeroPlantas, int numeroHabitaciones, double superficie, int numeroDormitorios, int numeroBaños) {
		super(numeroPlantas, numeroHabitaciones, superficie);
		this.numeroDormitorios = numeroDormitorios;
		this.numeroBaños = numeroBaños;
	}

	public int getNumeroDormitorios() {
		return numeroDormitorios;
	}

	public void setNumeroDormitorios(int numeroDormitorios) {
		this.numeroDormitorios = numeroDormitorios;
	}

	public int getNumeroBaños() {
		return numeroBaños;
	}

	public void setNumeroBaños(int numeroBaños) {
		this.numeroBaños = numeroBaños;
	}
	
	
}
