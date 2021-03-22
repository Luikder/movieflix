package services;

import datos.GestionPeliculas;
import modelo.Categorias;
import modelo.Pelicula;
import utilidades.LecturaDatos;

public class PeliculasServices implements IPeliculasServices {
	private GestionPeliculas peliculas = new GestionPeliculas();
	public void addPelicula() {
		System.out.println("*    4.-A�adir Peliculas");
		Pelicula p = new Pelicula();
		Integer id = (int) (Math.random() * 100000) + 1;
		peliculas.altaPelicula(id, p);
	}
	public void eliminarPelicula() {
		// Se puede a�adir un trow exception
		int cod = LecturaDatos.leerInt("Introduzca el c�digo de la pel�cula que desea eliminar: ");
		peliculas.eliminarPelicula(cod);
	}
	public void modificarPelicula() {
		int cod = LecturaDatos.leerInt("Introducir el Codigo de la pelicula que quieres eliminar");
		peliculas.modificarPeliculas(cod);
	}
	public void listarPeliculas() {
		System.out.println("*    7.-Listados de todas la Peliculas");
		System.out.println();
		peliculas.imprimirListaPeliculas();
	}
	public void listarPorCategoria() {
		System.out.println("Selecciona una categor�a:");
		Categorias.mostrarCategorias();
		peliculas.listarPorCategoria(LecturaDatos.leerInt());
	}
	public void cargarPeliculas() {
		peliculas.cargarPeliculas();
	}
	
	public void mejorValoradas() {
		System.out.println("*    Listados de Peliculas mejor valoradas");
		System.out.println();
		peliculas.mejorValoradas();
	}
	
}
