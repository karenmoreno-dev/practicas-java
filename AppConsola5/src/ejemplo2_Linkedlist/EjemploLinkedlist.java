package ejemplo2_Linkedlist;

import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedlist {
	 public static void main(String[] args) {

	        // Usamos la interfaz List pero implementamos con LinkedList
	        List<String> nombres = new LinkedList<>();

	        // Agregar elementos
	        nombres.add("Ana");
	        nombres.add("Luis");
	        nombres.add("Pedro");

	        // Mostrar la lista
	        System.out.println(nombres);

	        // Agregar al inicio
	        ((LinkedList<String>) nombres).addFirst("Carlos");

	        // Agregar al final
	        ((LinkedList<String>) nombres).addLast("Sofía");

	        System.out.println(nombres);

	        // Eliminar un elemento
	        nombres.remove("Luis");

	        System.out.println(nombres);

	        // Recorrer la lista
	        for (String nombre : nombres) {
	            System.out.println(nombre);
	        }
	    }

}
