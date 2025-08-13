
package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Apoco;
import co.edu.unbosque.view.Gui;

/**
 * Este es el paquete controller. Aca se realizan las siguientes configuraciones
 * entorno al programa.
 * 
 * @author Juan Pablo Ríos Rodríguez.
 */
public class Controller {

	/**
	 * Creamos un objeto que vendría siendo la interfaz grafica del usuario.
	 */
	private Gui gui;

	private Apoco apoco;

	public Controller() {
		gui = new Gui();
		apoco = new Apoco();
		asignarOyentes();
	}

	private void asignarOyentes() {
		gui.getWindow().getPanelPoliticos().getBtnGenerar().addActionListener(acciones("generarArrPolitico"));
	}

	private ActionListener acciones(String mensaje) {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (e.getActionCommand().equals("Generar lista.")) {
						apoco.generarPoliticos(
								Integer.parseInt(gui.getWindow().getPanelPoliticos().getTxtCantidad().getText()));
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Entrada inválida.");
				}
			}
		};
	}

}
