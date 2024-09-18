
package app;

import static app.Array_6.agregarMiembro;
import static app.Array_6.buscar;
import javax.swing.JOptionPane;

class club{
    String nombre;
    int edad;
    String deporte;
    int cuota;
    public club(String nombre, int edad, String deporte, int cuota){
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
        this.cuota = cuota;
    }
}
public class Array_6 {
    public static void main(String[] args) {
        club[] deportes = new club[50];
        deportes[0] = new club("Camilo", 19, "Futbol", 100000);
        deportes[1] = new club("Jose", 24, "Tenis", 200000);
        deportes[2] = new club("Ana", 19, "Ciclismo", 80000);
        deportes[3] = new club("Maria", 34, "Natacion", 160000);
        
        String seleccion;
        do {            
            String[] opciones = {"Mostrar", "Agregar","Actualizar Cuota", "Buscar", "Promedio", "Salir"};
            seleccion = (String) JOptionPane.showInputDialog(null,
                "Selecione la funcion de Proyectos",
                "Funciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
            switch (seleccion) {
                case "Mostrar":
                    String ver = "";
                    for (club mostrar : deportes) {
                        if (mostrar != null) {
                            ver += ("Nombre: " + mostrar.nombre + "\n" + "Edad: " + mostrar.edad +"\n" + "Deporte: " + mostrar.deporte + "\n" + "Cuota Mensual: "+ mostrar.cuota+ "\n\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, ver);
                    break;
                case "Agregar":
                    String nombreA= JOptionPane.showInputDialog("Ingrese Nombre");
                    int edadA= Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
                    String deporteA = JOptionPane.showInputDialog("Ingrese el deporte");
                    int cuotaA= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuota mensual"));
                    club agregar = agregarMiembro(deportes, nombreA, edadA, deporteA, cuotaA);
                    if (agregar!= null) {
                        JOptionPane.showMessageDialog(null, "Bienvenido " + nombreA + " al club");
                    } else {
                        JOptionPane.showMessageDialog(null, "Miembro no agregado al club" );
                    }
                    break;
                case "Actualizar Cuota":
                    String nombreMiembro = JOptionPane.showInputDialog("Ingrese nombre del miembro a actualizar cuota");
                    club actualizar = buscar(deportes, nombreMiembro);
                    if (actualizar != null) {    
                        int nuevaCuota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cuota mensual"));
                        if (actualizar.cuota > 0) {
                            actualizar.cuota =  nuevaCuota;       
                            JOptionPane.showMessageDialog(null, nombreMiembro + " se ha actualizado su mensualidad por $" + nuevaCuota );
                        } else {
                            JOptionPane.showMessageDialog(null,  nombreMiembro + " no se logro actualizar su cuota");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El miembro no esta en el club");
                    }
                    break;
                case "Buscar":
                    String nombreBuscar = JOptionPane.showInputDialog("Ingrese el nombre del miembro a buscar");
                    club busqueda = buscar(deportes, nombreBuscar);
                    if (busqueda != null) {
                        JOptionPane.showMessageDialog(null, "Nombre: " + busqueda.nombre + "\n" + "Edad: " + busqueda.edad +"\n" + "Deporte: " + busqueda.deporte + "\n" + "Cuota Mensual: "+ busqueda.cuota);
                    } else {
                        JOptionPane.showMessageDialog(null, "Miembro no encontrado");
                    }
                    break;
                case "Promedio":
                    int sumaEdad = 0;
                    int numMiembros = 0;
                    for (club miembro : deportes) {
                        if (miembro != null) {
                            sumaEdad += miembro.edad;
                            numMiembros++;
                        }
                    }
                    if (numMiembros > 0) {
                        double promedio = (double) sumaEdad / numMiembros;
                        JOptionPane.showMessageDialog(null, "El promedio de edad es: " + promedio);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay miembros en el club");
                    }
                    break;
                case "Salir":
                    JOptionPane.showMessageDialog(null, "Salieendo.....");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (!seleccion.equals("Salir"));
    }
    public static club agregarMiembro(club[] deportes, String nombre, int edad, String deporte, int cuota){
        for (club agregar : deportes) {
            agregar.nombre = nombre;
            agregar.edad = edad;
            agregar.deporte = deporte;
            agregar.cuota = cuota;
            return agregar;
        }
        return null;
    }
    public static club buscar(club[] deportes, String nombre){
        for (club buscar : deportes) {
            if (buscar != null && buscar.nombre.equals(nombre)) {
                return buscar;
            } 
        }
        return null;
    }
}
