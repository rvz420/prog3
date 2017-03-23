package tp1ej1;

public class simulacro {

	public static void main(String[] args) {
		ListaNodo lista = new ListaNodo();

		System.out.println(lista.esVacia());

		lista.agregarElem("elem1");
		lista.agregarElem("elem2");
		lista.agregarElem("elem3");
		System.out.println(lista.toString());

		System.out.println(lista.getAt(0));

		System.out.println(lista.getCantElem());

		System.out.println(lista.esVacia());


		lista.eliminarElemento("elem2");

		System.out.println(lista.toString());

		System.out.println(lista.getCantElem());

		long startTime;
		long totalTime;
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
		lista.agregarElem("-"+i);
		}
		totalTime = System.currentTimeMillis() - startTime;	
		System.out.println("Tiempo en agregar 1.000 elementos: " + 
				totalTime);

	}

}
