package co.edu.unbosque.model;
/**
 * Este objeto permite capturar el tiempo que posee los diferentes algoritmos en ejecutar.
 * @author Juan Pablo Ríos Rodríguez.
 */
public class Tiempo {
	
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
	 * LLame al constructor para iniciar el cronometro que recorre el respectivo algoritmo.
	 * @author Juan Pablo Rios Rodriguez.
	 */
	public Tiempo() {
		startTime();
	}
	/**
	 * Esta función implica que empiece el cronometro al momento de utilizar el algoritmo.
	 * @author Juan Pablo Ríos Rodríguez.
	 */
	private void startTime() {
		inicio = System.nanoTime();
	}
	/**
	 * Esta función permite capturar el tiempo que retomo el respectivo algoritmo. 
	 * que toma el respectivo algoritmo en finalizar.
	 * @author Juan Pablo Ríos Rodríguez
	 */
	public void endTime() {
		fin = System.nanoTime();
		tiempo = fin-inicio;
	}
	/**
	 * Recoje la variable del tiempo.
	 * @author Juan Pablo Ríos Rodríguez.
	 * @return tiempo El tiempo que recorrio el algoritmo.
	 */
	public long getTiempo() {
		return tiempo;
	}	
}
