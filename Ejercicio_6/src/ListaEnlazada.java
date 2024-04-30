
public class ListaEnlazada {

	private Nodo nodoInicial;
	private int num;
	
/////////////////AÑADIR/////////////////////////////
	
	public void añadirAlInicio(int num) {
		if(estaVacia()) {
			nodoInicial = new Nodo(num);
			return;
		}
		
		Nodo nodoNuevo = new Nodo(num);
		
		nodoNuevo.setSiguiente(nodoInicial);
		nodoInicial = nodoNuevo;
	}
	
	public void añadirDespuesDelNum(int num, int index) {
		if(estaVacia()) {
			System.out.println("Esta vacia, no se puede añadir un nodo en un indice especifico");
			return;
		}
		
		Nodo nodoActual = nodoInicial;
		Nodo nodoNuevo = new Nodo(num);
		
		while(nodoActual.getSiguiente() != null) {
			if(nodoActual.getSiguiente().getNum() == index) {
				nodoNuevo.setSiguiente(nodoActual.getSiguiente().getSiguiente());
				nodoActual.getSiguiente().setSiguiente(nodoNuevo);	
				return;
			}
			nodoActual = nodoActual.getSiguiente();
		}	
	}
	
	public void añadirAlFinal(int num) {
		if(estaVacia()) {
			nodoInicial = new Nodo(num);
			return;
		}
		
		Nodo nodoActual = nodoInicial;
		
		while(nodoActual.getSiguiente() != null) {
			nodoActual = nodoActual.getSiguiente();
		}
		nodoActual.setSiguiente(new Nodo(num));
	}
	
	
/////////////////ELIMINAR/////////////////////////////
	
	public void borrarAlInicio() {
		if(estaVacia()) {
			System.out.println("No se puede borrar el elemento porque la lista esta vacía");
			return;
		}
		
		nodoInicial = nodoInicial.getSiguiente();
	}
	
	public void borrarPorNum(int num) {
		if(estaVacia()) {
			System.out.println("No se puede borrar el elemento porque la lista esta vacía");
			return;
		}
		
		if(nodoInicial.getNum() == num) {
			nodoInicial = nodoInicial.getSiguiente();
			return;
		}
		Nodo nodoActual = nodoInicial;
		
		while(nodoActual.getSiguiente() != null) {
			if(nodoActual.getSiguiente().getNum() == num){
				nodoActual.setSiguiente(nodoActual.getSiguiente().getSiguiente());
				return;
			}
			nodoActual = nodoActual.getSiguiente();
		}		
	}
	
	public void borrarAlFinal(){
		if(estaVacia()) {
			System.out.println("No se puede borrar el elemento porque la lista esta vacía");
			return;
		}
		
		Nodo nodoActual = nodoInicial;
		
		while(nodoActual.getSiguiente().getSiguiente() != null) {
			nodoActual = nodoActual.getSiguiente();
		}
		
		nodoActual.setSiguiente(null);
	}
	
	
/////////////////VERIFICAR/////////////////////////////
	
	public boolean estaVacia() {
		if (nodoInicial == null) return true;
		return false;
	}
	
/////////////////MOSTRAR/////////////////////////////
	
	public void mostrar() {
		if(estaVacia()) {
			System.out.println("Lista vacia");
			return;
		}
		
		Nodo nodoActual = nodoInicial;
		
		while(nodoActual != null) {
			System.out.println("Soy el nodo " + nodoActual.getNum());
			nodoActual = nodoActual.getSiguiente();
		}
		
	}
	
	public Nodo getNodoInicial() {
		return nodoInicial;
	}

	public void setNodoInicial(Nodo nodoInicial) {
		this.nodoInicial = nodoInicial;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
