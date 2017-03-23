package tp1ej1;

public class Nodo {
	private String elem;
	private Nodo sig;

	public Nodo(String elem){
		this.elem = elem;
		this.sig = null;
	}

	public String getElem() {
		return elem;
	}

	public void setElem(String elem) {
		this.elem = elem;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}

	
	public String toString() {
		return "[" + this.elem + "]->";
	}



}
