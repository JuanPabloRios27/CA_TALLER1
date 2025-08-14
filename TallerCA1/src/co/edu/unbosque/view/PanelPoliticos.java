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
    private JPanel lista1;
    /**
     * Listado de opciones que tendran la función de ordenar el respectivo arreglo.
     */
    private JPanel lista2;
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
		lista1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		lista2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		agregarElementos();
		opciones.add(lista1);
		opciones.add(lista2);
		add(opciones);
    }
    /**
     * Agrege y posicione los respectivos componentes.
     */
	private void agregarElementos() {
		lista1.add(new JLabel("Cantidad: "));
		lista1.add(txtCantidad);
        lista1.add(btnGenerar);
        lista1.add(btnVerLista);
        lista2.add(comboAlgoritmo);
        lista2.add(btnOrdenar);
	}
	public JButton getBtnGenerar() {
		return btnGenerar;
	}
	public JButton getBtnOrdenar() {
		return btnOrdenar;
	}
	public JComboBox<String> getComboAlgoritmo() {
		return comboAlgoritmo;
	}
	public JTextField getTxtCantidad() {
		return txtCantidad;
	}
	public JButton getBtnVerLista() {
		return btnVerLista;
	}
	public JPanel getOpciones() {
		return opciones;
	}
	public JPanel getLista1() {
		return lista1;
	}
	public JPanel getLista2() {
		return lista2;
	}
	public void setBtnGenerar(JButton btnGenerar) {
		this.btnGenerar = btnGenerar;
	}
	public void setBtnOrdenar(JButton btnOrdenar) {
		this.btnOrdenar = btnOrdenar;
	}
	public void setComboAlgoritmo(JComboBox<String> comboAlgoritmo) {
		this.comboAlgoritmo = comboAlgoritmo;
	}
	public void setTxtCantidad(JTextField txtCantidad) {
		this.txtCantidad = txtCantidad;
	}
	public void setBtnVerLista(JButton btnVerLista) {
		this.btnVerLista = btnVerLista;
	}
	public void setOpciones(JPanel opciones) {
		this.opciones = opciones;
	}
	public void setLista1(JPanel lista1) {
		this.lista1 = lista1;
	}
	public void setLista2(JPanel lista2) {
		this.lista2 = lista2;
	}
}
