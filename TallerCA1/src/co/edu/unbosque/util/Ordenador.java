package co.edu.unbosque.util;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.Estadisticas;
import co.edu.unbosque.model.Ladron;
import co.edu.unbosque.model.Politico;
import co.edu.unbosque.view.Gui;

public class Ordenador {
	private Estadisticas estadisticas = new Estadisticas();
	/**
	 * Permite generar datos con respecto a la matriz.
	 * @author Juan Pablo Ríos Rodríguez.
	 */
	public Politico[] genereDatos(int n) {
		Politico [] politicosSospechosos = new Politico[n];
		for(int i = 0; i < n; i++) {
			politicosSospechosos[i] = new Politico(i,(int)(Math.random()*(10000000-1000)+1)+1000,(int)(Math.random()*(99-27)+1)+27);
		}
		return politicosSospechosos;
	}
	
	public Politico[] bubbleSort(Politico[] politicos) {
		Politico temp;
		for(int i = 0; i < politicos.length - 1; i++) {
			for(int j = 0; j < politicos.length - i -1 ; j++) {
				estadisticas.setComparaciones(estadisticas.getComparaciones()+1);
				if(politicos[j].getDineroRobado() > politicos[j+1].getDineroRobado()) {
					temp = politicos[j];
					politicos[j] = politicos[j +1];
					politicos[j+1] = temp;
					estadisticas.setInteraciones(estadisticas.getInteraciones()+1);
				}
			}
		}
		estadisticas.finalizeTiempo();
		estadisticas.finaliceMemoria();
		return politicos;
	}
	
	public Politico[] selectionSort(Politico[] politico) {
		int n = politico.length;
		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for(int j = i + 1; j < n; j++) {
				estadisticas.setComparaciones(estadisticas.getComparaciones()+1);
				if(politico[j].getDineroRobado() < politico[min_idx].getDineroRobado()) {
					min_idx = j;
				}
			}
			if(min_idx != i) {
				Politico temp = politico[i];
				politico[i] = politico[min_idx];
				politico[min_idx] = temp;
				estadisticas.setInteraciones(estadisticas.getInteraciones()+1);
			}
		}
		estadisticas.finalizeTiempo();
		estadisticas.finaliceMemoria();
		return politico;
	}
	public void merge(Politico[] politico, int left, int mid, int right) {
		int n1 = mid - left + 1;
	    int n2 = right - mid;
	    //Crea dos arreglos temporales.
	    Politico L[] = new Politico[n1];
	    Politico R[] = new Politico[n2];
	    for (int i = 0; i <n1; i++) {
	    	L[i] = politico[left + i];
	    }
	    for(int j = 0; j < n2; j++) {
	    	R[j] = politico[mid +1 + j];
	    }
	    int i = 0, j = 0;
	    int k = left;
	    while(i < n1 && j < n2) {
	    	estadisticas.setComparaciones(estadisticas.getComparaciones()+1);
	    	if(L[i].getDineroRobado() <= R[j].getDineroRobado()) {
	    		politico[k] = L[i];
	    		i++;
	    	}else {
	    		politico[k] = R[j];
	    		j++;
	    	}
	    	estadisticas.setInteraciones(estadisticas.getInteraciones()+1);
	    	k++;
	    }
	    while(i < n1) {
	    	politico[k] = L[i];
	    	i++;
	    	k++;
	    	estadisticas.setInteraciones(estadisticas.getInteraciones()+1);
	    }
	    while(j < n2) {
	    	politico[k] = R[j];
	    	j++;
	    	k++;
	    	estadisticas.setInteraciones(estadisticas.getInteraciones()+1);
	    }
	}
	public Politico[] insertionSort(Politico[] politico) {
		int n = politico.length;
		for (int i = 1; i < n; i++) {
			Politico key = politico[i];
			int j = i - 1;
			while(j>=0) {
				estadisticas.setComparaciones(estadisticas.getComparaciones()+1);
				if(politico[j].getDineroRobado() > key.getDineroRobado()) {
					estadisticas.setComparaciones(estadisticas.getComparaciones()+1);
					politico[j + 1] = politico[j];
					estadisticas.setInteraciones(estadisticas.getInteraciones()+1);
					j--;
				}else {
					break;
				}
			}
			politico[j + 1] = key;
		}
		estadisticas.finalizeTiempo();
		estadisticas.captureMemoria();
		return politico;
	}
	
	public Politico[] mergeSort(Politico[] politico, int left, int right) {
		if(left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(politico, left, mid);
			mergeSort(politico, mid + 1, right);
			merge(politico, left, mid, right);
		}
		estadisticas.finalizeTiempo();
		estadisticas.finaliceMemoria();
		return politico;
	}
	/**
	 * Implementación del respectivo QuickSort.
	 * Se implemento usando la partición de Lomuto.
	 * @param politico
	 * @param left la posición inicial del arreglo
	 * @param right la posición final del arreglo
	 * @return politico El arreglo ya ordenado
	 */
	public Politico[] quickSort(Politico[] politico, int left, int right) {
		if(left < right) {
			int pi = partition(politico, left, right);
			quickSort(politico, left, pi -1);
			quickSort(politico, pi+1, right);
		}
		estadisticas.finalizeTiempo();
		estadisticas.finaliceMemoria();
		return politico;
	}
	/**
	 * Elija el pivote y haga particiones.
	 * @param politico
	 * @param left el elemento que se va a comparar con el siguiente.
	 * @param right el elemento que esta delante del anterior.
	 * @return La partición del arreglo.
	 */
	private int partition(Politico[] politico, int left, int right) {
		Politico pivot = politico[right];
		int i = left -1;
		for(int j = left; j <= right -1; j++) {
			estadisticas.setComparaciones(estadisticas.getComparaciones()+1);
			if(politico[j].getDineroRobado() < pivot.getDineroRobado()) {
				i++;
				swap(politico, i, j);
				estadisticas.setInteraciones(estadisticas.getInteraciones()+1);
			}
		}
		swap(politico, i+1, right);
		estadisticas.setInteraciones(estadisticas.getInteraciones()+1);
		return i + 1;
	}
	/**
	 * Cambie los valores de acuerdo con QuickSort.
	 * @param politico
	 * @param i Intercambia el elemento que es mayor con el que esta adelante.
	 * @param j El elemento a intercambiar.
	 */
	private void swap(Politico[] politico, int i, int j) {
		Politico temp = politico[i];
		politico[i] = politico[j];
		politico[j] = temp;
	}

	public Estadisticas getEstadisticas() {
		return estadisticas;
	}

	public void setEstadisticas(Estadisticas estadisticas) {
		this.estadisticas = estadisticas;
	}

	public void inicieStats(String string) {
		estadisticas = new Estadisticas();
		estadisticas.setAlgoritmo(string);
		estadisticas.captureTiempo();
		estadisticas.captureMemoria();
	}
	
}
