package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Gui extends JFrame {
	
	private PanelPoliticos panelPoliticos;
	private PanelMatriz panelMatriz;
	private PanelConsole panelConsole;
	private JPanel panelPrincipal;
	public Gui() {
		setResizable(true);
		setTitle("Apoco");
		setSize(600,340);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		paneles();
		setVisible(true);
	}

	private void paneles() {
		JTabbedPane tabs = new JTabbedPane();
		panelPoliticos = new PanelPoliticos();
		panelMatriz = new PanelMatriz();
		panelConsole = new PanelConsole();
		panelPrincipal = new JPanel();
        tabs.addTab("Arreglo", panelPoliticos);
        tabs.addTab("Matriz", panelMatriz);
        panelPrincipal.setLayout(new BorderLayout(10, 10));
		panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelPrincipal.add(tabs,BorderLayout.NORTH);
        panelPrincipal.add(panelConsole,BorderLayout.CENTER);
        add(panelPrincipal);
		
	}

	public PanelPoliticos getPanelPoliticos() {
		return panelPoliticos;
	}

	public PanelMatriz getPanelMatriz() {
		return panelMatriz;
	}

	public void setPanelPoliticos(PanelPoliticos panelPoliticos) {
		this.panelPoliticos = panelPoliticos;
	}

	public void setPanelMatriz(PanelMatriz panelMatriz) {
		this.panelMatriz = panelMatriz;
	}
	
	

}
