package ejemplo2;

public class Principal {

	public static void main(String[] args) {
	
		Barcelona b =new Barcelona();
		b.setFechaClub("01/01/89");
		
		Juventus j =new Juventus();
		j.setCantJugadores(35);
		
		// La interfaz permite trabajar con distintos tipos de objetos (Barcelona, Juventus)
		// sin depender de una clase concreta (desacoplamiento)

		// Inyectamos la dependencia pasando el objeto como parámetro (setter o constructor)
	
		Messi messi=new Messi();
		messi.setEquipo(b);
		messi.setNacionalidad("Argentina");
		
		System.out.println(messi.toString());
		
		//inyeccion por constructor
		
		/*Messi messi = new Messi("Argentina", b);
		System.out.println(messi);*/
		
		
   
	}
	
	
	/*                 INTERFACES 
	   -Permiten usar objetos de distintas clases
       -Evitan dependencia de clases concretas
       -Facilitan el cambio de implementaciones
       -Ocultan la implementación interna y exponen solo los métodos necesarios*/

}
