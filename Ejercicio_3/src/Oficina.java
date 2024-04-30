
public class Oficina extends Edificio{

	private int numeroExtintores;
	private int numeroTelefonos;
	
	public Oficina(int numeroPlantas, int numeroHabitaciones, double superficie, int numeroExtintores, int numeroTelefonos) {
		super(numeroPlantas, numeroHabitaciones, superficie);
		this.numeroExtintores = numeroExtintores;
		this.numeroTelefonos = numeroTelefonos;
	}

	public int getNumeroExtintores() {
		return numeroExtintores;
	}

	public void setNumeroExtintores(int numeroExtintores) {
		this.numeroExtintores = numeroExtintores;
	}

	public int getNumeroTelefonos() {
		return numeroTelefonos;
	}

	public void setNumeroTelefonos(int numeroTelefonos) {
		this.numeroTelefonos = numeroTelefonos;
	}
	
}
