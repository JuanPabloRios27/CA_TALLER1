package co.edu.unbosque.model;
/**
 * Es el objeto de tipo politico que implica qué esta siendo señalado por ser responsable de un caso de corrupción.
 */
public class Politico {
	/**
	 * Cedula de ciudadania del respectivo ciudadano.
	 */
	private int id;
	/**
	 * Dinero robado que lo vincula al respectivo politico (Valorizado en rublos).
	 */
	private double dineroRobado;
	/**
	 * Años de edad que posee el respectivo mandatario.
	 */
	private int edad;
	/**
	 * Consigue el número de identificación
	 * @return id el número de identificación.
	 */
	public int getId() {
		return id;
	}
	/**
	 * Consiga el dinero que se robo
	 * @return dineroRobado el dinero que se robo.
	 */
	public double getDineroRobado() {
		return dineroRobado;
	}
	/**
	 * Consiga la edad del político.
	 * @return edad la edad del respectivo político.
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * El constructor de la clase político.
	 * @param id el número de identificación
	 * @param dineroRobado el dinero que se robo.
	 * @param edad la edad del político
	 */
	public Politico(int id, double dineroRobado, int edad) {
		super();
		this.id = id;
		this.dineroRobado = dineroRobado;
		this.edad = edad;
	}
	/**
	 * Imprima la información con respecto al político.
	 */
	@Override
	public String toString() {
		return id + " \t" + dineroRobado + " \t" + edad + " \t \n";
	}
	
	
	
	
	
}
