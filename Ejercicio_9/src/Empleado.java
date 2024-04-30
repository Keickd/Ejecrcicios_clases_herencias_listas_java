
import java.util.Scanner;

public class Empleado {

	private String nombre;
	private int numero;
	
	public Empleado() {
		nombre = "";
		numero = 0;
	}
	
	public Empleado(String nombre, int numero) {
		this.nombre = nombre;
		this.numero = numero;
	}
	
	public void leerDatos() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce  el nombre del empleado: ");
		nombre = scanner.nextLine();
		System.out.println("Introduce  el numero del empleado: ");
		numero = scanner.nextInt();
		System.out.println();
	}
	
	public void verDatos(){
		System.out.println("El nombre del empleado es " + nombre);
		System.out.println("El número del empleado es " + numero + "\n");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
