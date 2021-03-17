package datos;

import java.util.HashMap;

import modelo.Pelicula;

public class GestionPeliculas {

	
	private HashMap<Integer, Pelicula> peliculas = new HashMap<Integer, Pelicula>();
	
	
	public void altaPelicula(Pelicula p, Integer id) {
		
		//Pelicula p = new Pelicula();
		
		if (peliculas.containsKey(id)) {
			
			System.out.println("El c�digo ya existe");
			
		} else {
			
			p.datosPelicula();
			peliculas.put(id, p);
			
		}
		
	}
	
	// metodo modificarPeliculas
	public void modificarPeliculas(Integer id) {
		System.out.println("### Modificaci�n de la Pelicula " + id  + " ###");		
		peliculas.get(id).datosPelicula();
		System.out.println("### La pelicula ha sido actualizada ###");
		System.out.println(peliculas.get(id).toString());
	}
	
	
}
