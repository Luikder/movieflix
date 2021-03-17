package control;

import datos.GestionPeliculas;
import datos.GestionUsuarios;
import gui.Menu;
import modelo.Categorias;
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
            	 int cod;
            	 cod=LecturaDatos.leerInt("Introduce el c�digo del usuario que quieres eliminar ");
            	 usuarios.eliminarUsuario(cod);
                 break;

             case 3:
                 //MODIFICAR USUARIO
                 break;

             case 4:
                 //A�ADIR PELICULAS
                 break;

             case 5:
                 //ELIMINAR PELICULAS
                 break;

             case 6:
                 //MODIFICAR PELICULAS
                 break;

             case 7:
                 //LISTADO DE TODAS LAS PEL�CULAS
                 break;

             case 8:
            	 //Listado de pel�culas por categor�a
            	 System.out.println("Selecciona una categor�a:");
            	 Categorias.mostrarCategorias();
            	 peliculas.listarPorCategoria(LecturaDatos.leerInt());
            	 break;
            	 
             case 9:
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
		menuPrincipal(listadoPeliculas, listadoUsuarios);
	}

}