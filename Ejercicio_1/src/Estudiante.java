import java.util.Scanner;

public class Estudiante extends Persona{

	private String nExpediente;
	private double nota;
	
	public Estudiante() {
		super();
		nExpediente = "";
		nota = 0;
	}
	
	public Estudiante(String nombre, String direccion, String fechaDeNacimiento, String sexo, String nExpediente, double nota) {
		super(nombre, direccion, fechaDeNacimiento, sexo);
		this.nExpediente = nExpediente;
		this.nota = nota;
	}
	
	public void leer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el nombre: ");
		setNombre(scanner.nextLine());
		System.out.println("Introduce la direccion: ");
		setDireccion(scanner.nextLine());
		System.out.println("Introduce la fecha de nacimiento en formato dd/mm/yyyy: ");
		setFechaDeNacimiento(scanner.nextLine());
		System.out.println("Introduce el sexo: ");
		setSexo(scanner.nextLine());
		
		System.out.println("Introduce el nº expediente: ");
		nExpediente = scanner.nextLine();
		System.out.println("Introduce la nota: ");
		nota = scanner.nextInt();
	}
	
	public void mostrar() {
		System.out.println("El nombre es " + getNombre());
		System.out.println("La dirección es " + getDireccion());
		System.out.println("La fecha de nacimiento es " + getFechaDeNacimiento());
		System.out.println("El sexo es " + getSexo());
		
		System.out.println("El nº expediente es " + nExpediente);
		System.out.println("La nota es " + nota);
	}

	public String getnExpediente() {
		return nExpediente;
	}

	public void setnExpediente(String nExpediente) {
		this.nExpediente = nExpediente;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
}
