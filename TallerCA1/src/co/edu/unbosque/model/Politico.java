package co.edu.unbosque.model;
/**
 * Es el objeto de tipo politico que implica qué esta siendo señalado por ser responsable de un caso de corrupción.
 * @author Juan Pablo Ríos Rodríguez y Alejandro
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
	public int getId() {
		return id;
	}
	public double getDineroRobado() {
		return dineroRobado;
	}
	public int getEdad() {
		return edad;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDineroRobado(double dineroRobado) {
		this.dineroRobado = dineroRobado;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Politico(int id, double dineroRobado, int edad) {
		super();
		this.id = id;
		this.dineroRobado = dineroRobado;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return id + " \t" + dineroRobado + " \t" + edad + " \t \n";
	}
	
	
	
	
	
}
