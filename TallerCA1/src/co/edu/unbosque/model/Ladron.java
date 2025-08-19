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
	 * Dinero robado que lo vincula al  politico (Valorizado en rublos).
	 */
	private double dineroRobado;
	/**
	 * Años de edad que posee el respectivo mandatario.
	 */
	private int edad;
	
	/**
	 * El constructor con respecto al ladron
	 * @param id el número de identificación
	 * @param dineroRobado el dinero que se  robo
	 * @param edad la edad del respectivo delicuente.
	 */
	public Ladron(int id, double dineroRobado, int edad) {
		super();
		this.id = id;
		this.dineroRobado = dineroRobado;
		this.edad = edad;
	}
	/**
	 * Consigue el número de identificación. 
	 * @return id el número de identificación.
	 */
	public int getId() {
		return id;
	}
	/**
	 * Consigue el dinero robado
	 * @return dineroRobado el dinero que se robo.
	 */
	public double getDineroRobado() {
		return dineroRobado;
	}
	/**
	 * Consigue la edad del respectivo ladron.
	 * @return edad la edad que se robo.
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Imprima la información con respecto con el ladron.
	 */
	@Override
	public String toString() {
		return "Ladron [id=" + id + ", dineroRobado=" + dineroRobado + ", edad=" + edad + "]";
	}
	
	
	
}
