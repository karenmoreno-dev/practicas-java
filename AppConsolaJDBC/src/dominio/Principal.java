package dominio;

public class Principal {

	public static void main(String[] args) {
		
		UsuarioDao usuarioDao =new UsuarioDao();
		
		Usuario usuario1 = new Usuario();
		usuario1.setNombre("maria");
		usuario1.setApellido("fernandez");
		
		int filas = usuarioDao.agregarUsuario(usuario1);
		
		if (filas==1) {
			System.out.println("usuario agregado");
		}else {
			System.out.println("usuario no agregado");
		}

	}

}
