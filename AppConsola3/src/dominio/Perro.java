package dominio;

public class Perro extends Animal {
   
	private String raza;

	//constructores
	public Perro () {
	  super();
	  raza= "sin nombre";	
	}
	
	public Perro (String nombre, String raza) {
		super(nombre);
		this.raza =raza;
	}
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Es un Perro su nombre es: " +getNombre()+ " y su raza es " +raza ;
	}
	
	
}
