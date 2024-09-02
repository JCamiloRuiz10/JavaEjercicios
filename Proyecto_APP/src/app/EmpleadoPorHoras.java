
package app;

public class EmpleadoPorHoras extends Empleado{
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, String identificacion, double tarifaPorHora, double horasTrabajadas) {
        super(nombre, identificacion, tarifaPorHora * horasTrabajadas);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }

    
    
    
}
