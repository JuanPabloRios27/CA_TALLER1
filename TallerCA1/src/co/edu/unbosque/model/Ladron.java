package co.edu.unbosque.model;
/**
 * Esta es el objeto que representa al respectivo ladrón.
 * @author Alejandro.
 */
public class Ladron {
	/**
	 * Clave de identificación con respecto al ladrón.
	 */
	private String id;
	/**
	 * Nombre completo del implicado ladrón.
	 */
	private String nombre;
	/**
	 * Dinero robado que lo vincula al respectivo politico (Valorizado en rublos).
	 */
	private double dineroRobado;
	/**
	 * Años de edad que posee el respectivo mandatario.
	 */
	private int edad;
	
	
	public Ladron(String id, String nombre, double dineroRobado, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dineroRobado = dineroRobado;
		this.edad = edad;
	}
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public double getDineroRobado() {
		return dineroRobado;
	}
	public int getEdad() {
		return edad;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDineroRobado(double dineroRobado) {
		this.dineroRobado = dineroRobado;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
