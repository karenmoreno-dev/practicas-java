package dominio;

public abstract class Animal {
 
	private String nombre;
    
	//constructores
	public Animal() {
		nombre="sin nombre";
	}
	public Animal(String nombre) {
		this.nombre=nombre;
	}
 //getters y setters
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
//metodo toString

@Override
public String toString() {
	return "Es un animal, su nobre es:" + nombre ;
}

//declaro metodo abstracto 
public abstract String habilidades();
 
}
