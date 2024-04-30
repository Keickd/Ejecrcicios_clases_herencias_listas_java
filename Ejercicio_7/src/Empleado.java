
public class Empleado {

	private long DNI;
	private double sueldoBase;
	private double pagoHoraExtras;
	private double horasExtrasAlMes;
	private int tipoIRPF;
	private boolean casado;
	private int numeroHijos;
	
	public Empleado(long DNI) {
		this.DNI = DNI;
		
		sueldoBase = 20000;
		pagoHoraExtras = 16;
		horasExtrasAlMes = 20;
		tipoIRPF = 18;
		casado = true;
		numeroHijos = 2;
	}
	
	
	public double devolucionComplementoHorasExtras() {
		return pagoHoraExtras * horasExtrasAlMes;
	}
	
	public double devolucionSueldoBruto() {
		return devolucionComplementoHorasExtras() + sueldoBase;
	}
	
	public double devolucionRetenciones() {
		if(casado) return (devolucionSueldoBruto() * (tipoIRPF - 2 - (1 * numeroHijos))) / 100;
		return (devolucionSueldoBruto() * (tipoIRPF - (1 * numeroHijos))) / 100;
	}
	
	public double sueldoNeto() {
		return devolucionSueldoBruto() - devolucionRetenciones();
	}
	
	public void visualizacionBasica(){
		System.out.println("El DNI es " + DNI);
		
		if(casado) System.out.println("Esta casado");
		else System.out.println("No esta casado");
		
		if(numeroHijos == 0) System.out.println("No tiene hijos");
		else if(numeroHijos == 1) System.out.println("Tiene un hijo");
		else System.out.println("Tiene hijos");
	}
	
	public void visualizacionCompleta() {
		visualizacionBasica();
		
		System.out.println("Sueldo base " + sueldoBase);
		System.out.println("Complemento por horas extras " + pagoHoraExtras);
		System.out.println("Sueldo bruto " + devolucionSueldoBruto());
		System.out.println("Retenciones IRPF " + devolucionRetenciones());
		System.out.println("Sueldo neto " + sueldoNeto());
	}
	
	public long getDNI() {
		return DNI;
	}

	public void setDNI(long dNI) {
		DNI = dNI;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getPagoHoraExtras() {
		return pagoHoraExtras;
	}

	public void setPagoHoraExtras(double pagoHoraExtras) {
		this.pagoHoraExtras = pagoHoraExtras;
	}

	public double getHorasExtrasAlMes() {
		return horasExtrasAlMes;
	}

	public void setHorasExtrasAlMes(double horasExtrasAlMes) {
		this.horasExtrasAlMes = horasExtrasAlMes;
	}

	public int getTipoIRPF() {
		return tipoIRPF;
	}

	public void setTipoIRPF(int tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}
	
	
}
