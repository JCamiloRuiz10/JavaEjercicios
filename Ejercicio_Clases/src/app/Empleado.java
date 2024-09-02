
package app;

import javax.swing.JOptionPane;

public class Empleado {
    protected  String nombre;
    protected int edad;
    protected String puesto;
    protected int salario;
    protected Proyecto asignarProyecto;

    public Empleado() {
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado:"));
        this.puesto = JOptionPane.showInputDialog("Ingrese el puesto del empleado:");
        this.salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public Proyecto getProyectoAsignado() {
        return asignarProyecto; 
    }

    public void AsignarProyecto(Proyecto proyecto){
        this.asignarProyecto = proyecto;
        JOptionPane.showMessageDialog(null, "El empleado " + nombre + " ha sido asignado al proyecto " + proyecto.getNombreProyecto());
    
    }   
}
