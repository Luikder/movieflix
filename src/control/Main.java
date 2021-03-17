package control;

import datos.GestionPeliculas;
import datos.GestionUsuarios;
import gui.Menu;
import modelo.Pelicula;
import modelo.Usuario;
import utilidades.LecturaDatos;

public class Main {
	
	
	public static void menuPrincipal (GestionPeliculas peliculas, GestionUsuarios usuarios) {
		boolean seguir = true;
		do {
			Menu.mostrarMenu();
	         switch (LecturaDatos.leerInt()) {
             case 1:
                 //ALTA DE UN USUARIOS
            	 Usuario user = new Usuario();
            	 user.crearUsuario();
            	 usuarios.altaUsuarios((int) Math.random()*10000 + 1, user);
                 break;

             case 2:
                 //ELIMINAR UN USUARIO
                 break;

             case 3:
                 //MODIFICAR USUARIO
                 break;

             case 4:
                 //A�ADIR PELICULAS
            	 System.out.println("*    4.-A�adir Peliculas");
            	 
            	 Pelicula p = new Pelicula();
            	 Integer id = (int) Math.random()*100000 +1;
            	 
            	 peliculas.altaPelicula(id , p);
            	 
            	 
                 break;

             case 5:
                 //ELIMINAR PELICULAS
                 break;

             case 6:
                 //MODIFICAR PELICULAS
                 break;

             case 7:
                 //LISTADO DE TODAS LAS PEL�CULAS
            	 System.out.println("*    7.-Listados de todas la Peliculas");
            	 System.out.println();
            	 
            	 peliculas.imprimirListaPeliculas();
            	 
            	 
                 break;

             case 8:
                 //PEL�CULAS MEJOR VALORADAS
                 break;

             case 0:
            	 //Se puede a�adir m�todo para confirmar que se quiere salir
                 seguir = false;
                 break;
             
             default:
            	 System.out.println("La opci�n escogida no es v�lida. Escoge otra opci�n");
            	 break;
	         }
		} while (seguir);
	}
	
	public static void main(String[] args) {
		GestionPeliculas listadoPeliculas = new GestionPeliculas();
		GestionUsuarios listadoUsuarios = new GestionUsuarios();
		listadoPeliculas.cargarPeliculas();
		menuPrincipal(listadoPeliculas, listadoUsuarios);
	}

}