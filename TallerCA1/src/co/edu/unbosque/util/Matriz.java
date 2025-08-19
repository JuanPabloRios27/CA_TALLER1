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
	
	private Estadisticas estadisticas;
	/**
	 * Ordene la matriz de parte del algoritmo de ordenamiento bubblesort.
	 * 
	 * @author Juan Pablo Ríos Rodríguez
	 * @see <a href=
	 *      "https://www.geeksforgeeks.org/dsa/bubble-sort-algorithm/">Bubble Sort
	 *      Documentation</a>
	 */
	public Ladron[][] bubbleSort(Ladron[][] ladron) {
		estadisticas = new Estadisticas();
		estadisticas.setAlgoritmo("Bubble Sort.");
		estadisticas.captureTiempo();
		estadisticas.captureMemoria();
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
		estadisticas.finaliceMemoria();
		estadisticas.finalizeTiempo();
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
		estadisticas.finaliceMemoria();
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
		estadisticas.finaliceMemoria();
		return ladron;
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
	/**
	 * Ordene la matriz de parte del algoritmo de ordenamiento mergesort.
	 *  @see <a href=
	 *  https://www.geeksforgeeks.org/dsa/merge-sort/</a>
	 *  @see <a href=
	 *   https://www.geeksforgeeks.org/dsa/quick-sort-vs-merge-sort/</a>
	 */
	public Ladron[][] mergeSort(Ladron[][] ladron) {
	    int filas = ladron.length;
	    int columnas = ladron[0].length;
	    
	    // Primero ordenamos por edad en columnas (vertical)
	    for (int col = 0; col < columnas; col++) {
	        Ladron[] columna = new Ladron[filas];
	        for (int fila = 0; fila < filas; fila++) {
	            columna[fila] = ladron[fila][col];
	        }
	        mergeSortArray(columna, 0, filas-1, true);
	        for (int fila = 0; fila < filas; fila++) {
	            ladron[fila][col] = columna[fila];
	        }
	    }
	    
	    // Luego ordenamos por dinero robado en filas (horizontal)
	    for (int fila = 0; fila < filas; fila++) {
	        mergeSortArray(ladron[fila], 0, columnas-1, false);
	    }
	    estadisticas.finaliceMemoria();
	    estadisticas.finalizeTiempo();
	    return ladron;
	}

	private void mergeSortArray(Ladron[] arr, int l, int r, boolean porEdad) {
	    if (l < r) {
	        int m = l + (r - l) / 2;
	        
	        mergeSortArray(arr, l, m, porEdad);
	        mergeSortArray(arr, m + 1, r, porEdad);
	        
	        merge(arr, l, m, r, porEdad);
	    }
	}
	/**
	 * 
	 * @param arr
	 * @param l el elemento que se encuentra en el lado izquierdo
	 * @param m el elemento que se encuentra en el lado derecho.
	 * @param r la mitad de esos dos arreglos.
	 * @param porEdad el elemento boolean que identifica si se debe ordenar. 
	 */
	private void merge(Ladron[] arr, int l, int m, int r, boolean porEdad) {
	    int n1 = m - l + 1;
	    int n2 = r - m;

	    Ladron[] L = new Ladron[n1];
	    Ladron[] R = new Ladron[n2];

	    for (int i = 0; i < n1; ++i) {
	        L[i] = arr[l + i];
	    }
	    for (int j = 0; j < n2; ++j) {
	        R[j] = arr[m + 1 + j];
	    }

	    int i = 0, j = 0;
	    int k = l;
	    
	    while (i < n1 && j < n2) {
	        estadisticas.setComparaciones(estadisticas.getComparaciones() + 1);
	        if ((porEdad && L[i].getEdad() <= R[j].getEdad()) || 
	            (!porEdad && L[i].getDineroRobado() <= R[j].getDineroRobado())) {
	            arr[k] = L[i];
	            i++;
	        } else {
	            arr[k] = R[j];
	            j++;
	        }
	        estadisticas.setInteraciones(estadisticas.getInteraciones() + 1);
	        k++;
	    }

	    while (i < n1) {
	        arr[k] = L[i];
	        i++;
	        k++;
	        estadisticas.setInteraciones(estadisticas.getInteraciones() + 1);
	    }

	    while (j < n2) {
	        arr[k] = R[j];
	        j++;
	        k++;
	        estadisticas.setInteraciones(estadisticas.getInteraciones() + 1);
	    }
	}

	/**
	 * Ordene la matriz usando el algoritmo QuickSort.
	 * 	@see <a href=
	 *   https://www.geeksforgeeks.org/dsa/quick-sort-algorithm/</a>
	 *  @see <a href=
	 *   https://www.geeksforgeeks.org/dsa/quick-sort-vs-merge-sort/</a>
	 */
	public Ladron[][] quickSort(Ladron[][] ladron) {
	    int filas = ladron.length;
	    int columnas = ladron[0].length;
	    
	    // Primero ordenamos por edad en columnas (vertical)
	    for (int col = 0; col < columnas; col++) {
	        Ladron[] columna = new Ladron[filas];
	        for (int fila = 0; fila < filas; fila++) {
	            columna[fila] = ladron[fila][col];
	        }
	        quickSortArray(columna, 0, filas-1, true, estadisticas);
	        for (int fila = 0; fila < filas; fila++) {
	            ladron[fila][col] = columna[fila];
	        }
	    }
	    // Luego ordenamos por dinero robado en filas (horizontal)
	    for (int fila = 0; fila < filas; fila++) {
	        quickSortArray(ladron[fila], 0, columnas-1, false, estadisticas);
	    }
	    estadisticas.finaliceMemoria();
	    estadisticas.finalizeTiempo();
	    return ladron;
	}

	private void quickSortArray(Ladron[] arr, int low, int high, boolean porEdad, Estadisticas estadisticas) {
	    if (low < high) {
	        int pi = partition(arr, low, high, porEdad, estadisticas);
	        
	        quickSortArray(arr, low, pi - 1, porEdad, estadisticas);
	        quickSortArray(arr, pi + 1, high, porEdad, estadisticas);
	    }
	}

	private int partition(Ladron[] arr, int low, int high, boolean porEdad, Estadisticas estadisticas) {
	    Ladron pivot = arr[high];
	    int i = low - 1;
	    
	    for (int j = low; j < high; j++) {
	        estadisticas.setComparaciones(estadisticas.getComparaciones() + 1);
	        if ((porEdad && arr[j].getEdad() < pivot.getEdad()) || 
	            (!porEdad && arr[j].getDineroRobado() < pivot.getDineroRobado())) {
	            i++;
	            
	            // Swap arr[i] and arr[j]
	            Ladron temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	        estadisticas.setInteraciones(estadisticas.getInteraciones() + 1);
	    }
	    
	    // Swap arr[i+1] and arr[high] (pivot)
	    Ladron temp = arr[i + 1];
	    arr[i + 1] = arr[high];
	    arr[high] = temp;
	    estadisticas.setInteraciones(estadisticas.getInteraciones() + 1);
	    return i + 1;
	}
	/**
	 * Consulte los resultados con respecto al algoritmo
	 * @return estadisticas las estadisticas a modificar.
	 */
	public Estadisticas getEstadisticas() {
		return estadisticas;
	}
	/**
	 * 
	 * Ajusta las propiedades del objeto estadisticas
	 * @param estadisticas el objeto a modificar.
	 */
	public void setEstadisticas(Estadisticas estadisticas) {
		this.estadisticas = estadisticas;
	}
	/**
	 * Comience a capturar información con respecto al algoritmo, siendo asi el tipo de ordenamiento, 
	 * las comparaciones, las interacciones, el tiempo, etc.
	 * @param string
	 */
	public void inicieStats(String string) {
		estadisticas = new Estadisticas();
	    estadisticas.setAlgoritmo(string);
	    estadisticas.captureTiempo();
	}
	
	
}
