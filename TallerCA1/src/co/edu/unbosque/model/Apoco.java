package co.edu.unbosque.model;

import java.util.List;

import co.edu.unbosque.util.Ordenador;

import java.lang.Math;
/**
 * Aca almacenamos toda la información correspondiente con respecto al sistema de información que maneja la corporación APOCO.
 * @author Alejandro
 * @author Juan Pablo Ríos Rodríguez.
 */
public class Apoco {
	/**
	 * Un arreglo de longitud variable que implica todos los politicos que se encuentran bajo investigación.
	 */
	private Politico[] politicosSospechosos;
	/**
	 * Matriz de tamaño k*m que represente un grupo de n ladrones.
	 */
	private Ladron[][] ladrones;
	/**
	 * La lista de todas las pruebas empiricas que llevaron a cabo los algoritmos de ordenamiento.
	 */
	private List<Estadisticas> estadisticas;
	/**
	 * LLame a la función para realizar las funciones que otorga el arreglo de los políticos.
	 */
	private Ordenador ordenador;
	
	/**
	 * Prepara las operaciones para realizar los respectivos algoritmos.
	 * @author Juan Pablo Ríos Rodríguez.
	 */
	public Apoco() {
		ordenador = new Ordenador();
	}
	/**
	 * Muestra el arreglo con respecto a los políticos.
	 * @author Juan Pablo Ríos Rodríguez
	 * @return El arreglo completo con respecto a los politicos.
	 */
	public String mostrarPoliticos() {
		StringBuilder politico = new StringBuilder();
		for(int i = 0; i < politicosSospechosos.length; i++) {
			politico.append(politicosSospechosos[i]);
		}
		return politico.toString();
	}
	/**
	 * Llame a la función para generar el arreglo con longitud n, que permita realizar la respectiva prueba.
	 * @author Juan Pablo Ríos Rodríguez
	 */
	public void generarPoliticos(int n) {
		politicosSospechosos = ordenador.genereDatos(n);
	}
	/**
	 * Toma el arreglo de longitud variable que representa los politicos acusados de corrupción.
	 * @return politicosSospechosos el arreglo de longitud variable que representa a los respectivos politicos acusados de corrupción.
	 */
	public Politico[] getPoliticosSospechosos() {
		return politicosSospechosos;
	}
	/**
	 * Esta función obtiene la matriz que representa los ladrones.
	 * @return ladrones La matriz de forma de arreglo que posiciona los respectivos 
	 */
	public Ladron[][] getLadrones() {
		return ladrones;
	}
	/**
	 * Esta función obtiene las estadisticas.
	 * @return estadisticas Las respectivas estadisticas que revelan resultados entorno al algoritmo que se ha probado de forma empirica. 
	 */
	public List<Estadisticas> getEstadisticas() {
		return estadisticas;
	}
	/**
	 * Modifique el arreglo de los politicos en caso de ser necesario.
	 * @param politicosSospechosos El respectivo arreglo a modificar.
	 */
	public void setPoliticosSospechosos(Politico[] politicosSospechosos) {
		this.politicosSospechosos = politicosSospechosos;
	}
	/**
	 * Modifique la matriz que se encuentran almacenados los respectivos ladrones.
	 * @param ladrones
	 */
	public void setLadrones(Ladron[][] ladrones) {
		this.ladrones = ladrones;
	}
	/**
	 * Modifique la lista de estadísticas.
	 * @param estadisticas La lista de resultados que se va a modificar
	 */
	public void setEstadisticas(List<Estadisticas> estadisticas) {
		this.estadisticas = estadisticas;
	}
	
	
}
