
public class Jefazo extends EmpleadoSenior{

	private int fondosReservados;
	
	public Jefazo(String nombre, String apellido, String genero, int telefono, long numeroSeguridadSocial,
			String puesto, int salario, String licenciaBasica, String licenciaAltoNivel, int fondosReservados) {
		super(nombre, apellido, genero, telefono, numeroSeguridadSocial, puesto, salario, licenciaBasica, licenciaAltoNivel);
		this.setFondosReservados(fondosReservados);
	}

	public void descansar() {
		System.out.println("Yo soy jefe y nunca descanso");
	}
	
	public void conseguirFondos() {
		System.out.println("Consiguiendo fondos");
	}
	
	public int getFondosReservados() {
		return fondosReservados;
	}

	public void setFondosReservados(int fondosReservados) {
		this.fondosReservados = fondosReservados;
	}

	
}
