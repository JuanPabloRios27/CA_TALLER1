package co.edu.unbosque.model;

/**
 * Este objeto ayuda a proporcionar información  
 * acerca de los respectivos algoritmos incluyendo sus resultados que se llevaron a cabo.
 * @author Antonio
 */
public class Estadisticas {
	Runtime runtime = Runtime.getRuntime();
	/**
	 * El tiempo total en capturar el tiempo.
	 */
	private long tiempo;
	private long memoriaUsada;
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
	private long interaciones;
	/**
	 * Número de comparaciones que el algoritmo ha llevado a cabo.
	 */
	private long comparaciones;
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
	public long getInteraciones() {
		return interaciones;
	}
	public long getComparaciones() {
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
	public void setInteraciones(long l) {
		this.interaciones = l;
	}
	public void setComparaciones(long l) {
		this.comparaciones = l;
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
		sb.append("Tiempo: "+tiempo+"\n");
		sb.append("Memoria usada: "+memoriaUsada+"\n");
		return sb.toString();
	}
	public void captureTiempo() {
		inicio = System.nanoTime();
	}
	public void captureMemoria() {
		runtime.gc();
	}
	public void finaliceMemoria() {
		memoriaUsada = runtime.totalMemory()-runtime.freeMemory(); 
	}
	public void finalizeTiempo() {
		fin = System.nanoTime();
		tiempo = fin - inicio;
	}

	
	
	
}
