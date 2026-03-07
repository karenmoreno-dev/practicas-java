package dominio;

public class Principal {
	
	
	// Polimorfismo "muchas formas" 
	// Permite que una referencia de la clase padre apunte a objetos de clases hijas
	// y que se ejecute el método correspondiente al tipo real del objeto.

	public static void main (String[] args) {
		
		Animal animal =new Animal("Animal");
		Gato gato=new Gato("luna");
		Perro perro= new Perro("Huesos","Galgo");
		
	/*	System.out.println(animal.toString());
		System.out.println(gato.toString());
		System.out.println(perro.toString());
		
		*/
		
		//un objeto de la clase hija se puede guardar dentro de un objeto de la clase padre 
		
		Animal[] animales= new Animal[3];// distintos tipos de animales convivan en la misma colección
		animales[0]=animal;
		animales[1]=gato;
		animales[2]=perro;
		
		for(Animal a: animales) {
			System.out.println(a.toString());
		}
	}
}
