package ejemplo3_HashCode;

public class Principal {

	public static void main(String[] args) {
		String nombre1= "Karen";
		String nombre2= "Karen";
		System.out.println(nombre1.hashCode());
		System.out.println(nombre2.hashCode());
		
		Persona x =new Persona();
		x.setNombre("kali");
		x.setApellido("uchis");
		System.out.println(x.hashCode());
		
		Persona y = new Persona();
		y.setNombre("kali");
		System.out.println(y.hashCode());
	}

}
