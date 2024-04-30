
public class Main {

	public static void main(String[] args) {
		Edificio edificio = new Edificio(5, 25, 5000);
		Casa casa = new Casa(5, 25, 5000, 5, 2);
		Oficina oficina = new Oficina(5, 25, 5000, 4, 3);
		
		System.out.println(edificio.getNumeroPlantas());
		System.out.println(casa.getNumeroBaños());
		System.out.println(oficina.getNumeroExtintores());

	}

}
