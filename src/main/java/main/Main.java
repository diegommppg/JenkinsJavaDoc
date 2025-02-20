package main;

import persona.*;

/**
 * <h2>Empleados</h2> Programa que realiza el calculo del salario de un empleado
 * y un Scrum Master
 *
 * @author DiegoMM
 * @version 1.0
 * @since 30-01-2025
 */
public class Main {

	
	/**
	 * The main method. Creates an employee and a scrum master and prints their salaries
	 *
	 * @param args the arguments (no usados en este programa)
	 */
	public static void main(String[] args) {
		ScrumMaster jefe = new ScrumMaster("Julian", 60000, 10000);
        Programador programador = new Programador("Pedro", 30000, 10, 0);
        
        
        
        System.out.println("Información del gerente:");
        jefe.mostrarInformacion();
        System.out.println("Salario total: " + jefe.calcularSalario());
        
        System.out.println("\nInformación del programador:");
        programador.mostrarInformacion();
        System.out.println("Salario total: " + programador.calcularSalario());

        
        
        
        
        
        
        
        
        
        
        
	}

}
