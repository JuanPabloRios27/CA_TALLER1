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
    private JTextArea areaResultados;
    private JComboBox<String> comboAlgoritmo = new JComboBox<>(new String[]{
            "Bubble Sort", "Selection Sort", "Insertion Sort", "Merge Sort", "Quick Sort"
        });;
    private JTextField txtCantidad = new JTextField(5);
    private JButton btnVerLista = new JButton("Ver Lista");
    private JPanel opciones = new JPanel(new GridLayout(2, 1, 5, 5));;
    private JPanel lista1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
    private JPanel lista2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
    private JTextArea areaSalida = new JTextArea(20,70);
    private JScrollPane scroll = new JScrollPane(areaSalida);
    
    public PanelPoliticos() {
		ajustarPaneles();
		// Asigna los botones.
		agregarElementos();
		opciones.add(lista1);
		opciones.add(lista2);
		add(opciones, BorderLayout.NORTH);
		add(scroll, BorderLayout.CENTER);
    }
	private void agregarElementos() {
		lista1.add(new JLabel("Cantidad: "));
		lista1.add(txtCantidad);
        lista1.add(btnGenerar);
        lista1.add(btnVerLista);
        lista2.add(comboAlgoritmo);
        lista2.add(btnOrdenar);
	}
	private void ajustarPaneles() {
		setLayout(new BorderLayout(10, 10));
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		areaSalida.setEnabled(false);
		scroll.setBorder(BorderFactory.createTitledBorder("Salida"));
	}
}
