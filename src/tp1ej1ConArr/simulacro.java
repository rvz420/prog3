package tp1ej1ConArr;

public class simulacro {

	public static void main(String[] args) {
		arreglo arr = new arreglo();
		


		

		
		long startTime;
		long totalTime;
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 90000; i++) {
			arr.agregarAlPrincipio("-"+i);
		}
		totalTime = System.currentTimeMillis() - startTime;	
		System.out.println("Tiempo en agregar 1.000 elementos: " + 
				totalTime);

	}

}
