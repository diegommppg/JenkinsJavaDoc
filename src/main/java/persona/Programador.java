package persona;

/**
* Programador es la clase utilizada para reprensentar al pica código del proyecto
* Accede a la {@link persona.Empleado} clase para ver la clase padre
* @author DiegoMM
* 
*/
public class Programador extends Empleado{
	
	/** The horas extra. */
	private int horasExtra;
    
    /** The tarifa hora extra. */
    private double tarifaHoraExtra;
    
    /**
     * Constructor de la clase Programador
     * @param nombre de un programador
     * @param salarioBase el salario base de un programador
     * @param horasExtra de un programador
     * @param tarifaHoraExtra de un programador
     */
    public Programador(String nombre, double salarioBase, int horasExtra, double tarifaHoraExtra) {
        super(nombre, salarioBase);
        this.horasExtra = horasExtra;
        this.tarifaHoraExtra = tarifaHoraExtra;
    }
    
    
    /**
     * @return salario base de un programados mas el salario de las horas extra
     */
    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtra * tarifaHoraExtra);
    }
}
