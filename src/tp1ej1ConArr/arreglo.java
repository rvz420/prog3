package tp1ej1ConArr;

public class arreglo {
	
	String[] arreglo;
	int cantElem = 0;
	
	public arreglo(){
		arreglo = new String[10000];
	}
	
	public void agregarAlPrincipio(String elem){
		
		if (this.cantElem == 0){
			arreglo[0] = elem;
		}else{
			for (int i = this.cantElem; i > 0; i--) {
				this.arreglo[i] = this.arreglo[i-1];
			}
			arreglo[0] = elem;
		}
		
		this.cantElem++;
		
	}
	
	public void eliminarAt(int pos){
		//recordar excepcion de eliminar un null
		for (int i = pos; i < arreglo.length-1; i++) {
			arreglo[i] = arreglo[i+1];
		}
		this.cantElem--;
		arreglo[cantElem] = null;
	}
	
	public void insertarAt(int pos, String elem){
		for (int i = this.arreglo.length-1; i > pos; i--) {
			this.arreglo[i] = this.arreglo[i-1];
		}
		this.arreglo[pos] = elem;
	}
	
	public int getCantElem(){
		return this.cantElem;
	}
	
	public String elemAt(int pos){
		return arreglo[pos];
	}
	
	public String toString(){
		String retorno="";
		for (int i = 0; i < arreglo.length; i++) {
			retorno += "["+this.arreglo[i]+"]";
		}
		return retorno;
	}
}
