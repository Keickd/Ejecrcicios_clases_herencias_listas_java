/*
 *  La regla general es que un año es bisiesto si es 
 *  divisible entre 4. Sin embargo, hay excepciones: 
 *  los años que son divisibles entre 100 no son bisiestos, 
 *  a menos que también sean divisibles entre 400.
 */

public class Fecha {

	private int dia;
	private int mes;
	private int año;
	private boolean esBisiesto;
	
	public Fecha() {
		dia = 0;
		mes = 0;
		año = 0;
	}
	
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		esBisiesto = validarBisiesto();
		
		if(validar()) {
			System.out.println("Fecha validada correctamente");
		}else {
			System.out.println("Fecha inválida, datos no guardados. Reiniciando fecha...");
			reiniciar();
		}
	}
	
	public void reiniciar() {
		dia = 1;
		mes = 1;
		año = 1900;
	}
	
	public void adelantar(int dias) {
		dia += dias;
		cambiarFecha();	
	}
	
	public boolean validar() {
		
		if(dia > 0 && dia <= 30) {
			if(mes == 4 || mes == 6 || mes == 9 || mes == 11) { //meses de 30
				return true;
			}else if(mes == 2) {
				return validarFebrero();
			}
		}else if(dia > 0 && dia <= 31){
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
					mes == 8 || mes == 10 || mes == 12) { //meses de 31
				return true;
			}else if(mes == 2) {
				return validarFebrero();
			}
		}
		
		return false;
	}
	
	public boolean validarFebrero() {	
		if(dia > 0 && dia <= 28 && !esBisiesto) {
			return true;
		}else if(dia > 0 && dia <= 29 && esBisiesto) {
			return true;
		}else {
			return false;
		}	
	}
	
	public boolean validarBisiesto() {
		if (año % 4 == 0) {
			if (año % 100 == 0) {
				if (año % 400 == 0) {
					return true;
				}else {
					return false;
				}
			}else {
				return true;
			}
		}else {
			return false;
		}
	}
	
	public void cambiarFecha() {
		int diasTotalesMes = 0;
		
		do {
			
			diasTotalesMes = diasTotalesMes();
			
			if(dia > diasTotalesMes) {
				dia -= diasTotalesMes;
				mes++;
			}
			
			if(mes > 12) {
				mes -= 12;
				año++;
				esBisiesto = validarBisiesto();
			}
			
			diasTotalesMes = diasTotalesMes();
			
		}while(dia > diasTotalesMes);
		
	}
	
	public int diasTotalesMes() {
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) return 30;
		else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
				mes == 8 || mes == 10 || mes == 12) return 31;
		else if(mes == 2 && esBisiesto) return 29;
		else if(mes == 2 && !esBisiesto) return 28;
		else return -1;
	}
	
	public void revisarMeses() {
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			
		}else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
				mes == 8 || mes == 10 || mes == 12) {
			
		}else if(mes == 2) {
			
		}
	}
	
	public void visualizar() {
		validar();
		System.out.println(dia + ":" + mes + ":" + año);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

}
