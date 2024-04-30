
import java.util.Scanner;

public class Empleado extends Persona{

	private String nss;
	private double sueldo;
	
	public Empleado() {
		super();
		nss = "";
		sueldo = 0;
	}
	
	public Empleado(String nombre, String direccion, String fechaDeNacimiento, String sexo, String nss, double sueldo) {
		super(nombre, direccion, fechaDeNacimiento, sexo);
		this.nss = nss;
		this.sueldo = sueldo;
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
		
		System.out.println("Introduce el nss: ");
		nss = scanner.nextLine();
		System.out.println("Introduce el sueldo: ");
		sueldo = scanner.nextInt();
	}
	
	public void mostrar() {
		System.out.println("El nombre es " + getNombre());
		System.out.println("La dirección es " + getDireccion());
		System.out.println("La fecha de nacimiento es " + getFechaDeNacimiento());
		System.out.println("El sexo es " + getSexo());
		
		System.out.println("El nss " + nss);
		System.out.println("El sueldo es " + sueldo);
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
}
