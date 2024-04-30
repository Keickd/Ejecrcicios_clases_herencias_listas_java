
public class Main {

	public static void main(String[] args) {
		Avion avion = new Avion(250, 4154, 12000);
		System.out.println("Soy un avion que lleva " + avion.getNumPasajeros() + " pasajeros, con el motor de " 
		+ avion.getTipoMotor()[0] + ". Además, lleva una carga de " + avion.getCantidadCarga() + " kilos y alcanza un rango de " 
				+ avion.getRango() + " millas.");
		
		Globo globo = new Globo(50, 200, 15000);
		
		System.out.println("Soy un globo que lleva " + globo.getNumPasajeros() + " pasajeros, con el combustible de " 
				+ globo.getTipoCombustible()[0] + ". Además, lleva una carga de " + globo.getCantidadCarga() + " kilos y alcanza una altitud máxima de " 
						+ globo.getAltitudMaxima() + " pies.");
		
	}

}
