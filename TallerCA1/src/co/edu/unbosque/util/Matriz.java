package co.edu.unbosque.util;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.Estadisticas;
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
		Estadisticas estadisticas = new Estadisticas();
		estadisticas.setAlgoritmo("Bubble Sort.");
		estadisticas.captureTiempo();
		// Ordene la plata que se llevo por columna.
		int columnas = ladron[0].length;
		int filas = ladron.length;
		Ladron temp;
		for (int a = 0; a < columnas; a++) {
			for (int i = 0; i < filas - 1; i++) {
				for (int j = 0; j < filas - i - 1; j++) {
					if (ladron[j][a].getEdad() > ladron[j + 1][a].getEdad()) {
						temp = ladron[j][a];
						ladron[j][a] = ladron[j + 1][a];
						ladron[j + 1][a] = temp;
						estadisticas.setComparaciones(estadisticas.getComparaciones()+1);
					}
					estadisticas.setInteraciones(estadisticas.getInteraciones()+1);
				}
			}
		}
		// Ordene la edad, ordenelo por fila.
		for (int a = 0; a < filas; a++) {
			for (int i = 0; i < columnas; i++) {
				for (int j = 0; j < columnas - i - 1; j++) {
					if (ladron[a][j].getDineroRobado() > ladron[a][j + 1].getDineroRobado()) {
						temp = ladron[a][j];
						ladron[a][j] = ladron[a][j + 1];
						ladron[a][j + 1] = temp;
						estadisticas.setComparaciones(estadisticas.getComparaciones()+1);
					}
					estadisticas.setInteraciones(estadisticas.getInteraciones()+1);
				}
			}
		}
		estadisticas.finalizeTiempo();
		Controller.imprimeEstadisticas(estadisticas);
		return ladron;
	}

	/**
	 * Ordene la matriz de parte del algoritmo de ordenamiento Selectionsort.
	 * 
	 * @author Juan Pablo Ríos Rodríguez
	 * @see <a href=
	 *      "https://www.geeksforgeeks.org/dsa/selection-sort-algorithm-2/">Selection Sort
	 *      Documentation</a>
	 */
	public Ladron[][] selectionSort(Ladron[][] ladron) {
		Estadisticas estadisticas = new Estadisticas();
		estadisticas.setAlgoritmo("Selection Sort.");
		estadisticas.captureTiempo();
		int columnas = ladron[0].length;
		int filas = ladron.length;
		Ladron temp;
		// Ordena el dinero robado en columna.
		for (int a = 0; a < columnas; a++) {
			for (int i = 0; i < filas - 1; i++) {
				int min_idx = i;
				for (int j = i + 1; j < filas; j++) {
					if (ladron[j][a].getDineroRobado() < ladron[min_idx][a].getDineroRobado()) {
						min_idx = j;
						estadisticas.setComparaciones(estadisticas.getComparaciones()+1);
					}
					estadisticas.setInteraciones(estadisticas.getInteraciones()+1);
				}
				temp = ladron[i][a];
				ladron[i][a] = ladron[min_idx][a];
				ladron[min_idx][a] = temp;
			}
		}
		// Ordena la edad en fila.
		for (int a = 0; a < filas; a++) {
			for (int i = 0; i < columnas - 1; i++) {
				int min_idx = i;
				for (int j = i + 1; j < columnas; j++) {
					if (ladron[a][j].getEdad() < ladron[a][min_idx].getEdad()) {
						min_idx = j;
						estadisticas.setComparaciones(estadisticas.getComparaciones()+1);
					}
					estadisticas.setInteraciones(estadisticas.getInteraciones()+1);
				}
				temp = ladron[a][i];
				ladron[a][i] = ladron[a][min_idx];
				ladron[a][min_idx] = temp;
			}
		}
		estadisticas.finalizeTiempo();
		Controller.imprimeEstadisticas(estadisticas);
		return ladron;
	}

	/**
	 * Ordene la matriz de parte del algoritmo de ordenamiento InsertionSort.
	 * @see <a href=
	 *      "https://www.geeksforgeeks.org/dsa/insertion-sort-algorithm/">Insertion Sort
	 *      Documentation</a>
	 * @author Juan Pablo Ríos Rodríguez
	 */
	public Ladron[][] insertionSort(Ladron[][] ladron) {
		Estadisticas estadisticas = new Estadisticas();
		estadisticas.setAlgoritmo("Insertion Sort.");
		estadisticas.captureTiempo();
		int columnas = ladron[0].length;
		int filas = ladron.length;
		// Ordena el dinero robado en columna.
		for (int a = 0; a < columnas; a++) {
			for (int i = 0; i < filas; i++) {
				Ladron temp = ladron[i][a];
				int j = i - 1;
				while (j >= 0 && ladron[j][a].getDineroRobado() > temp.getDineroRobado()) {
					ladron[j + 1][a] = ladron[j][a];
					j = j - 1;
					estadisticas.setComparaciones(estadisticas.getComparaciones()+1);
				}
				ladron[j + 1][a] = temp;
				estadisticas.setInteraciones(estadisticas.getInteraciones()+1);
			}
		}
		// Ordena la edad en fila.
		for (int a = 0; a < filas; a++) {
			for (int i = 0; i < columnas; i++) {
				Ladron temp = ladron[a][i];
				int j = i - 1;
				estadisticas.setInteraciones(estadisticas.getInteraciones()+1);
				while (j >= 0 && ladron[a][j].getEdad() > temp.getEdad()) {
					ladron[a][j + 1] = ladron[a][j];
					j = j - 1;
					estadisticas.setComparaciones(estadisticas.getComparaciones()+1);
				}
				ladron[a][j + 1] = temp;
			}
		}
		estadisticas.finalizeTiempo();
		Controller.imprimeEstadisticas(estadisticas);
		return ladron;
	}

	/**
	 * Ordene la matriz de parte del algoritmo de ordenamiento mergesort.
	 * 
	 * @author Antonio :(
	 */
	public Ladron[][] mergeSort() {
		return null;
	}

	/**
	 * Ordene la matriz de parte del algoritmo de ordenamiento quicksort.
	 * 
	 * @author Antonio :(
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
