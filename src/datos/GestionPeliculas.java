package datos;

import java.util.HashMap;

import modelo.Categorias;
import modelo.Pelicula;

public class GestionPeliculas {

	
	private HashMap<Integer, Pelicula> peliculas = new HashMap<Integer, Pelicula>();
	
	
	public void altaPelicula(Pelicula p, Integer id) {
		
		//Pelicula p = new Pelicula();
		
		if (peliculas.containsKey(id)) {
			
			System.out.println("El c�digo ya existe");
			
		} else {
			
			//p.datosPelicula();
			peliculas.put(id, p);
			
		}
		
	}
	
	public void listarPorCategoria(Integer id) {
		System.out.println("Escoge una categor�a:");
		Categorias.mostrarCategorias();
		System.out.println("*** Categor�a: " + Categorias.getNombreCategoria(id) + " ***");
		for(Integer key: peliculas.keySet()) {
			if(peliculas.get(key).getCategoria().getCodigo() == id) {
				System.out.println(peliculas.get(key));
			}
		}
	}
	
	
}
