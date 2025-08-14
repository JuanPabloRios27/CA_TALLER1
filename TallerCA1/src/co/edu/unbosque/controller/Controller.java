
package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Apoco;
import co.edu.unbosque.model.Tiempo;
import co.edu.unbosque.view.Gui;
import co.edu.unbosque.view.Gui;

/**
 * Este es el paquete controller. Aca se realizan las siguientes configuraciones
 * entorno al programa.
 * 
 * @author Juan Pablo Ríos Rodríguez.
 */
public class Controller {
	/**
	 * El tiempo que tomo en recorrer durante el recorrido del respectivo algoritmo
	 */
	private Tiempo tiempo;
	/**
	 * Inicializamos la interfaz grafica del usuario.
	 */
	private Gui gui;
	/**
	 * Inicializamos el objeto que permite demostrar la información completa de la organización APOCO.
	 */
	private Apoco apoco;
	/**
	 * Permite inicializar el modelo y sus componentes.
	 */
	public Controller() {
		gui = new Gui();
		apoco = new Apoco();
		asignarOyentes();
	}
	/**
	 * Se prepara para empezar a escuchar sus respecticos componentes.
	 * @author Juan Pablo Ríos Rodríguez y Alejandro  
	 */
	private void asignarOyentes() {
		gui.getPanelPoliticos().getBtnGenerar().addActionListener(acciones());
	}
	/**
	 * Asigna funciones de parte de cualquier componente que se encuentre en la respectiva interfaz gráfica del usuario.
	 * @author Juan Pablo Ríos Rodríguez y Alejandro  
	 */
	private ActionListener acciones() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (e.getActionCommand().equals("Generar lista.")) {
						apoco.generarPoliticos(
								Integer.parseInt(gui.getPanelPoliticos().getTxtCantidad().getText()));
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Entrada inválida.");
				}
			}
		};
	}

}
