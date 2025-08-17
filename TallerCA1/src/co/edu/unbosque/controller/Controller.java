
package co.edu.unbosque.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.Apoco;
import co.edu.unbosque.model.Estadisticas;
import co.edu.unbosque.view.Gui;

/**
 * Este es el paquete controller. Aca se realizan las siguientes configuraciones
 * entorno al programa.
 * 
 * @author Juan Pablo Ríos Rodríguez.
 */
public class Controller {
	/**
	 * Inicializamos la interfaz grafica del usuario.
	 */
	private static Gui gui;
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
		gui.getPanelPoliticos().getBtnVerArreglo().addActionListener(acciones());
		gui.getPanelPoliticos().getBtnOrdenar().addActionListener(acciones());
		gui.getPanelMatriz().getBtnCrearMatriz().addActionListener(acciones());
		gui.getPanelMatriz().getBtnVerMatriz().addActionListener(acciones());
		gui.getPanelMatriz().getBtnOrdenar().addActionListener(acciones());
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
					if (e.getActionCommand().equals("Generar arreglo.")) {
						apoco.generarPoliticos(
								Integer.parseInt(gui.getPanelPoliticos().getTxtCantidad().getText()));
						gui.mostrarMensaje("Se ha generado el arreglo.\n");
					}else if(e.getActionCommand().equals("Ver arreglo.")) {
						gui.mostrarMensaje("ID \tDinero robado \tEdad \n"+apoco.mostrarPoliticos());
					}else if(e.getActionCommand().equals("Crear Matriz.")) {
						apoco.generarLadrones(Integer.parseInt(gui.getPanelMatriz().getTextLlenarMatriz().getText()));
						gui.mostrarMensaje("Se ha generado la matriz.\n");
					}else if(e.getActionCommand().equals("Ver Matriz.")) {
						gui.mostrarMensaje("Ladrones mostrados \n"+apoco.mostrarLadrones());
					}else if(e.getActionCommand().equals("Ordenar Matriz.")) {
						gui.mostrarMensaje("Ladrones ordenados.\n"+apoco.ordenarLadrones(gui.getPanelMatriz().getComboAlgoritmo().getSelectedIndex()));
					}else {
						System.out.println(e);
					}
				}catch(NullPointerException e1) {
					JOptionPane.showMessageDialog(null, "No has llenado el respectivo elemento.");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Entrada inválida.");
				}
			}
		};
	}
	public static void imprimeEstadisticas(Estadisticas estadisticas) {
		gui.mostrarMensaje(estadisticas.toString());
		
	}
	

}
