package test;

public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Manuel", "Perez", 42);
		Bombero bombero = new Bombero("Tom", "Cruise", 56, true, 15.8);

		bombero.setNombre("John");
		System.out.println(bombero.getNombre());


		persona.comer();
		bombero.comer();
		
		System.out.println();
		
		persona.trabajar();
		bombero.trabajar();

		
		String str = "hola q tal";
		char mischar[] = str.toCharArray();
		System.out.println(mischar[0]);
	}

}


