package co.edu.unbosque.view;

import java.util.Scanner;



/**
 * Esta es la interfaz general del usuario.
 */
public class Gui {
	
	private Window window;
	private Scanner sc;
	
	public Gui() {
		window = new Window();
		sc = new Scanner(System.in);
	}

	public Window getWindow() {
		return window;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setWindow(Window window) {
		this.window = window;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
}

