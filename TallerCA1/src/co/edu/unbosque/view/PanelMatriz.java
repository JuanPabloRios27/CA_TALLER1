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
	private JButton btnVerMatriz = new JButton("Ver Matriz");
	private JTextArea areaSalida = new JTextArea(20, 70);;
	private JButton btnOrdenar = new JButton("Ordenar lista.");
	private JComboBox<String> comboAlgoritmo = new JComboBox<>(new String[] { "Bubble Sort", "Selection Sort", "Insertion Sort", "Merge Sort", "Quick Sort" });
	private JComboBox<String> comboOrdenamiento = new JComboBox<>(new String[] { "Dinero robado.", "Edad."});
	private JPanel matriz = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));;
	private JPanel algoritmo = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));;
	private JPanel opciones = new JPanel(new GridLayout(2, 1, 5, 5));;
	private JScrollPane scroll = new JScrollPane(areaSalida);;
	
	/**
	 * Ajuste básico del panel de las matrices.
	 * @author Alejandro.
	 */
	public PanelMatriz() {
		// Ajuste los bordes.
		setLayout(new BorderLayout(10, 10));
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		ajustarPaneles();
		// Asigna los botones.
		agregarElementos();
		add(opciones, BorderLayout.NORTH);
		add(scroll, BorderLayout.CENTER);
	}
	/**
	 * Ajusta el panel donde vamos a ver las matrices.
	 * @author Juan Pablo Ríos Rodríguez
	 * 
	 */
	private void ajustarPaneles() {
		areaSalida.setEditable(false);
		scroll.setBorder(BorderFactory.createTitledBorder("Salida"));
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

}
