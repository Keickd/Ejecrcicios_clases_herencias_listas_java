
public class Edificio {

	private int numeroPlantas;
	private int numeroHabitaciones;
	private double superficie;
	
	public Edificio(int numeroPlantas, int numeroHabitaciones, double superficie) {
		this.numeroPlantas = numeroPlantas;
		this.numeroHabitaciones = numeroHabitaciones;
		this.superficie = superficie;
	}

	public int getNumeroPlantas() {
		return numeroPlantas;
	}

	public void setNumeroPlantas(int numeroPlantas) {
		this.numeroPlantas = numeroPlantas;
	}

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
}
