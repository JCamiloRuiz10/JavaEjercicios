
package app;

import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;

class proyecto{
    String nombre;
    int dias;
    String estado;
    
    public proyecto(String nombre, int dias, String estado){
        this.nombre = nombre;
        this.dias = dias;
        this.estado = estado;
    }
}
public class Array_5 {
    public static void main(String[] args) {
        proyecto[] software = new proyecto[30];
        software[0] = new proyecto("Aplicacion de Eventos", 40, "En progreso");
        software[1] = new proyecto("Pagina de Veterinaria", 56, "En progreso");
        software[2] = new proyecto("Juego de futbol", 69, "Completada");
        software[3] = new proyecto("Sitio web Restaurante", 30, "Completada");
        
        String seleccion;
        do {            
            String[] opciones = {"Mostrar", "Agregar","Actualizar Estado", "Buscar", "Ordenar", "Salir"};
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
                    for (proyecto mostrar : software) {
                        if (mostrar != null) {
                            ver += ("Nombre del Proyecto: " + mostrar.nombre + "\n" + "Dias de duracion: " + mostrar.dias +"\n" + "Estado: " + mostrar.estado + "\n\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, ver);
                    break;
                case "Agregar":
                    String nombreA= JOptionPane.showInputDialog("Ingrese el nombre del proyecto a agregar");
                    int diasA= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de dias en su realizacion"));
                    String estadoA = "En progreso";
                    proyecto agregar = agregarProyecto(software, nombreA, diasA, estadoA);
                    if (agregar!= null) {
                        JOptionPane.showMessageDialog(null, "Se agrego el proyecto" + nombreA );
                    } else {
                        JOptionPane.showMessageDialog(null, "Proyecto no agregado" );
                    }
                    break;
                case "Actualizar Estado":
                    String nombreP = JOptionPane.showInputDialog("Ingrese el nombre del proyecto a cambiar estado");
                    proyecto actualizar = buscar(software, nombreP);
                    if (actualizar != null) {
                        if (actualizar.estado.equals("En progreso")) {
                            actualizar.estado = "Completada";
                            JOptionPane.showMessageDialog(null, "El proyecto " + nombreP + " se ha terminado");
                        } else {
                            JOptionPane.showMessageDialog(null, "El proyecto " + nombreP + " ya ha finalizado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El proyecto no esta");
                    }
                    break;
                case "Buscar":
                    String nombreB = JOptionPane.showInputDialog("Ingrese el nombre del proyecto a buscar");
                    proyecto buscar = buscar(software, nombreB);
                    if (buscar != null) {
                        JOptionPane.showMessageDialog(null, "Nombre del Proyecto: " + buscar.nombre + "\n" + "Dias de duracion: " + buscar.dias +"\n" + "Estado: " + buscar.estado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Proyecto no encontrado");
                    }
                    break;
                case "Ordenar":
                    Arrays.sort(software, new Comparator<proyecto>() {
                        public int compare(proyecto proyecto1, proyecto proyecto2) {
                            if (proyecto1 == null || proyecto2 == null) {                                
                                return 0; 
                            }
                            return Integer.compare(proyecto1.dias, proyecto2.dias);
                        }
                    });
                    JOptionPane.showMessageDialog(null, "Proyectos ordenados por dias.");
                    break;
                case "Salir":
                    JOptionPane.showMessageDialog(null, "Salieendo.....");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (!seleccion.equals("Salir"));
    }
    public static proyecto agregarProyecto(proyecto[] software, String nombre, int dias, String estado){
        for (proyecto agregar : software) {
            agregar.nombre = nombre;
            agregar.dias = dias;
            agregar.estado = estado;
            return agregar;
        }
        return null;
    }
    public static proyecto buscar(proyecto[] software, String nombre){
        for (proyecto buscar : software) {
            if (buscar != null && buscar.nombre.equals(nombre)) {
                return buscar;
            } 
        }
        return null;
    }
}
