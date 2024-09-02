
package app;


public class EmpleadoPorContrato extends Empleado{
    private double duracionContrato; //meses
    private double montoContrato;

    public EmpleadoPorContrato(String nombre, String identificacion, double montoContrato, double duracionContrato) {
        super(nombre, identificacion, montoContrato / duracionContrato);
        this.duracionContrato = duracionContrato;
        this.montoContrato = montoContrato;
    }

    @Override
    public double calcularSalario() {
        return montoContrato / duracionContrato;
    }
    
    
    
}
