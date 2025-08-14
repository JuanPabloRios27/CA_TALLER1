package co.edu.unbosque.model;

import java.util.List;
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
	 * Genera el arreglo con longitud n, que permite realizar la respectiva prueba.
	 * @author Juan Pablo Ríos Rodríguez
	 */
	public void generarPoliticos(int n) {
		politicosSospechosos = new Politico[n];
		for(int i = 0; i < n; i++) {
			politicosSospechosos[i] = new Politico(Integer.toString(i),"Politico #"+i,(Math.random()*1000000000-100000+1)+100000,(int)(Math.random()*99-1));
		}
		System.out.println(politicosSospechosos[1].toString());
	}
	/**
	 * Toma el arreglo de longitud variable que representa los politicos acusados de corrupción.
	 * @return politicosSospechosos el arreglo de longitud variable que representa a los respectivos politicos acusados de corrupción.
	 */
	public Politico[] getPoliticosSospechosos() {
		return politicosSospechosos;
	}
	/**
	 * 
	 * @return ladrones La matriz de forma de arreglo que posiciona los respectivos 
	 */
	public Ladron[][] getLadrones() {
		return ladrones;
	}
	public List<Estadisticas> getEstadisticas() {
		return estadisticas;
	}
	public void setPoliticosSospechosos(Politico[] politicosSospechosos) {
		this.politicosSospechosos = politicosSospechosos;
	}
	public void setLadrones(Ladron[][] ladrones) {
		this.ladrones = ladrones;
	}
	public void setEstadisticas(List<Estadisticas> estadisticas) {
		this.estadisticas = estadisticas;
	}
	
	
}
