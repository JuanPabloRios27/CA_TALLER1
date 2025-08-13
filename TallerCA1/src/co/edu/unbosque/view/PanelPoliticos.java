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
	private JButton btnGenerar = new JButton("Generar lista.");
    private JButton btnOrdenar = new JButton("Ordenar lista.");
    private JComboBox<String> comboAlgoritmo = new JComboBox<>(new String[]{
            "Bubble Sort", "Selection Sort", "Insertion Sort", "Merge Sort", "Quick Sort"
        });;
    private JTextField txtCantidad = new JTextField(5);
    private JButton btnVerLista = new JButton("Ver Lista");
    private JPanel opciones = new JPanel(new GridLayout(2, 1, 5, 5));;
    private JPanel lista1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
    private JPanel lista2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
    
    public PanelPoliticos() {
    	setLayout(new BorderLayout(10, 10));
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		agregarElementos();
		opciones.add(lista1);
		opciones.add(lista2);
		add(opciones);
    }
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
