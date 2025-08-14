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
	 * 
	 */
	private JScrollPane scroll;
	/**
	 * 
	 */
	private JTextArea areaSalida;
	/**
	 * 
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
	 * 
	 * @return
	 */
	public JScrollPane getScroll() {
		return scroll;
	}
	/**
	 * 
	 * @return
	 */
	public JTextArea getAreaSalida() {
		return areaSalida;
	}
	/**
	 * 
	 * @param scroll
	 */
	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}
	/**
	 * 
	 * @param areaSalida
	 */
	public void setAreaSalida(JTextArea areaSalida) {
		this.areaSalida = areaSalida;
	}
	
	
}
