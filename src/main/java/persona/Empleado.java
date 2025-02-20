package persona;


 
// TODO: Auto-generated Javadoc
/**
 * The Class Empleado que representa una Persona
 */
public class Empleado {
	
	/** The nombre de un empleado */
	protected String nombre;
    
    /** The salario base que cobra un empleado en un mes */
    protected double salarioBase;
    
    /**
     * Instantiates a new empleado.
     *
     * @param nombre the nombre de un empleado
     * @param salarioBase the salario base que cobra un empleado en un mes
     */
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    /**
     * Calcular salario.
     *
     * @return un decimal con el salario de un empleado
     */
    public double calcularSalario() {
        return salarioBase;
    }
    
    /**
     * Mostrar informacion de un empleado.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: " + salarioBase);
    }
}
