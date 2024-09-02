
package app;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Empresa {
    private String nombreEmpresa;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    
    public void mostrarInfoEmpleados(){
        StringBuilder info = new StringBuilder("Empresa: " + nombreEmpresa + "\nEmpleados: " + empleados);
        for (Empleado empleado : empleados) {
            info.append("\n").append(empleado.getNombre()).append(" Id: ").append(empleado.getIdentificacion())
                    .append("  Salario:  ").append(empleado.calcularSalario());
        }
        JOptionPane.showMessageDialog(null, info.toString());
    }
}
