package co.edu.unbosque.model;

/**
 * Este objeto ayuda a proporcionar información  
 * acerca de los respectivos algoritmos incluyendo sus resultados que se llevaron a cabo.
 * @author Antonio
 */
public class Estadisticas {
	/**
	 * El tiempo total en capturar el tiempo.
	 */
	private long tiempo;
	
	/**
	 * Inicio del respectivo algoritmo al ejecutarse.
	 */
	private long inicio;
	/**
	 * Fin del respectivo algoritmo al ejecutarse.
	 */
	private long fin;
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
	 * Empiece a capturar los datos.
	 */
	public Estadisticas() {
		this.interaciones = 0;
		this.comparaciones = 0;
	}
	
	public long getTiempo() {
		return tiempo;
	}
	public long getInicio() {
		return inicio;
	}
	public long getFin() {
		return fin;
	}
	public String getAlgoritmo() {
		return algoritmo;
	}
	public int getInteraciones() {
		return interaciones;
	}
	public int getComparaciones() {
		return comparaciones;
	}
	public long getTiempoEjecucion() {
		return tiempoEjecucion;
	}
	public void setTiempo(long tiempo) {
		this.tiempo = tiempo;
	}
	public void setInicio(long inicio) {
		this.inicio = inicio;
	}
	public void setFin(long fin) {
		this.fin = fin;
	}
	public void setAlgoritmo(String algoritmo) {
		this.algoritmo = algoritmo;
	}
	public void setInteraciones(int interaciones) {
		this.interaciones = interaciones;
	}
	public void setComparaciones(int comparaciones) {
		this.comparaciones = comparaciones;
	}
	public void setTiempoEjecucion(long tiempoEjecucion) {
		this.tiempoEjecucion = tiempoEjecucion;
	}
	/**
	 * Imprime los resultados que tomo el algoritmo en realizar.
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Resultados: \n");
		sb.append("Algoritmo: "+algoritmo+"\n");
		sb.append("Interacciones: "+ interaciones+"\n");
		sb.append("Comparaciones: "+comparaciones+"\n");
		sb.append("Tiempo"+tiempo+"\n");
		return sb.toString();
	}
	public void captureTiempo() {
		inicio = System.nanoTime();
	}
	public void finalizeTiempo() {
		fin = System.nanoTime();
		tiempo = fin - inicio;
		
	}
	
	
}
