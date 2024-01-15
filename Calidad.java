public class Calidad {

    public static void main(String[] args) {
        int numero = 5;
        
        // No se utiliza esta variable
        int numeroSinUso;
        
        // Uso de variables con nombres poco descriptivos
        int x = 10;
        int y = 20;
        
        // Bloque de código sin indentación
	    for(int i=0;i<5;i++){
	        System.out.println("Iteración: "+i);
	    }
	    
	    // No se manejan excepciones
	    int[] arreglo = {1, 2, 3};
	    System.out.println(arreglo[2]);
	    
	    // Uso de comentarios inútiles
	    int z = 30; // Esto es z
	    
	    while (true) {
	    	System.out.println("Bucle While true");
	    }
    }

}