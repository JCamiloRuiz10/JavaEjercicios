
package app;

import javax.swing.JOptionPane;


public abstract class Empleado {
    protected String nombre;
    protected String identificacion;
    protected double salarioBase;

    public Empleado(String nombre, String identificacion, double salarioBase) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    public abstract double calcularSalario();
    
    public void mostrarInfo(){
        JOptionPane.showInternalMessageDialog(null, "Nombre: " + nombre
        + "\nId: " + identificacion + "\nSalario: " + calcularSalario());
    }
}
