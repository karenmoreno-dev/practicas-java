package dominio;

public class Principal {

	public static void main(String[] args) {
     
	  /*
	 
	  //objeto
      Articulo art1 =new Articulo();
      //art1.setId(1);
      art1.setNombre("Articulo(1)");
      //System.out.println("ID: "+art.getId()+" - Nombre: "+art.getNombre());
      
      System.out.println(art1.toString()); 
      
      Articulo art2 =new Articulo();
      //art2.setId(2);
      art2.setNombre("Articulo(2)");  
      System.out.println(art2.toString());
      
      Articulo art3 =new Articulo();
      //art3.setId(3);
      art3.setNombre("Articulo(3)");  
      System.out.println(art3.toString());
      
      */
		
		
      Articulo[] vart =new Articulo[3];
      vart[0]= new Articulo ("articulo 1");
      vart[1]= new Articulo ("articulo 2");
      vart[2]= new Articulo ("articulo 3");
      
      for (Articulo articulo: vart) {
    	  System.out.println(articulo.toString());
      }
      
      System.out.println(Articulo.devuelveProximoid());
      
      Articulo art4 =new Articulo();
      art4.setNombre("Articulo(4)");  
      System.out.println(art4.toString());
      
      System.out.println(Articulo.devuelveProximoid());
      
	}

}
