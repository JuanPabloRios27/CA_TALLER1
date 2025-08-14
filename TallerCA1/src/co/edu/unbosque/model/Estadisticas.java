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
	/**
	 * Constructor que estructura los resultados que tomo el respectivo algoritmo.
	 * @param algoritmo Nombre o tipo de algoritmo que se uso.
	 * @param interaciones Número de comparaciones que el algoritmo ha llevado a cabo.
	 * @param comparaciones Número de comparaciones que el algoritmo ha llevado a cabo.
	 * @param tiempoEjecucion Tiempo de ejecución que el algoritmo necesito para finalizar su función.
	 */
	public Estadisticas(String algoritmo, int interaciones, int comparaciones, long tiempoEjecucion) {
		super();
		this.algoritmo = algoritmo;
		this.interaciones = interaciones;
		this.comparaciones = comparaciones;
		this.tiempoEjecucion = tiempoEjecucion;
	}
	/**
	 * Imprime los resultados que tomo el algoritmo en realizar.
	 */
	@Override
	public String toString() {
		return "Estadisticas [algoritmo=" + algoritmo + ", interaciones=" + interaciones + ", comparaciones="
				+ comparaciones + ", tiempoEjecucion=" + tiempoEjecucion + "]";
	}
	
}
