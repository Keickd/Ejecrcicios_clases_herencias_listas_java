
public class Main {

	public static void main(String[] args) {
		
		Estudiante estudiante = new Estudiante();
		Empleado empleado = new Empleado();
		
		estudiante.leer();
		System.out.println();
		estudiante.mostrar();
		System.out.println();
		
		empleado.leer();
		System.out.println();
		empleado.mostrar();
	}

}
