package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 * Este es el panel de las matrices.
 * 
 * @author Alejandro
 */
public class PanelMatriz extends JPanel {
	/**
	 * El respectivo botón que permite crear las matrices.
	 */
	private JButton btnCrearMatriz = new JButton("Crear Matriz");
	/**
	 * El respectivo boton que permite llenar la matriz de tamaño k*m.
	 */
	private JButton btnLlenarMatriz = new JButton("Llenar Matriz");
	/**
	 * 
	 */
	private JButton btnVerMatriz = new JButton("Ver Matriz");
	private JButton btnOrdenar = new JButton("Ordenar lista.");
	private JComboBox<String> comboAlgoritmo = new JComboBox<>(new String[] { "Bubble Sort", "Selection Sort", "Insertion Sort", "Merge Sort", "Quick Sort" });
	private JComboBox<String> comboOrdenamiento = new JComboBox<>(new String[] { "Dinero robado.", "Edad."});
	private JPanel matriz = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
	private JPanel algoritmo = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
	private JPanel opciones = new JPanel(new GridLayout(2, 1, 5, 5));
	
	/**
	 * Ajuste básico del panel de las matrices.
	 * @author Alejandro.
	 */
	public PanelMatriz() {
		// Ajuste los bordes.
		setLayout(new BorderLayout(10, 10));
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		// Asigna los botones.
		agregarElementos();
		add(opciones);
	}
	
	/**
	 * Ajusta el panel donde vamos a agregar los respectivos elementos.
	 * @author Juan Pablo Ríos Rodríguez
	 * 
	 */
	private void agregarElementos() {
		matriz.add(btnCrearMatriz);
		matriz.add(btnLlenarMatriz);
		matriz.add(btnVerMatriz);
		algoritmo.add(comboAlgoritmo);
		algoritmo.add(btnOrdenar);
		opciones.add(matriz);
		opciones.add(algoritmo);
	}
	public JButton getBtnCrearMatriz() {
		return btnCrearMatriz;
	}
	public JButton getBtnLlenarMatriz() {
		return btnLlenarMatriz;
	}
	public JButton getBtnVerMatriz() {
		return btnVerMatriz;
	}
	public JButton getBtnOrdenar() {
		return btnOrdenar;
	}
	public JComboBox<String> getComboAlgoritmo() {
		return comboAlgoritmo;
	}
	public JComboBox<String> getComboOrdenamiento() {
		return comboOrdenamiento;
	}
	public JPanel getMatriz() {
		return matriz;
	}
	public JPanel getAlgoritmo() {
		return algoritmo;
	}
	public JPanel getOpciones() {
		return opciones;
	}
	public void setBtnCrearMatriz(JButton btnCrearMatriz) {
		this.btnCrearMatriz = btnCrearMatriz;
	}
	public void setBtnLlenarMatriz(JButton btnLlenarMatriz) {
		this.btnLlenarMatriz = btnLlenarMatriz;
	}
	public void setBtnVerMatriz(JButton btnVerMatriz) {
		this.btnVerMatriz = btnVerMatriz;
	}
	public void setBtnOrdenar(JButton btnOrdenar) {
		this.btnOrdenar = btnOrdenar;
	}
	public void setComboAlgoritmo(JComboBox<String> comboAlgoritmo) {
		this.comboAlgoritmo = comboAlgoritmo;
	}
	public void setComboOrdenamiento(JComboBox<String> comboOrdenamiento) {
		this.comboOrdenamiento = comboOrdenamiento;
	}
	public void setMatriz(JPanel matriz) {
		this.matriz = matriz;
	}
	public void setAlgoritmo(JPanel algoritmo) {
		this.algoritmo = algoritmo;
	}
	public void setOpciones(JPanel opciones) {
		this.opciones = opciones;
	}
}
