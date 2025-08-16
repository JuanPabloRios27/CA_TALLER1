package co.edu.unbosque.util;

import co.edu.unbosque.model.Ladron;
import co.edu.unbosque.model.Politico;

public class Ordenador {
	
	/**
	 * Permite generar datos con respecto a la matriz.
	 * @author Juan Pablo Ríos Rodríguez.
	 */
	public Politico[] genereDatos(int n) {
		Politico [] politicosSospechosos = new Politico[n];
		for(int i = 0; i < n; i++) {
			politicosSospechosos[i] = new Politico(i,(int)(Math.random()*(100000-1000)+1)+1000,(int)(Math.random()*(99-27)+1)+27);
		}
		return politicosSospechosos;
	}
	
	public Politico[] bubbleSort() {
		return null;
	}
	public Ladron[][] bubbleSortl() {
		return null;
	}
	public Politico[] selectionSort() {
		return null;
	}
	public Ladron[][] selectionSortl() {
		return null;
	}
	
	public Politico[] insertionSort() {
		return null;
	}
	public Ladron[][] insertionSortl() {
		return null;
	}
	public Politico[] mergeSort() {
		return null;
	}
	public Ladron[][] mergeSortl() {
		return null;
	}
	public Politico[] quickSort() {
		return null;
	}
	public Ladron[][] quickSortl() {
		return null;
	}
}
