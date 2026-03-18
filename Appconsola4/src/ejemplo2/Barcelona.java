package ejemplo2;

public class Barcelona implements Iequipo{
	
private String FechaClub;

public Barcelona () {
	
}

public String getFechaClub() {
	return FechaClub;
}

public void setFechaClub(String fechaClub) {
	FechaClub = fechaClub;
}



@Override
public String toString() {
	return "Barcelona [FechaClub=" + FechaClub + "]";
}
public String devuelveInformacion() {
	
	return "Equipo barcelona";
}



}
