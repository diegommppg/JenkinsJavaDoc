package persona;

/**
* ScrumMaster es la clase utilizada para reprensentar al jefe del proyecto.
* <p> 
* Accede a la {@link persona.Empleado} clase para ver la clase padre
* @author DiegoMM
* 
*/
public class ScrumMaster extends Empleado{
	/**
	 * Atributo privado que representa la cantidad adicional que cobra
	 * el empleado
	 * 
	 */
	private double bono;
	
    
	/**
	* Constructor de la clase ScrumMaster
	* @param nombre Representa el nombre del empleado
	* @param salarioBase Indica el salario mínimo que recibe el empleado
	* @param bono Representa la cantidad adicional que cobra el empleado
	*/
    public ScrumMaster(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }
    
    /**
	* Método que calcula el salario de un Scrum Master realizando la suma 
	* del salario base más el bono
	* @return Devuelve un decimal con la suma del salario base más el bono
	*/
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
    
    /**
     * <p>Método que calcula el salario neto a partir del bruto
     * <a href="https://cincodias.elpais.com/herramientas/calculadora-sueldo-neto/">Calcular</a>
     * </p>
     * @return Devuelve el sueldo neto recibido por el empleado 
     * @see <a href="https://cincodias.elpais.com/herramientas/calculadora-sueldo-neto/">Calculadora</a>
     * @see persona.Empleado#calcularSalario()
     * @since 1.5
     */
    public double calcularNeto() {
        return calcularSalario() * 0.8;
    }
}
