package co.edu.unbosque.model;

/**
 * Este objeto ayuda a proporcionar información  
 * acerca de los respectivos algoritmos incluyendo sus resultados que se llevaron a cabo.
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
	/**
	 * Obtenga información con respecto a las interacciones.
	 * @return
	 */
	public long getInteraciones() {
		return interaciones;
	}
	/**
	 * Obtenga información con respecto a las comparaciones.
	 * @return el número de comparaciones.
	 */
	public long getComparaciones() {
		return comparaciones;
	}
	
	/**
	 * Especifique el tipo de algoritmo
	 * @param algoritmo el tipo de algoritmo de ordenamiento a especificar.
	 */
	public void setAlgoritmo(String algoritmo) {
		this.algoritmo = algoritmo;
	}
	/**
	 * Modifica o agrega comparaciones.
	 * @param l el número de comparaciones a modificar.
	 */
	public void setInteraciones(long l) {
		this.interaciones = l;
	}
	/**
	 * Modifica o agrega comparaciones.
	 * @param l el número de comparaciones a modificar.
	 */
	public void setComparaciones(long l) {
		this.comparaciones = l;
	}
	
	/**
	 * Imprime los resultados que tomo el algoritmo en realizar.
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nResultados: \n");
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
