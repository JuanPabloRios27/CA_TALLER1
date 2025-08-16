package co.edu.unbosque.util;

import co.edu.unbosque.model.Ladron;
import co.edu.unbosque.model.Politico;

/**
 * Genere la matriz de los respectivos ladrones.
 * 
 * @author Juan Pablo Ríos Rodríguez
 */
public class Matriz {
	
	
	
	
	
	public void ordenarMatrizEdad() {
		
	}
	
	public void ordenarMatrizDimero() {
		
	}
	/**
	 * Genere la matriz con respecto a los ladrones.
	 * @author Juan Pablo Ríos Rodríguez
	 * @param n la longitud de la matriz.
	 * @return ladronnuevo la matriz ya generada.
	 */
	public Ladron[][] genereMatriz(int n) {
		int i = n/2;
		int a = 1;
		while(a<n) {
			a++;
		}
		System.out.println(a);
		System.out.println(i);
		Ladron[][] ladronnuevo = new Ladron[i][a];
		System.out.print(ladronnuevo.length);
		for (int x = 0; x < i ; x ++) {
			for (int j = 0; j < a; j ++) {
				ladronnuevo[x][j] = new Ladron(n--, (int) (Math.random()*(100000-1000)+1)+1000,(int) (int)(Math.random()*99-5));
			}
		}
		return ladronnuevo;
	}

}
