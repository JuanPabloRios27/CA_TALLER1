package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 * Este es el panel de los politicos.
 * @author Juan Pablo Ríos Rodríguez
 */
public class PanelPoliticos extends JPanel {
	/**
	 * Este botón permite generar una arreglo de longitud variable con respecto a los politicos.
	 */
	private JButton btnGenerar;
	/**
	 * Este botón ordena al conjunto de politicos corruptos.
	 */
    private JButton btnOrdenar;
    /**
     * Especifique que algoritmo de ordenamiento quiere utilizar.
     */
    private JComboBox<String> comboAlgoritmo;
    /**
     * Ayuda al usuario a definir el tamaño del respectivo tamaño de parte de los politicos
     */
    private JTextField txtCantidad;
    /**
     * Visualize el conjunto de corruptos que genero e ordeno.
     */
    private JButton btnVerLista;
    /**
     * Un panel orientado a ordenar las configuraciones con respecto al manejo del respectivo arreglo de parte de los corruptos.
     */
    private JPanel opciones;
    /**
     * Listado de opciones que tendran la función de crear y generar información con respecto al arreglo de los políticos.
     */
    private JPanel conjuntoOpciones1;
    /**
     * Listado de opciones que tendran la función de ordenar el respectivo arreglo.
     */
    private JPanel conjuntoOpciones2;
    /**
     * Ajuste el panel de los políticos corruptos.
     * @author Alejandro
     */
    public PanelPoliticos() {
    	setLayout(new BorderLayout(10, 10));
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		comboAlgoritmo= new JComboBox<>(new String[]{"Bubble Sort", "Selection Sort", "Insertion Sort", "Merge Sort", "Quick Sort"});
		btnGenerar = new JButton("Generar lista.");
		btnOrdenar = new JButton("Ordenar lista.");
		txtCantidad = new JTextField(5);
		btnVerLista = new JButton("Ver Lista");
		opciones = new JPanel(new GridLayout(2, 1, 5, 5));
		conjuntoOpciones1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		conjuntoOpciones2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		agregarElementos();
		opciones.add(conjuntoOpciones1);
		opciones.add(conjuntoOpciones2);
		add(opciones);
    }
    /**
     * Agrege y posicione los respectivos componentes.
     */
	private void agregarElementos() {
		conjuntoOpciones1.add(new JLabel("Cantidad: "));
		conjuntoOpciones1.add(txtCantidad);
        conjuntoOpciones1.add(btnGenerar);
        conjuntoOpciones1.add(btnVerLista);
        conjuntoOpciones2.add(comboAlgoritmo);
        conjuntoOpciones2.add(btnOrdenar);
	}
	/**
	 * Obtenga el botón que genera el arreglo de los respectivos politicos.
	 * @return btnGenerar El botón que me permite generar la información con respecto a los respectivos políticos.
	 */
	public JButton getBtnGenerar() {
		return btnGenerar;
	}
	/**
	 * Obtenga el botón que ordena el arreglo de los respectivos politicos.
	 * @return btnGenerar El botón que me permite ordenar la información con respecto a los respectivos políticos.
	 */
	public JButton getBtnOrdenar() {
		return btnOrdenar;
	}
	/**
	 * Obtenga las diferentes opciones para ordenar el respectivo algoritmo
	 * @return comboAlgoritmo El comboBox que prove al programa información con respecto a cual es el algoritmo de ordenamiento que el respectivo usuario selecciono.
	 */
	public JComboBox<String> getComboAlgoritmo() {
		return comboAlgoritmo;
	}
	/**
	 * Obtenga el tamaño que el respectivo arreglo de los políticos se va a generar.
	 * @return txtCantidad Identifique el tamaño del arreglo con respecto a los políticos corruptos.
	 */
	public JTextField getTxtCantidad() {
		return txtCantidad;
	}
	/**
	 * Obtenga el botón que permita mostrar el arreglo con respecto a los políticos.
	 * @return btnVerLista Permite visualizar el arreglo de los políticos corruptos.
	 */
	public JButton getBtnVerArreglo() {
		return btnVerLista;
	}
	/**
	 * Obtenga el tamaño que el respectivo arreglo de los políticos se va a generar.
	 * @return txtCantidad Identifique el tamaño del arreglo con respecto a los políticos corruptos.
	 */
	public JPanel getOpciones() {
		return opciones;
	}
	/**
	 * Obtenga un conjunto de opciones que permiten ajustar el arreglo.
	 * @return lista1 Un conjunto de opciones que permiten ajustar el respectivo arreglo.
	 */
	public JPanel getLista1() {
		return conjuntoOpciones1;
	}
	/**
	 * Obtenga un conjunto de opciones que permiten ordenar el arreglo.
	 * @return lista1 Un conjunto de opciones que permiten ordenar el respectivo arreglo.
	 */
	public JPanel getLista2() {
		return conjuntoOpciones2;
	}
	/**
	 * Ajuste un botón que permita generar el arreglo.
	 * @param btnGenerar Un conjunto de opciones que permiten generar el respectivo arreglo.
	 */
	public void setBtnGenerar(JButton btnGenerar) {
		this.btnGenerar = btnGenerar;
	}
	/**
	 * Ajsute un botón que permita ordenar el arreglo.
	 * @param btnOrdenar El botón que permiten generar el respectivo arreglo.
	 */
	public void setBtnOrdenar(JButton btnOrdenar) {
		this.btnOrdenar = btnOrdenar;
	}
	/**
	 * Ajuste la caja de opciones que permite seleccionar el respectivo algoritmo de ordenamiento.
	 * @param comboAlgoritmor la caja de opciones que permite seleccionar el respectivo algoritmo de ordenamiento.
	 */
	public void setComboAlgoritmo(JComboBox<String> comboAlgoritmo) {
		this.comboAlgoritmo = comboAlgoritmo;
	}
	/**
	 * Ajuste en texto de entrada que permite identificar el tamaño fijo del respectivo arreglo.
	 * @param txtCantidad El texto de entrada.
	 */
	public void setTxtCantidad(JTextField txtCantidad) {
		this.txtCantidad = txtCantidad;
	}
	/**
	 * Ajuste el botón que permita listar el arreglo.
	 * @param btnVerLista El boton de listar.
	 */
	public void setBtnVerLista(JButton btnVerLista) {
		this.btnVerLista = btnVerLista;
	}
	/**
	 * Ajuste el conjunto de todas las configuraciones generales
	 * @param opciones Conjunto de opciones generales.
	 */
	public void setOpciones(JPanel opciones) {
		this.opciones = opciones;
	}
	/**
	 * Ajuste el conjunto de opciones que permiten generar el arreglo
	 * @param conjuntoOpciones1 conjunto de opciones que permiten generar el respectivo arreglo
	 */
	public void setConjuntoOpciones1(JPanel conjuntoOpciones1) {
		this.conjuntoOpciones1 = conjuntoOpciones1;
	}
	/**
	 * Ajuste el conjunto de opciones que permiten ordenar el arreglo
	 * @param conjuntoOpciones2 conjunto de opciones que permiten ordenar el respectivo arreglo
	 */
	public void setLista2(JPanel conjuntoOpciones2) {
		this.conjuntoOpciones2 = conjuntoOpciones2;
	}
}
