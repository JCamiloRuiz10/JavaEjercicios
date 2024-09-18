
package app;

import static app.Array_7.agregarReserva;
import static app.Array_7.buscar;
import javax.swing.JOptionPane;

class reserva{
    String nombre;
    String pelicula;
    int numEntradas;
    int precio;
    public reserva(String nombre, String pelicula, int numEntradas, int precio){
        this.nombre = nombre;
        this.pelicula = pelicula;
        this.numEntradas = numEntradas;
        this.precio = precio;
    }
}
public class Array_7 {
    public static void main(String[] args) {
        reserva[] cine = new reserva[200];
        cine[0] = new reserva("Camilo", "Deadpool", 2, 50000);
        cine[1] = new reserva("Amilcar", "Pepa pig", 3, 200000);
        cine[2] = new reserva("Paula", "Intensamente", 5, 250000);
        cine[3] = new reserva("Johan", "Mi villano favorito", 2, 80000);
        
        String seleccion;
        do {            
            String[] opciones = {"Mostrar", "Agregar","Actualizar Numero de Entradas", "Buscar", "Ingreso Total", "Salir"};
            seleccion = (String) JOptionPane.showInputDialog(null,
                "Selecione la funcion de las reserva del Cine",
                "Funciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
            switch (seleccion) {
                case "Mostrar":
                    String ver = "";
                    for (reserva mostrar : cine) {
                        if (mostrar != null) {
                            ver += ("Nombre Reservante: " + mostrar.nombre + "\n" + "Pelicula: " + mostrar.pelicula +"\n" + "Numero de Entradas: " + mostrar.numEntradas + "\n" + "Precio Total: "+ mostrar.precio+ "\n\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, ver);
                    break;
                case "Agregar":
                    String nombreReserva= JOptionPane.showInputDialog("Ingrese su Nombre");               
                    String peli = JOptionPane.showInputDialog("Ingrese la pelicula a ver");
                    int entradas= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de entradas"));
                    int precio= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de las entradas"));
                    boolean agregar = agregarReserva(cine, nombreReserva, peli, entradas, precio);
                    if (agregar) {
                        JOptionPane.showMessageDialog(null, nombreReserva + " su reserva en el cine fue realizada");
                    } else {
                        JOptionPane.showMessageDialog(null, "Reserva no realizada" );
                    }
                    break;
                case "Actualizar Numero de Entradas":
                    String nombreReservador = JOptionPane.showInputDialog("Ingrese nombre del miembro que realizo la reserva");
                    reserva actualizar = buscar(cine, nombreReservador);
                    if (actualizar != null) {    
                        int nuevaEntradas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de entradas nuevo"));
                        if (actualizar.numEntradas > 0) {
                            actualizar.numEntradas =  nuevaEntradas;       
                            JOptionPane.showMessageDialog(null, nombreReservador + " se ha actualizado su numero de entradas a " + nuevaEntradas );
                        } else {
                            JOptionPane.showMessageDialog(null,  nombreReservador + " no se logro cambiar su numero de entradas");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La reserva no esta a su nombre");
                    }
                    break;
                case "Buscar":
                    String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre de quie realizo la reserva");
                    reserva busqueda = buscar(cine, nombreCliente);
                    if (busqueda != null) {
                        JOptionPane.showMessageDialog(null, "Nombre del cliente: " + busqueda.nombre + "\n" + "Pelicula: " + busqueda.pelicula +"\n" + "numero de Entradas: " + busqueda.numEntradas + "\n" + "Precio Total: "+ busqueda.precio);
                    } else {
                        JOptionPane.showMessageDialog(null, "Miembro sinreserva");
                    }
                    break;
                case "Ingreso Total":
                    int sumaPrecio = 0;
                    int numMiembros = 0;
                    for (reserva total : cine) {
                        if (total != null) {
                            sumaPrecio += total.precio;
                            numMiembros++;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "El ingreso total generado de las resservas es: " + sumaPrecio);                   
                    break;
                case "Salir":
                    JOptionPane.showMessageDialog(null, "Salieendo.....");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (!seleccion.equals("Salir"));
    }
    public static boolean agregarReserva(reserva[] cine, String nombre,String pelicula, int numEntradas, int precio){
        for (int i = 0; i < cine.length; i++) {
            if (cine[i] == null) {
                cine[i] = new reserva(nombre, pelicula, numEntradas, precio);
                return true;
            }
        }
        return false;
    }
    public static reserva buscar(reserva[] cine, String nombre){
        for (reserva buscar : cine) {
            if (buscar != null && buscar.nombre.equals(nombre)) {
                return buscar;
            } 
        }
        return null;
    }
}
