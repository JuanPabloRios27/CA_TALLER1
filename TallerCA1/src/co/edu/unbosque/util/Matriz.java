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
	 * 
	 * @author Juan Pablo Ríos Rodríguez
	 * @see <a href=
	 *      "https://www.geeksforgeeks.org/dsa/bubble-sort-algorithm/">Bubble Sort
	 *      Documentation</a>
	 */
	public Ladron[][] bubbleSort(Ladron[][] ladron) {
		//Ordene la plata que se llevo por columna.
		int columnas = ladron[0].length;
		int filas = ladron.length;
		Ladron temp;
		for (int a = 0; a < columnas; a++) {
			for (int i = 0; i < filas - 1; i++) {
				for (int j = 0; j < filas - i - 1; j++) {
					if (ladron[j][a].getDineroRobado() > ladron[j + 1][a].getDineroRobado()) {
						temp = ladron[j][a];
						ladron[j][a] = ladron[j + 1][a];
						ladron[j + 1][a] = temp;
					}
				}
			}
		}
		// Ordene la edad, ordenelo por fila.
		for (int a = 0; a < filas; a++) {
			for (int i = 0; i < columnas; i++) {
				for (int j = 0; j < columnas - i - 1; j++) {
					if (ladron[a][j].getEdad() > ladron[a][j + 1].getEdad()) {
						temp = ladron[a][j];
						ladron[a][j] = ladron[a][j + 1];
						ladron[a][j + 1] = temp;
					}
				}
			}
		}
		return ladron;
	}

	/**
	 * Ordene la matriz de parte del algoritmo de ordenamiento Selectionsort.
	 * 
	 * @author Juan Pablo Ríos Rodríguez
	 */
	public Ladron[][] selectionSort(Ladron[][] ladron) {
		int columnas = ladron[0].length;
		int filas = ladron.length;
		Ladron temp;
		//Ordena el dinero robado en columna.
		for (int a = 0; a < columnas; a++) {
			for (int i = 0; i < filas - 1; i++) {
				int min_idx = i;
				for(int j = i + 1; j < filas;j ++) {
					if(ladron[j][a].getEdad() < ladron[min_idx][a].getEdad()) {
						min_idx = j;
					}
				}
				temp = ladron[i][a];
				ladron[i][a] = ladron[min_idx][a];
				ladron[min_idx][a] = temp;
			}
		}
		//Ordena la edad en fila.
		for (int a = 0; a < filas; a++) {
			for (int i = 0; i < columnas - 1; i++) {
				int min_idx = i;
				for(int j = i + 1; j < columnas;j ++) {
					if(ladron[a][j].getDineroRobado() < ladron[a][min_idx].getDineroRobado()) {
						min_idx = j;
					}
				}
				temp = ladron[a][i];
				ladron[a][i] = ladron[a][min_idx];
				ladron[a][min_idx] = temp;
			}
		}
		return ladron;
	}

	/**
	 * Ordene la matriz de parte del algoritmo de ordenamiento bubblesort.
	 * 
	 * @author Juan Pablo Ríos Rodríguez
	 */
	public Ladron[][] insertionSort() {
		
		return null;
	}

	/**
	 * Ordene la matriz de parte del algoritmo de ordenamiento bubblesort.
	 * 
	 * @author Juan Pablo Ríos Rodríguez
	 */
	public Ladron[][] mergeSort() {
		return null;
	}

	/**
	 * Ordene la matriz de parte del algoritmo de ordenamiento bubblesort.
	 * 
	 * @author Juan Pablo Ríos Rodríguez
	 */
	public Ladron[][] quickSort() {
		return null;
	}

	/**
	 * Genere la matriz con respecto a los ladrones.
	 * 
	 * @author Juan Pablo Ríos Rodríguez
	 * @param n la longitud de la matriz.
	 * @return ladronnuevo la matriz ya generada.
	 */
	public Ladron[][] genereMatriz(int n) {
		int i = n, d = 2;
		List<Integer> mcm = new ArrayList<>();
		while (i != 1) {
			if (i % d == 0) {
				i = i / d;
				mcm.add(d);
			} else {
				d++;
			}
		}
		int a = 1, b = 1;
		Ladron[][] ladronnuevo;
		if (mcm.size() >= 1) {
			for (int l1 = 0; l1 < mcm.size() / 2; l1++) {
				a = a * mcm.get(l1);
			}
			for (int l1 = mcm.size() / 2; l1 < mcm.size(); l1++) {
				b = b * mcm.get(l1);
			}
			ladronnuevo = new Ladron[a][b];
		} else {
			ladronnuevo = new Ladron[0][n];
		}
		int id = 0;
		for (int x = 0; x < a; x++) {
			for (int j = 0; j < b; j++) {
				ladronnuevo[x][j] = new Ladron(id, (int) (Math.random() * (100000 - 1000) + 1) + 1000,
						(int) (Math.random() * (99 - 12) + 1) + 12);
				id++;
			}
		}
		return ladronnuevo;
	}

}
