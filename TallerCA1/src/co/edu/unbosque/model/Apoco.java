package co.edu.unbosque.model;

import java.util.List;

import co.edu.unbosque.util.Matriz;
import co.edu.unbosque.util.Ordenador;

import java.lang.Math;

/**
 * Aca almacenamos toda la información correspondiente con respecto al sistema
 * de información que maneja la corporación APOCO.
 * 
 * @author Alejandro
 * @author Juan Pablo Ríos Rodríguez.
 */
public class Apoco {
	/**
	 * Un arreglo de longitud variable que implica todos los politicos que se
	 * encuentran bajo investigación.
	 */
	private Politico[] politicosSospechosos;
	/**
	 * Matriz de tamaño k*m que represente un grupo de n ladrones.
	 */
	private Ladron[][] ladrones;

	/**
	 * LLame a la función para realizar las funciones que otorga el arreglo de los
	 * políticos.
	 */
	private Ordenador ordenador;
	/**
	 * LLame a la función para realizar los ejercicios de la propia matriz
	 */
	private Matriz matriz;

	/**
	 * Prepara las operaciones para realizar los respectivos algoritmos.
	 * 
	 * @author Juan Pablo Ríos Rodríguez.
	 */
	public Apoco() {
		ordenador = new Ordenador();
		matriz = new Matriz();
	}

	public String ordenarLadrones(int selectedIndex) {
		StringBuilder politico = new StringBuilder();
		if (selectedIndex == 0) {
			ladrones = matriz.bubbleSort(ladrones);
			for (int i = 0; i < ladrones.length; i++) {
				for (int j = 0; j < ladrones[0].length; j++) {
					politico.append(ladrones[i][j].toString());
				}
				politico.append("\n");
			}
		} else if (selectedIndex == 1) {
			ladrones = matriz.selectionSort(ladrones);
			for (int i = 0; i < ladrones.length; i++) {
				for (int j = 0; j < ladrones[0].length; j++) {
					politico.append(ladrones[i][j].toString());
				}
				politico.append("\n");
			}
		} else if (selectedIndex == 2) {
			ladrones = matriz.insertionSort(ladrones);
			for (int i = 0; i < ladrones.length; i++) {
				for (int j = 0; j < ladrones[0].length; j++) {
					politico.append(ladrones[i][j].toString());
				}
				politico.append("\n");
			}
		}
		return politico.toString();
	}

	/**
	 * Muestra el arreglo con respecto a los políticos.
	 * 
	 * @author Juan Pablo Ríos Rodríguez
	 * @return El arreglo completo con respecto a los politicos.
	 */
	public String mostrarPoliticos() {
		StringBuilder politico = new StringBuilder();
		for (int i = 0; i < politicosSospechosos.length; i++) {
			politico.append(politicosSospechosos[i]);
		}
		return politico.toString();
	}

	/**
	 * Imprime toda la matriz con respecto a los ladrones.
	 * 
	 * @author Juan Pablo Rios Rodriguez.
	 * @return todos los ladrones registrados
	 */
	public String mostrarLadrones() {
		StringBuilder ladron = new StringBuilder();
		for (int i = 0; i < ladrones.length; i++) {
			for (int j = 0; j < ladrones[0].length; j++) {
				ladron.append(ladrones[i][j]);
			}
			ladron.append("\n");
		}
		return ladron.toString();
	}

	/**
	 * Llame a la función para generar el arreglo con longitud n, que permita
	 * realizar la respectiva prueba.
	 * 
	 * @author Juan Pablo Ríos Rodríguez
	 */
	public void generarPoliticos(int n) {
		politicosSospechosos = ordenador.genereDatos(n);
	}

	public void generarLadrones(int int1) {
		ladrones = matriz.genereMatriz(int1);
	}

	/**
	 * Toma el arreglo de longitud variable que representa los politicos acusados de
	 * corrupción.
	 * 
	 * @return politicosSospechosos el arreglo de longitud variable que representa a
	 *         los respectivos politicos acusados de corrupción.
	 */
	public Politico[] getPoliticosSospechosos() {
		return politicosSospechosos;
	}

	/**
	 * Esta función obtiene la matriz que representa los ladrones.
	 * 
	 * @return ladrones La matriz de forma de arreglo que posiciona los respectivos
	 */
	public Ladron[][] getLadrones() {
		return ladrones;
	}

	/**
	 * Modifique el arreglo de los politicos en caso de ser necesario.
	 * 
	 * @param politicosSospechosos El respectivo arreglo a modificar.
	 */
	public void setPoliticosSospechosos(Politico[] politicosSospechosos) {
		this.politicosSospechosos = politicosSospechosos;
	}

	/**
	 * Modifique la matriz que se encuentran almacenados los respectivos ladrones.
	 * 
	 * @param ladrones
	 */
	public void setLadrones(Ladron[][] ladrones) {
		this.ladrones = ladrones;
	}

	public String ordenarPoliticos(int selectedIndex) {
		StringBuilder politico = new StringBuilder();
		if (selectedIndex == 0) {
			politicosSospechosos = ordenador.bubbleSort(politicosSospechosos);
			for (int i = 0; i < politicosSospechosos.length; i++) {
				politico.append(politicosSospechosos[i].toString());
			}
		} else if (selectedIndex == 1) {
			politicosSospechosos = ordenador.selectionSort(politicosSospechosos);
			for (int i = 0; i < politicosSospechosos.length; i++) {
				politico.append(politicosSospechosos[i].toString());
			}
			return politico.toString();
		} else if (selectedIndex == 2) {
			politicosSospechosos = ordenador.insertionSort(politicosSospechosos);
			for (int i = 0; i < politicosSospechosos.length; i++) {
				politico.append(politicosSospechosos[i].toString());
			}
			return politico.toString();
		} else if (selectedIndex == 3) {
			politicosSospechosos = ordenador.mergeSort(politicosSospechosos, 0, politicosSospechosos.length-1);
			for (int i = 0; i < politicosSospechosos.length; i++) {
				politico.append(politicosSospechosos[i].toString());
			}
			return politico.toString();
		}else if (selectedIndex == 4) {
			politicosSospechosos = ordenador.quickSort(politicosSospechosos, 0, politicosSospechosos.length-1);
			for (int i = 0; i < politicosSospechosos.length; i++) {
				politico.append(politicosSospechosos[i].toString());
			}
			return politico.toString();
		}
		return politico.toString();
	}

}
