
public class Hora {

	private int horas;
	private int minutos;
	private int segundos;
	
	public Hora() {
		horas = 0;
		minutos = 0;
		segundos = 0;
	}
	
	public Hora(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public void mostrarHora() {
		System.out.println(horas + ":"+ minutos + ":" + segundos);
	}
	
	public Hora sumarHoras(Hora hora1, Hora hora2) {
		int horas = hora1.horas + hora2.horas;
		int minutos = hora1.minutos + hora2.minutos;
		int segundos = hora1.segundos + hora2.segundos;
		
		if (horas > 23) {
			horas %= 23; //horas = 26 % 23 --> 3 
			horas--; // 3 - 1 = 2
		}
		if (minutos > 59) {
			minutos %= 59;
			minutos--;
		}
		if (segundos > 59) {
			segundos %= 59;
			segundos--;
		}
		
		return new Hora(horas, minutos, segundos);
	}

	
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	
}
