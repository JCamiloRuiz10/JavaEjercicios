
package app;

import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;

class mesa{
    int numero;
    String disponible;
    int capacidad;  
    
    public mesa( int numero, String disponible, int capacidad){
        this.numero = numero;
        this.disponible = disponible;
        this.capacidad = capacidad;
    }
}
public class Array_3 {
    public static void main(String[] args) {
        mesa[] reserva = new mesa[30];
        
        reserva[0] = new mesa(1, "SI", 10);
        reserva[1] = new mesa(2, "SI", 10);
        reserva[2] = new mesa(3, "NO", 5);
        reserva[3] = new mesa(4, "NO", 15);
        reserva[4] = new mesa(5, "SI", 15);
        
        String seleccion;
        do {            
            String[] opciones = {"Ver Disponibilidad", "Realizar Reserva", "Cancelar Reserva", "Buscar", "Ordenar", "Salir"};
            seleccion = (String) JOptionPane.showInputDialog(null,
                "Selecione la accion en el Restaurante",
                "Acciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
            if (seleccion != null) {
                switch (seleccion) {
                    case "Ver Disponibilidad":
                        String ver = "";
                        for (mesa disponible : reserva) {
                            if (disponible != null) {
                                ver += ("Mesa: " + disponible.numero +"\n"+"Disponible: " + disponible.disponible +"\n"+ "Capacidad: "+ disponible.capacidad+"\n\n");
                            }
                        }
                        JOptionPane.showMessageDialog(null, ver);
                        break;
                    case "Realizar Reserva":
                            int reservar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Mesa a Reservar"));
                            mesa buscarMesa = buscarMesa(reserva, reservar);
                            if (buscarMesa!=null) {
                                if (buscarMesa.disponible.equals("SI")) {
                                    buscarMesa.disponible = "NO";
                                    JOptionPane.showMessageDialog(null, "La mesa " + reservar + "ha sido reservada con exito");
                                } else {
                                    JOptionPane.showMessageDialog(null, "La mesa " + reservar + "No esta disponible");
                                }
                        } else {
                             JOptionPane.showMessageDialog(null, "La mesa no lo tenemos");   
                        }
                        break;
                    case "Cancelar Reserva":
                        int cancelar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Mesa a Cancelar"));
                            mesa cancelarMesa = buscarMesa(reserva, cancelar);
                            if (cancelarMesa!=null) {
                                if (cancelarMesa.disponible.equals("NO")) {
                                    cancelarMesa.disponible = "SI";
                                    JOptionPane.showMessageDialog(null, "La mesa " + cancelar + "ha sido Cancelada con exito");
                                } else {
                                    JOptionPane.showMessageDialog(null, "La mesa " + cancelar + "No esta reservada");
                                }
                        } else {
                             JOptionPane.showMessageDialog(null, "La mesa no lo tenemos");   
                        }
                        break;
                    case "Buscar":
                         int busqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Mesa a Buscar"));
                         mesa buscaMesa = buscarMesa(reserva, busqueda);
                         if (buscaMesa != null) {
                            JOptionPane.showMessageDialog(null, "Mesa: " + buscaMesa.numero +"\n"+"Disponible: " + buscaMesa.disponible +"\n"+"Capacidad: "+ buscaMesa.capacidad);
                        } else {
                        }
                        break;
                    case "Ordenar":
                        Arrays.sort(reserva, new Comparator<mesa>(){
                            public int compare(mesa mesa1, mesa mesa2){
                                if (mesa1 == null || mesa2 == null) {
                                    return 0;
                                }
                                return Integer.compare(mesa1.capacidad, mesa2.capacidad);
                            }
                        });
                        JOptionPane.showMessageDialog(null, "Mesas Organizadas por Capacidad");
                        break; 
                    case "Salir":
                        JOptionPane.showMessageDialog(null, "Salieendo.....");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
            } else {
            }
        } while (!seleccion.equals("Salir"));       
    }
    public static mesa buscarMesa(mesa[] reserva, int numero){
        for (mesa buscar : reserva) {
            if (buscar!= null && buscar.numero == numero) {
                return buscar;
            }
        }
        return null;
    }
}
