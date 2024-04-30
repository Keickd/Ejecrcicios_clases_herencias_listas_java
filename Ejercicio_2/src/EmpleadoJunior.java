
public class EmpleadoJunior extends Empleado {
	
	private String licenciaBasica;
	
	public EmpleadoJunior(String nombre, String apellido, String genero, int telefono, long numeroSeguridadSocial,
			String puesto, int salario, String licenciaBasica) {
		super(nombre, apellido, genero, telefono, numeroSeguridadSocial, puesto, salario);
		this.setLicenciaBasica(licenciaBasica);
	}
	
	public void obtenerLicencia() {
		System.out.println("Obteniendo licencia");
	}
	
	public void trabajar() {
		System.out.println("Soy junior y cobro menos de lo que merezco");
	}

	public String getLicenciaBasica() {
		return licenciaBasica;
	}

	public void setLicenciaBasica(String licenciaBasica) {
		this.licenciaBasica = licenciaBasica;
	}
	

}
