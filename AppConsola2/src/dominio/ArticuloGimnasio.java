package dominio;

// Herencia   palabra reservada ---extends---
public class ArticuloGimnasio extends Articulo {
	
 private int peso;
 
 //constructores
 public ArticuloGimnasio() {
	 
	 super(); //llamando al constructor del padre Articulo
	 
 }
 
 public ArticuloGimnasio(String nombre, int peso){
	 
	 super(nombre); //asigno el nombre 
	 this.peso=peso;
	 
 }

public int getPeso() {
	return peso;
}

public void setPeso(int peso) {
	this.peso = peso;
}

@Override
public String toString() {
	
	return super.toString()+", PESO=" + peso;
}
 

}
