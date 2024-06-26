
public class Persona {

	private String nombre;
	private String direccion;
	private String fechaDeNacimiento;
	private String sexo;
	
	public Persona() {
		nombre = "";
		direccion = "";
		fechaDeNacimiento = "";
		sexo = "";
	}
	
	public Persona(String nombre, String direccion, String fechaDeNacimiento, String sexo) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
