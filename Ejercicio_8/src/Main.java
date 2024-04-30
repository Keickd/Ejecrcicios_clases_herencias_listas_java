
public class Main {

	public static void main(String[] args) {
		Hora hora1 = new Hora(11, 59, 59);
		Hora hora2 = new Hora(5, 1, 35);
		Hora hora3;
		
		hora3 = hora1.sumarHoras(hora1, hora2);
		
		hora3.mostrarHora();

	}

}
