package co.edu.unbosque.util;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Ladron;
import co.edu.unbosque.model.Politico;

/**
 * Genere la matriz de los respectivos ladrones.
 * 
 * @author Juan Pablo Ríos Rodríguez
 */
public class Matriz {
	/**
	 * Ordene la matriz de parte del algoritmo de ordenamiento bubblesort.
	 * @author Juan Pablo Ríos Rodríguez
	 * @see <a href="https://www.geeksforgeeks.org/dsa/bubble-sort-algorithm/">Bubble Sort Documentation</a>
	 */
	public Ladron[][] bubbleSort(Ladron[][] ladron) {
		//Ordene la edad.
		
		
		return null;
	}
	/**
	 * Ordene la matriz de parte del algoritmo de ordenamiento bubblesort.
	 * @author Juan Pablo Ríos Rodríguez
	 */
	public Ladron[][] selectionSort() {
		return null;
	}
	/**
	 * Ordene la matriz de parte del algoritmo de ordenamiento bubblesort.
	 * @author Juan Pablo Ríos Rodríguez
	 */
	public Ladron[][] insertionSort() {
		return null;
	}
	/**
	 * Ordene la matriz de parte del algoritmo de ordenamiento bubblesort.
	 * @author Juan Pablo Ríos Rodríguez
	 */
	public Ladron[][] mergeSort() {
		return null;
	}
	/**
	 * Ordene la matriz de parte del algoritmo de ordenamiento bubblesort.
	 * @author Juan Pablo Ríos Rodríguez
	 */
	public Ladron[][] quickSort() {
		return null;
	}
	/**
	 * Genere la matriz con respecto a los ladrones.
	 * @author Juan Pablo Ríos Rodríguez
	 * @param n la longitud de la matriz.
	 * @return ladronnuevo la matriz ya generada.
	 */
	public Ladron[][] genereMatriz(int n) {
		int i = n, d=2;
		List<Integer> mcm =  new ArrayList<>();
		while(i!=1) {
			if(i % d == 0) {
				i = i / d;
				mcm.add(d);
			}else {
				d++;
			}
		}
		int a=1, b=1;
		Ladron[][] ladronnuevo;
		if(mcm.size() >= 1) {
			for(int l1 = 0; l1 < mcm.size() / 2; l1++) {
				a = a* mcm.get(l1);
			}
			for(int l1 = mcm.size() / 2; l1 < mcm.size(); l1++) {
				b = b* mcm.get(l1);
			}
			ladronnuevo = new Ladron[a][b];
		}else {
			ladronnuevo = new Ladron[0][n];
		}
		int id = 0;
		for (int x = 0; x < a ; x ++) {
			for (int j = 0; j < b; j ++) {
				ladronnuevo[x][j] = new Ladron(id, (int) (Math.random()*(100000-1000)+1)+1000,(int)(Math.random()*(99-12)+1)+12);
				id++;
			}
		}
		return ladronnuevo;
	}
	

}
