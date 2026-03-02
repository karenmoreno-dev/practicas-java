package dominio;

public class Articulo {
   
	// Atributos privados para garantizar el encapsulamiento y controlar el acceso mediante métodos
	
	private int id;
	private String nombre;
	private static int cont=0; // Contador estático para generar IDs automáticamente (pertenece a la clase, no a cada objeto)
	
	//metodo que pertenece a la clase 
	public static int devuelveProximoid() {
		return cont+1; 
	}
	
	
	//constructores	
	
	public Articulo(){
		cont++;
		this.id=cont;
		//id=0;
		this.nombre="Sin nombre";
	}
	
	public Articulo(String nombre){ // int id 
		cont++;
		this.id=cont;
		//this.id=id;
		this.nombre=nombre;
	}
	
	//get y setters 
	public int getId() {
		return id;
	}
	/*public void setId(int id) {
		this.id = id;
	}*/
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Articulo ID =" + id + ", NOMBRE =" + nombre ;
	}
	
	//metodo toString() devuelve la informacion del articulo
	
	
	
}
