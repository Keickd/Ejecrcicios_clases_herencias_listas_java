
public class Main {

	public static void main(String[] args) {
		Empleado empleadoBase = new Empleado("Manuel", "Jimenez", 
				"Masculino", 123123123, 1111111111, "empleado", 16000);
		EmpleadoJunior empleadoJunior = new EmpleadoJunior("Manuel", "Jimenez", 
				"Masculino", 123123123, 1111111111, "empleado", 16000, "licencia basica");
		EmpleadoJunior empleadoSenior = new EmpleadoSenior("Manuel", "Jimenez", 
				"Masculino", 123123123, 1111111111, "empleado", 16000, "licencia basica", "licencia buena");
		Jefazo jefazo = new Jefazo("Manuel", "Jimenez", 
				"Masculino", 123123123, 1111111111, "empleado", 16000, "licencia basica", "licencia buena", 5555555);
	
	
		empleadoBase.trabajar();
		empleadoBase.descansar();
		empleadoJunior.trabajar();
		empleadoJunior.obtenerLicencia();
		empleadoSenior.trabajar();
		jefazo.conseguirFondos();
		jefazo.descansar();
	}

}
