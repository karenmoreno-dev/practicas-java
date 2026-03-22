package ejemplo2_List;

import java.util.ArrayList; //implementacion
import java.util.List;

public class EjemploList {
	public static void main(String[] args) {

        // Crear una lista
        List<String> nombres = new ArrayList<>();

        // Agregar elementos
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Pedro");

        // Mostrar toda la lista
        System.out.println(nombres);

        // Acceder a un elemento por índice
        System.out.println(nombres.get(1)); // Luis

        // Recorrer la lista
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Eliminar un elemento
        nombres.remove("Luis");

        // Mostrar lista actualizada
        System.out.println(nombres);
    }

}
