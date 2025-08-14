package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
/**
 * Esta clase permite inicializar la respectiva interfaz de usuario.
 */
public class Gui extends JFrame {
	/**
	 * Es el panel donde vamos a ajustar el arreglo de tipo variable con respecto a los politicos señalados de corrupción.
	 */
	private PanelPoliticos panelPoliticos;
	/**
	 * Es el panel donde vamos a ajustar la matriz  con respecto a todas las personas que cometieron crimenes.
	 */
	private PanelMatriz panelMatriz;
	/**
	 * Es el panel en donde vamos a visualizar los resultados.
	 */
	private PanelConsole panelConsole;
	/**
	 * Es el panel en donde se va a reubicar la interfaz gráfica del usuario.
	 */
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
	/**
	 * Ajusta los respectivos paneles.
	 */
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
	/**
	 * Esta función recupera el panel en donde se va a gestionar la información de todos los politicos corruptos, incluyendo sus componentes.
	 * @return panelPoliticos Retorna el panel con respecto a la gestión al ejercicio de los politicos.
	 */
	public PanelPoliticos getPanelPoliticos() {
		return panelPoliticos;
	}
	/**
	 * Esta función recupera el panel en donde se va a gestionar la información de todos los politicos corruptos, incluyendo sus componentes.
	 * @return panelPoliticos Retorna la información con respecto al panel, por lo cual permite la posterior gestión entorno al ejercicio de los politicos corruptos.
	 */
	public PanelMatriz getPanelMatriz() {
		return panelMatriz;
	}
	/**
	 * Ajusta el panel de los políticos, incluyendo sus respectivos componentes.
	 * @param panelPoliticos Ajuste el panel de los politicos corruptos.
	 */
	public void setPanelPoliticos(PanelPoliticos panelPoliticos) {
		this.panelPoliticos = panelPoliticos;
	}
	/**
	 * Ajusta el panel de los delicuentes, incluyendo sus respectivos componentes.
	 * @param panelMatriz Ajuste el panel de los delicuentes.
	 */
	public void setPanelMatriz(PanelMatriz panelMatriz) {
		this.panelMatriz = panelMatriz;
	}
	
	

}
