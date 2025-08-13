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

public class PanelConsole extends JPanel{
	private JScrollPane scroll;
	private JTextArea areaSalida;
	public PanelConsole() {
		setLayout(new BorderLayout(10, 10));
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		areaSalida = new JTextArea(20, 70);
		scroll = new JScrollPane(areaSalida);
		areaSalida.setEnabled(true);
		scroll.setBorder(BorderFactory.createTitledBorder("Salida"));
		add(scroll);
	}
	public JScrollPane getScroll() {
		return scroll;
	}
	public JTextArea getAreaSalida() {
		return areaSalida;
	}
	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}
	public void setAreaSalida(JTextArea areaSalida) {
		this.areaSalida = areaSalida;
	}
	
	
}
