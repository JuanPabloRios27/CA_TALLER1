package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
/**
 * Esta clase permite ajustar el panel de la consola.
 * En ella vamos a personalizar los resultados del respectivo algoritmo.
 * @author Alejandro
 */
public class PanelConsole extends JPanel{
	/**
	 * Este scroll permititra ubicar visualizar los diferentes resultados entorno al programa.
	 */
	private JScrollPane scroll;
	/**
	 * El texto que muestra la salida del programa computacional.
	 */
	private JTextArea areaSalida;
	/**
	 * El constructor del panel consola.
	 * @author Juan Pablo Ríos Rodríguez.
	 */
	public PanelConsole() {
		setLayout(new BorderLayout(10, 10));
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		areaSalida = new JTextArea(20, 70);
		scroll = new JScrollPane(areaSalida);
		areaSalida.setEnabled(true);
		scroll.setBorder(BorderFactory.createTitledBorder("Salida"));
		add(scroll);
	}
	/**
	 * Tome información con respecto al JScrollPane.
	 * @return scroll El scroll que permite revisar la salida del programa.
	 */
	public JScrollPane getScroll() {
		return scroll;
	}
	/**
	 * Tome información con respecto al texto de salida.
	 * @return areaSalida el textArea que mostrara la respectiva salida del programa.
	 */
	public JTextArea getAreaSalida() {
		return areaSalida;
	}
	/**
	 * Modifica la información con respecto al JScrollPane.
	 * @param scroll El scroll que permite revisar la salida del programa.
	 */
	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}
	/**
	 * Modifica el texto de salida.
	 * @param areaSalida el textArea que mostrara la respectiva salida del programa.
	 */
	public void setAreaSalida(JTextArea areaSalida) {
		this.areaSalida = areaSalida;
	}
	
	
}
