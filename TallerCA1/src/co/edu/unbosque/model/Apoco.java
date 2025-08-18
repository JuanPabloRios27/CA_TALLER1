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
	public String ordenarPoliticos(int selectedIndex) {
		StringBuilder politico = new StringBuilder();
		politico.append("Longitud de ladrones: "+ politicosSospechosos.length);
		switch(selectedIndex) {
			case 0:
				ordenador.inicieStats("BubbleSort");
				politicosSospechosos = ordenador.bubbleSort(politicosSospechosos);
				break;
			case 1:
				ordenador.inicieStats("SelectionSort");
				politicosSospechosos = ordenador.selectionSort(politicosSospechosos);
				break;
			case 2:
				ordenador.inicieStats("InsertionSort");
				politicosSospechosos = ordenador.insertionSort(politicosSospechosos);
				break;
			case 3:
				ordenador.inicieStats("MergeSort");
				politicosSospechosos = ordenador.mergeSort(politicosSospechosos, 0, politicosSospechosos.length-1);
				break;
			case 4:
				ordenador.inicieStats("QuickSort");
				politicosSospechosos = ordenador.quickSort(politicosSospechosos, 0, politicosSospechosos.length-1);
				break;
			default:
				break;
		}
		politico.append(ordenador.getEstadisticas().toString()+"\n");
		return politico.toString();
	}
	/**
	 * Ordene los ladrones de acuerdo con el algoritmo de ordenamiento que ha seleccionado.
	 * @param selectedIndex El algoritmo de ordenamiento.
	 * @return La cantidad de ladrones que ordeno.
	 */
	public String ordenarLadrones(int selectedIndex) {
		StringBuilder politico = new StringBuilder();
		switch(selectedIndex) {
		case 0:
			ladrones = matriz.bubbleSort(ladrones);
			break;
		case 1:
			ladrones = matriz.selectionSort(ladrones);
			break;
		case 2:
			ladrones = matriz.insertionSort(ladrones);
			break;
		case 3:
			matriz.inicieStats("MergeSort");
			ladrones = matriz.mergeSort(ladrones);
			break;
		case 4:
			matriz.inicieStats("QuickSort");
			ladrones = matriz.quickSort(ladrones);
			break;
		default:
			break;
		}
		politico.append(matriz.getEstadisticas().toString());
		politico.append("\nNúmero de columnas: "+ ladrones.length+"\n");
		politico.append("Número de filas: "+ ladrones[0].length+"\n");
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

	

}
