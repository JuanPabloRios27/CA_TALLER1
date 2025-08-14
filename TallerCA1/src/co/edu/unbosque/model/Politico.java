package co.edu.unbosque.model;
/**
 * Es el objeto de tipo politico que implica qué esta siendo señalado por ser responsable de un caso de corrupción.
 * @author Alejandro
 */
public class Politico {
	/**
	 * Cedula de ciudadania del respectivo ciudadano.
	 */
	private String id;
	/**
	 * Nombre del respectivo politico acusado de corrupción.
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
	public Politico(String id, String nombre, double dineroRobado, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dineroRobado = dineroRobado;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Politico [id=" + id + ", nombre=" + nombre + ", dineroRobado=" + dineroRobado + ", edad=" + edad + "]";
	}
	
	
	
	
	
}
