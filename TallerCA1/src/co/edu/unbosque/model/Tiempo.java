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
	 * Esta función implica que empiece el cronometro al momento de utilizar el algoritmo.
	 * @author Juan Pablo Ríos Rodríguez.
	 */
	public void startTime() {
		inicio = System.nanoTime();
	}
	/**
	 * Esta función implica que finalize el cronometro y capture el tiempo 
	 * que toma el respectivo algoritmo en finalizar.
	 * @author Juan Pablo Ríos Rodríguez
	 */
	public void endTime() {
		fin = System.nanoTime();
		tiempo = fin-inicio;
	}

	public long getTiempo() {
		return tiempo;
	}	
}
