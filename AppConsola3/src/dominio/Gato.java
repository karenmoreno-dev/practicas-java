package dominio;

public class Gato extends Animal{
	//constructores
	
	public Gato() {
		super();
		
	}
	
	public Gato(String nombre) {
		super(nombre);
	}
	
	//metodo toString

	@Override
	public String toString() {
		return "Es un Gato, se llama "+ getNombre();

	}

	@Override
	public String habilidades() {
		
		return "Los gatos tienen flexibilidad y elasticidad";
	}

	
}
