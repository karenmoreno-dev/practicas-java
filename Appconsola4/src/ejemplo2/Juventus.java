package ejemplo2;

public class Juventus implements Iequipo {

	private int cantJugadores;
	
	public Juventus() {
		
	};
	
   public Juventus(int cantJugadores) {
		super();
		this.cantJugadores=cantJugadores;
	}

public int getCantJugadores() {
	return cantJugadores;
}

public void setCantJugadores(int cantJugadores) {
	this.cantJugadores = cantJugadores;
}

@Override
public String toString() {
	return "Juventus [cantJugadores=" + cantJugadores + "]";
}

@Override
public String devuelveInformacion() {
	
	return "Equipo juventus...";
};
	
}
