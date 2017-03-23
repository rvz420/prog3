package tp1ej1;

public class ListaNodo {

	private Nodo nodoPadre;
	private int cantElem;

	public ListaNodo(){
		this.nodoPadre = null;
		this.cantElem = 0;
	}
	
	public void agregarElem(String e){
		//agrega al final
		if(nodoPadre == null){
			nodoPadre = new Nodo(e);
		}else{
			Nodo nodoActual = nodoPadre;
			while(nodoActual.getSig() != null){
				nodoActual = nodoActual.getSig();
			}
			nodoActual.setSig(new Nodo(e));
		}
		this.cantElem++;
	}

	public void eliminarElemento(String elem){
		if(nodoPadre != null){
			Nodo nodoActual = nodoPadre;
			Nodo nodoAnterior = null;

			if(nodoPadre.getElem().equals(elem)){
				nodoPadre = nodoPadre.getSig(); //Eliminar si se encuentra en primer lugar
			}else{
				do{
					nodoAnterior = nodoActual;
					nodoActual = nodoActual.getSig();
					if(nodoActual.getElem().equals(elem)){
						nodoAnterior.setSig(nodoActual.getSig());
					}
				}while(nodoActual.getSig() != null); //Eliminar si se encuentra en pos>1
			}
			this.cantElem--;
		}
	}

	public boolean esVacia(){
		return nodoPadre == null;
	}

	public String getAt(int pos){
		String retorno ="";
		Nodo nodoActual = nodoPadre;
		if(pos<this.cantElem){
			for (int i = 0; i < pos; i++) {
				nodoActual = nodoActual.getSig();
			}
			retorno = nodoActual.getElem();
		}
		return retorno;
	}
	
	public void elementosComunes(ListaNodo otraLista){
		ListaNodo listaAux;
		||
	}
	
	public String toString() {
		String salida = "";
		if(nodoPadre != null){
			Nodo nodoActual = nodoPadre;
			do{
				salida += nodoActual.toString();
				nodoActual = nodoActual.getSig();
			}while(nodoActual.getSig() != null);

			salida += nodoActual.toString();
		}
		return salida;
	}

	public int getCantElem() {
		return cantElem;
	}
}
