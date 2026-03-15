package ejemplo1;

public class Cantante extends Persona implements ICantar{
	private boolean estudios;
	
	public Cantante() {
		
	}
	
	public Cantante(String nombre, String apellido,boolean estudios) {
		super(nombre,apellido);
		this.estudios=estudios;
	}
	

	@Override
	public void cantar() {
		System.out.println("LALALALA LALAALALA");
		
		
	}
	
	

	public boolean isEstudios() {
		return estudios;
	}

	public void setEstudios(boolean estudios) {
		this.estudios = estudios;
	}

	@Override
	public String toString() {
		return "Cantante [estudios=" + estudios + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
}
