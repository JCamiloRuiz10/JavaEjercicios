
package app;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(JOptionPane.showInputDialog("Digite el nombre de la empresa: "));
        
        while (true) {            
            String[] opciones = {"Empleado fijo", "Empleado por Horas",
                "Empleado por Contrato", "Mostrar", "Salir"};
            
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion: ",
                    "Gestion Empleados", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,
                    null,opciones,opciones[0]);
            
            switch (opcion) {
                case 0:
                    String nombreFijo = JOptionPane.showInputDialog("Digite el nombre del empleado: ");
                    String identificacionFijo = JOptionPane.showInputDialog("Digite la identificacion del empleado: ");
                    double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite el salario del empleado: "));
                    double bonificacion = Double.parseDouble(JOptionPane.showInputDialog("Digite la bonificacion del empleado: "));
                    EmpleadoFijo empleadoFijo = new EmpleadoFijo(nombreFijo, identificacionFijo, salarioBase, bonificacion);
                    empresa.agregarEmpleado(empleadoFijo);
                    break;
                case 1:
                    String nombreHoras = JOptionPane.showInputDialog("Digite el nombre del empleado: ");
                    String identificacionHoras = JOptionPane.showInputDialog("Digite la identificacion del empleado: ");
                    double tarifaPorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la hora: "));
                    double horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog("Digite las horas trabajadas: "));
                   EmpleadoPorHoras empleadoPorHora = new EmpleadoPorHoras(nombreHoras, identificacionHoras, tarifaPorHora, horasTrabajadas);
                    empresa.agregarEmpleado(empleadoPorHora);
                    break;
                case 2:
                    String nombreContrato = JOptionPane.showInputDialog("Digite el nombre del empleado: ");
                    String identificacionContrato = JOptionPane.showInputDialog("Digite la identificacion del empleado: ");
                    double montoContrato = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la hora: "));
                    double duracionContrato = Double.parseDouble(JOptionPane.showInputDialog("Digite las horas trabajadas: "));
                    EmpleadoPorContrato empleadoContrato = new EmpleadoPorContrato(nombreContrato, identificacionContrato, montoContrato, duracionContrato);
                    empresa.agregarEmpleado(empleadoContrato);
                    break;
                case 3:
                    empresa.mostrarInfoEmpleados();
                    break;
                case 4:
                    int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere salir del sistema?", "Confirmar Salida", JOptionPane.YES_NO_OPTION);
                    if (confirmacion == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    }
                    break;
                default:
                    break;
            }
        }       
    }
}
