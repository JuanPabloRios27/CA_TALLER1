package co.edu.unbosque.model;

/**
 * Este objeto ayuda a proporcionar información  
 * acerca de los respectivos algoritmos incluyendo sus resultados que se llevaron a cabo.
 * @author Alejandro
 */
public class Estadisticas {
	/**
	 * Nombre o tipo de algoritmo que se uso.
	 */
	private String algoritmo;
	/**
	 * Número de interacciones que el algoritmo ha llevado a cabo.
	 */
	private int interaciones;
	/**
	 * Número de comparaciones que el algoritmo ha llevado a cabo.
	 */
	private int comparaciones;
	/**
	 * Tiempo de ejecución que el algoritmo necesito para finalizar su función.
	 */
	private long tiempoEjecucion;
	
}
