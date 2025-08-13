
package co.edu.unbosque.controller;

import co.edu.unbosque.view.Gui;

/**
 * Este es el paquete controller. Aca se realizan las siguientes configuraciones entorno al programa.
 * @author Juan Pablo Ríos Rodríguez.
 */
public class Controller {
	
	/**
	 * Creamos un objeto que vendría siendo la interfaz grafica del usuario.
	 */
	private Gui gui;
	
	public Controller() {
		gui = new Gui();
		
	}
}
