package co.edu.unbosque.model;

import java.util.List;

/**
 * Aca almacenamos toda la información correspondiente con respecto al sistema de información que maneja la corporación APOCO.
 * @author Alejandro
 */
public class Apoco {
	/**
	 * Un arreglo de longitud variable que implica todos los politicos que se encuentran bajo investigación.
	 */
	Politico[] politicosSospechosos;
	/**
	 * Matriz de tamaño k*m que represente un grupo de n ladrones.
	 */
	Ladron[][] ladrones;
	/**
	 * La lista de todas las pruebas empiricas que llevaron a cabo los algoritmos de ordenamiento.
	 */
	List<Estadisticas> estadisticas;
}
