
public class Main {

	public static void main(String[] args) {
		Fecha fecha = new Fecha(30,2,2020);
		Fecha fecha2 = new Fecha(28,2,2020);
		Fecha fecha3 = new Fecha(31,12,2020);
		Fecha fecha4 = new Fecha(29,2,2024);
		
		fecha.visualizar();
		
		fecha2.adelantar(2);
		fecha2.visualizar();
		
		fecha3.adelantar(700);
		fecha3.visualizar();
		
		fecha4.adelantar(1985);
		fecha4.visualizar();
	}

}
