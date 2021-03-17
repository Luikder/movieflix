package datos;

import java.util.HashMap;
import java.util.Map;

import modelo.Usuario;

public class GestionUsuarios {
	private Map<Integer, Usuario> listaUsuarios = new HashMap<>();

	public GestionUsuarios() {

	}

	public GestionUsuarios(Map<Integer, Usuario> listaUsuarios) {
		super();
		this.listaUsuarios = listaUsuarios;
	}

	public Map<Integer, Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(Map<Integer, Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public boolean existeUsuario(Integer codigo) {
		return listaUsuarios.containsKey(codigo);
	}

	public Usuario buscarUsuario(Integer codigo) {
		return listaUsuarios.get(codigo);
	}

	// TODO A�adir throw exception y se puede mirar c�mo se genera el c�digo
	public void altaUsuarios(Integer codigo, Usuario user) {
		if (listaUsuarios.containsKey(codigo)) {
			System.out.println("Este id ya est� en la lista de usuarios.");
		} else {
			listaUsuarios.put(codigo, user);
		}
	}

	public void modificarUsuario(Integer codigo) {
		System.out.println("### Modificaci�n del usuario con c�digo " + codigo + " ###");
		listaUsuarios.get(codigo).crearUsuario();
		System.out.println("### Usuario actualizado ###");
		System.out.println(listaUsuarios.get(codigo).toString());
	}

	// metodo eliminarUsuario, falta a�adir exception
	
<<<<<<< HEAD
	public void eliminarUsuario(Integer codigo) {
		if (listaUsuarios.containsKey(codigo)) {
			listaUsuarios.remove(codigo);
			System.out.println("### Eliminaci�n del usuario con c�digo " + codigo + " ###");
			System.out.println("### Usuario eliminado ###");
		} else {
			System.out.println("El usuario no existe ");
		}

	}

=======
	public void listarUsuarios() {
		System.out.println("### Listado de usuarios ###");
		for(Integer key: listaUsuarios.keySet()) {
			System.out.println(listaUsuarios.get(key).toString());
		}
	}
	
>>>>>>> 230c4cdf3faf8e14148b103f69f6ca85951977b5
}
