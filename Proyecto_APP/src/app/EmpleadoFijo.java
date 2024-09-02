
package app;


public class EmpleadoFijo extends Empleado {
    private double bonificacion;

    public EmpleadoFijo(String nombre, String identificacion, double salarioBase, double bonificacion) {
        super(nombre, identificacion, salarioBase);
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return bonificacion + salarioBase;
    }
    
    
}
