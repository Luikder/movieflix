package gui;

/**
 * @author Tangerine - Luis Rojo - modificado por Virginia Turina
 *
 */
public class Menu {

    /**
     * Clase que muestra por pantalla el men� principal de nuestro videoclub "Movieflix"
     */
    public static void mostrarMenu() {
    	System.out.println(" ");
        System.out.println(" MOVIEFLIX");
        System.out.println(" ");
        System.out.println("************************************************");
        System.out.println("*  Por favor, escoge una opcion: ");
        System.out.println("*    1.-Gesti�n de pel�culas");
        System.out.println("*    2.-Gesti�n de usuarios");
        System.out.println("*    3.-Otras Opciones");
        System.out.println("*    4.-Terminar sesi�n");
        System.out.println("************************************************");
        System.out.println(" ");
        System.out.print(">> ");
    }
    
    public static void subMenuUsuarios() {
	    System.out.println(" ");
	    System.out.println(" GESTIONAR USUARIOS");
	    System.out.println(" ");
	    System.out.println("************************************************");
	    System.out.println("*  Por favor, escoge una opcion: ");
	    System.out.println("*    1.-Dar de alta usuario");
	    System.out.println("*    2.-Eliminar usuario");
	    System.out.println("*    3.-Modificar usuario");
	    System.out.println("*    4.-Volver al men� principal");
	    System.out.println("************************************************");
	    System.out.println(" ");
	    System.out.print(">> ");
    }
    
    public static void subMenuPeliculas() {
        System.out.println(" ");
        System.out.println(" GESTIONAR PELICULAS");
        System.out.println(" ");
        System.out.println("************************************************");
        System.out.println("*  Por favor, escoge una opcion: ");
        System.out.println("*    1.-A�adir pel�cula");
        System.out.println("*    2.-Eliminar pel�cula");
        System.out.println("*    3.-Modificar pel�cula");
        System.out.println("*    4.-Volver al men� principal");
        System.out.println("************************************************");
        System.out.println(" ");
        System.out.print(">> ");
    }
    
    /**
     * @author Tangerine (Virginia Turina)
	 * Clase que muestra por pantalla el submenu "OTRAS OPCIONES"
	 */
    
    public static void subMenuOtros() {
		System.out.println(" ");
        System.out.println(" OTRAS OPCIONES");
        System.out.println(" ");
        System.out.println("************************************************");
        System.out.println("*  Por favor, escoge una opcion: ");
        System.out.println("*    1.-Listado de pel�culas");
        System.out.println("*    2.-Listado de pel�culas por categor�a");
        System.out.println("*    3.-Listado de pel�culas mejor valoradas");
        System.out.println("*    4.-Listado de usuarios");
        System.out.println("*    5.-Volver al menu principal");
        System.out.println("************************************************");
        System.out.println(" ");
        System.out.print(">> ");    	
    }
}
