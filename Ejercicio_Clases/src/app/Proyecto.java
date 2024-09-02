
package app;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Proyecto {
    private String nombreProyecto;
    private int presupuesto;
    private String fechaInicio;
    private String fechaFin;
    private ArrayList<Empleado> empleadosAsignados;

    // Constructor que solicita valores al usuario
    public Proyecto() {
        this.nombreProyecto = JOptionPane.showInputDialog("Ingrese el nombre del proyecto:");
        this.presupuesto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el presupuesto del proyecto:"));
        this.fechaInicio = JOptionPane.showInputDialog("Ingrese la fecha de inicio del proyecto (DD/MM/YYYY):");
        this.fechaFin = JOptionPane.showInputDialog("Ingrese la fecha de fin del proyecto (DD/MM/YYYY):");
        this.empleadosAsignados = new ArrayList<>();
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }
    
    public void asignarEmpleado(Empleado empleado) {
        this.empleadosAsignados.add(empleado);
        JOptionPane.showMessageDialog(null, "El empleado " + empleado.getNombre() + " ha sido asignado al proyecto " + nombreProyecto);
    }

    public void mostrarEmpleadosAsignados() {
        StringBuilder listaEmpleados = new StringBuilder("Empleados asignados al proyecto " + nombreProyecto + ":\n");
        for (Empleado empleado : empleadosAsignados) {
            listaEmpleados.append(empleado.getNombre()).append(" - ").append(empleado.getPuesto()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaEmpleados.toString());
    }
}

