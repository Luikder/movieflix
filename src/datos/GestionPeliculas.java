package datos;

import java.util.HashMap;
import modelo.Categorias;
import modelo.Pelicula;
import modelo.Usuario;

public class GestionPeliculas {

	private HashMap<Integer, Pelicula> peliculas = new HashMap<Integer, Pelicula>();

	public void altaPelicula(Pelicula p, Integer id) {

		// Pelicula p = new Pelicula();

		if (peliculas.containsKey(id)) {

			System.out.println("El c�digo ya existe");

		} else {

			// p.datosPelicula();
			peliculas.put(id, p);

		}

	}

	public Pelicula buscarPelicula(Integer codigo) {
		return peliculas.get(codigo);
	}

	// falta a�adir un exception
	public void eliminarPelicula(Integer codigo) {
		if (peliculas.containsKey(codigo)) {
			peliculas.remove(codigo);
		} else {
			System.out.println("Este id no est� en la lista de peliculas.");
		}

	}

	// metodo modificarPeliculas
	public void modificarPeliculas(Integer id) {
		System.out.println("### Modificaci�n de la Pelicula " + id + " ###");
		peliculas.get(id).datosPelicula();
		System.out.println("### La pelicula ha sido actualizada ###");
		System.out.println(peliculas.get(id).toString());
	}

	public void listarPorCategoria(Integer id) {
		System.out.println("Escoge una categor�a:");
		Categorias.mostrarCategorias();
		System.out.println("*** Categor�a: " + Categorias.getNombreCategoria(id) + " ***");
		for (Integer key : peliculas.keySet()) {
			if (peliculas.get(key).getCategoria().getCodigo() == id) {
				System.out.println(peliculas.get(key));
			}
		}

	}

}
