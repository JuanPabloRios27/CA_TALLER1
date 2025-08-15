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
	private JButton btnCrearMatriz;
	/**
	 * El respectivo boton que permite llenar la matriz de tamaño k*m.
	 */
	private JButton btnLlenarMatriz;
	/**
	 * El respectivo boton que permite ver la respectiva matriz.
	 */
	private JButton btnVerMatriz;
	private JButton btnOrdenar;
	private JComboBox<String> comboAlgoritmo;
	private JComboBox<String> comboOrdenamiento;
	private JPanel matriz;
	private JPanel algoritmo;
	private JPanel opciones;
	
	/**
	 * Ajuste básico del panel de las matrices.
	 * @author Alejandro.
	 */
	public PanelMatriz() {
		// Ajuste los bordes.
		setLayout(new BorderLayout(10, 10));
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		btnCrearMatriz = new JButton("Crear Matriz");
		btnLlenarMatriz = new JButton("Llenar Matriz");
		btnVerMatriz = new JButton("Ver Matriz");
		btnOrdenar = new JButton("Ordenar lista.");
		comboAlgoritmo = new JComboBox<>(new String[] { "Bubble Sort", "Selection Sort", "Insertion Sort", "Merge Sort", "Quick Sort" });
		comboOrdenamiento = new JComboBox<>(new String[] { "Dinero robado.", "Edad."});
		matriz = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		algoritmo = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		opciones = new JPanel(new GridLayout(2, 1, 5, 5));
		// Asigna los botones.
		agregarElementos();
		add(opciones);
	}
	
	/**
	 * Ajusta el panel donde vamos a agregar los respectivos elementos.
	 * @author Alejandro
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
	/**
	 * Obtenga información con respecto al botón que genera la matriz.
	 * @return btnCrearMatriz el respectivo botón que crea la matriz.
	 */
	public JButton getBtnCrearMatriz() {
		return btnCrearMatriz;
	}
	/**
	 * Obtenga información con respecto al botón que llena la matriz.
	 * @return btnLlenarMatriz el respectivo botón que llena la matriz.
	 */
	public JButton getBtnLlenarMatriz() {
		return btnLlenarMatriz;
	}
	/**
	 * Obtenga información con respecto al botón que visualiza la matriz.
	 * @return btnVerMatriz el respectivo botón que visualiza la matriz.
	 */
	public JButton getBtnVerMatriz() {
		return btnVerMatriz;
	}
	/**
	 * Obtenga el botón que ordene la matriz
	 * @return btnOrdenar el botón que ordena la matriz.
	 */
	public JButton getBtnOrdenar() {
		return btnOrdenar;
	}
	/**
	 * Obtenga la caja de opciones con respecto a que algoritmo de ordenamiento debemos utilizar.
	 * @return comboAlgoritmo La caja de opciones con respecto a que algoritmo de ordenamiento debemos utilizar.
	 */
	public JComboBox<String> getComboAlgoritmo() {
		return comboAlgoritmo;
	}
	/**
	 * Obtenga la caja de ordenamiento con respecto a que forma vamos a ordenar la matriz (Edad o dinero robado).
	 * @return comboOrdenamiento La caja de opciones con respecto a que algoritmo de ordenamiento debemos utilizar.
	 */
	public JComboBox<String> getComboOrdenamiento() {
		return comboOrdenamiento;
	}
	/**
	 * Obtenga el conjunto de opciones con respecto a la matriz.
	 * @return matriz El conjunto de opciones que gestiona la matriz.
	 */
	public JPanel getMatriz() {
		return matriz;
	}
	/**
	 * Obtenga el conjunto de opciones generales.
	 * @return matriz El conjunto de opciones generales.
	 */
	public JPanel getAlgoritmo() {
		return algoritmo;
	}
	/**
	 * Modifique el panel general
	 * @return opciones El panel general en donde estara ubicadas todas las opciones e interacciones con respecto a la gestión de la respectiva matriz.
	 */
	public JPanel getOpciones() {
		return opciones;
	}
	/**
	 * Modifique el botón que crea la matriz.
	 * @param btnCrearMatriz el botón que genere una matriz.
	 */
	public void setBtnCrearMatriz(JButton btnCrearMatriz) {
		this.btnCrearMatriz = btnCrearMatriz;
	}
	/**
	 * Modifique el botón que llena la matriz.
	 * @param btnLlenarMatriz el botón que llena la matriz
	 */
	public void setBtnLlenarMatriz(JButton btnLlenarMatriz) {
		this.btnLlenarMatriz = btnLlenarMatriz;
	}
	/**
	 * Modifique el botón que permita ver la matriz gestionada e ordenada.
	 * @param btnVerMatriz el botón que permite ver la respectiva matriz.
	 */
	public void setBtnVerMatriz(JButton btnVerMatriz) {
		this.btnVerMatriz = btnVerMatriz;
	}
	/**
	 * Modifique el botón que ordena la matriz.
	 * @param btnOrdenar el botón que ordena la matriz.
	 */
	public void setBtnOrdenar(JButton btnOrdenar) {
		this.btnOrdenar = btnOrdenar;
	}
	/**
	 * Modifica la caja de opciones de los algoritmos.
	 * @param comboAlgoritmo La caja de opciones para seleccioar los algoritmos de ordenamiento.
	 */
	public void setComboAlgoritmo(JComboBox<String> comboAlgoritmo) {
		this.comboAlgoritmo = comboAlgoritmo;
	}
	/**
	 * Modifique la caja de opciones que permite identificar de que forma se va a ordenar la respectiva matriz.
	 * @param comboOrdenamiento La caja de opciones que identifica el ordenamiento, ya sea por la edad o por dinero.
	 */
	public void setComboOrdenamiento(JComboBox<String> comboOrdenamiento) {
		this.comboOrdenamiento = comboOrdenamiento;
	}

	/**
	 * Modifique el conjunto de opciones con respecto a la matriz.
	 * @param matriz El conjunto de opciones que permite crear y generar datos con respecto a la matriz.
	 */
	public void setMatriz(JPanel matriz) {
		this.matriz = matriz;
	}
	/**
	 * Modifique el conjunto de opcioens con respecto al que tipo de ordenamiento vamos a utilizar.
	 * @param algoritmo
	 */
	public void setAlgoritmo(JPanel algoritmo) {
		this.algoritmo = algoritmo;
	}
	/**
	 * Modifique el panel general
	 * @param opciones El panel general en donde estara ubicadas todas las opciones e interacciones con respecto a la gestión de la respectiva matriz.
	 */
	public void setOpciones(JPanel opciones) {
		this.opciones = opciones;
	}
}
