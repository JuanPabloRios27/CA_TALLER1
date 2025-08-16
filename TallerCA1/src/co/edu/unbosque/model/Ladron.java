package co.edu.unbosque.model;
/**
 * Esta es el objeto que representa al respectivo ladrón.
 * @author Alejandro.
 */
public class Ladron {
	/**
	 * Clave de identificación con respecto al ladrón.
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
	
	
	public Ladron(int id, double dineroRobado, int edad) {
		super();
		this.id = id;
		this.dineroRobado = dineroRobado;
		this.edad = edad;
	}
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
	@Override
	public String toString() {
		return "Ladron [id=" + id + ", dineroRobado=" + dineroRobado + ", edad=" + edad + "]";
	}
	
	
	
}
