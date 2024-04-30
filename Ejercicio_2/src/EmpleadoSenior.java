
public class EmpleadoSenior extends EmpleadoJunior{
	
	private String licenciaAltoNivel;
	
	public EmpleadoSenior(String nombre, String apellido, String genero, int telefono, long numeroSeguridadSocial,
			String puesto, int salario, String licenciaBasica, String licenciaAltoNivel) {
		super(nombre, apellido, genero, telefono, numeroSeguridadSocial, puesto, salario, licenciaBasica);
		this.setLicenciaAltoNivel(licenciaAltoNivel);
	}

	public void trabajar() {
		System.out.println("Yo trabajo mucho y soy senior");
	}
	
	public String getLicenciaAltoNivel() {
		return licenciaAltoNivel;
	}

	public void setLicenciaAltoNivel(String licenciaAltoNivel) {
		this.licenciaAltoNivel = licenciaAltoNivel;
	}

	
}
