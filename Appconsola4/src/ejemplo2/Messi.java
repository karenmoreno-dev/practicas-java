package ejemplo2;

public class Messi {
	
private String nacionalidad;
private Iequipo equipo;  // atributo de tipo interfaz (puede ser cualquier equipo)

//constructores
public Messi() {
      
}
public Messi(String nacionalidad, Iequipo  equipo) {
      super();
      this.nacionalidad=nacionalidad;
      this.equipo=equipo;
}
//getters y setters
public String getNacionalidad() {
	return nacionalidad;
}

public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}


//barcelona
public Iequipo getEquipo() {
	return equipo;
	}

public void setEquipo(Iequipo equipo) {
	this.equipo = equipo;
}
@Override
public String toString() {
	return "Messi [nacionalidad=" + nacionalidad + ", equipo=" + equipo + "]";
}





}
