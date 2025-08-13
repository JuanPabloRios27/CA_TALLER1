package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Window extends JFrame {
	public Window() {
		setTitle("Apoco");
		setSize(600,340);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		paneles();
		setVisible(true);
	}

	private void paneles() {
		JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Arreglo", new PanelPoliticos());
        tabs.addTab("Matriz", new PanelMatriz());
        add(tabs);
		
	}

}
