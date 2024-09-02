
package app;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Departamento {
    private String nombreDepartamento;
    private String ubicacion;
    private ArrayList<Empleado> empleados;

    public Departamento() {
        this.nombreDepartamento = JOptionPane.showInputDialog("Ingrese el nombre del Departamento:");
        this.ubicacion = JOptionPane.showInputDialog("Ingrese el nombre de ubicacion del departamento:");
        this.empleados = new ArrayList<>();
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    //Agregar Empleados
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
        JOptionPane.showMessageDialog(null, "El empleado " + empleado.getNombre() + " ha sido agregado al departamento " + nombreDepartamento);
    }
    //Mostrar Empleados
    public void mostrarEmpleados() {
        StringBuilder listaEmpleados = new StringBuilder("Empleados en el departamento " + nombreDepartamento + ":\n");
        for (Empleado empleado : empleados) {
            listaEmpleados.append("Nombre: ").append(empleado.getNombre()).append(" Puesto: ").append(empleado.getPuesto()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaEmpleados.toString());
    }
    
    
}
