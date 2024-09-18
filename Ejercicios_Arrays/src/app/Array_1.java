
package app;

import java.util.Comparator;
import java.util.Arrays;
import javax.swing.JOptionPane;

class libro {
        String nombre;
        String autor;
        int cantidad;

    // Constructor
    public libro(String nombre, String autor, int cantidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.cantidad = cantidad;
    }
}
public class Array_1{
    public static void main(String[] args) {
               
        libro[] biblioteca = new libro[100];
        
        biblioteca[0] = new libro(" El Señor de los Anillos", "J.R.R. Tolkien", 6);
        biblioteca[1] = new libro("Harry Potter", "J.K. Rowling,", 4);
        biblioteca[2] = new libro("Hamlet", "William Shakespeare", 1);
        biblioteca[3] = new libro("Cien años de soledad", "Gabriel García Márquez", 2);
        
        String seleccion;
        do {  
        String[] opciones = {"Inventario", "Agregar Copias", "Prestar Libro", "Buscar Libro", "Ordenar", "Salir"};
        seleccion = (String) JOptionPane.showInputDialog(null,
                "Selecione la funcion de la Biblioteca",
                "Funciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
        if (seleccion != null) {
            switch (seleccion) {
                case "Inventario":
                    String inventarioFin = "";
                    for (libro inventario : biblioteca) {
                        if (inventario != null) {
                             inventarioFin += ("Nombre: " + inventario.nombre + "\n" + " Autor: " + inventario.autor +"\n"+ " Cantidad: " + inventario.cantidad + "\n\n");
                        }                  
                    }
                    JOptionPane.showMessageDialog(null, inventarioFin);
                    break;
                case "Agregar Copias":
                    String nombreLibro = JOptionPane.showInputDialog("Ingrese el nombre del libro:");
                    libro libroEncontrado = buscarLibro(biblioteca, nombreLibro);

                    if (libroEncontrado != null) {
                        int cantidadAAgregar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de copias a agregar:"));
                        libroEncontrado.cantidad += cantidadAAgregar;
                        JOptionPane.showMessageDialog(null, "Se agregaron " + cantidadAAgregar + " copias de " + nombreLibro);
                    } else {
                        JOptionPane.showMessageDialog(null, "El libro no se encontró en la biblioteca.");
                    }
                    break;
                case "Prestar Libro":
                    String nomLibro = JOptionPane.showInputDialog("Ingrese el nombre del libro a prestar:");
                    libro libroPrestar = buscarLibro(biblioteca, nomLibro);

                    if (libroPrestar != null) {
                        if (libroPrestar.cantidad > 0) {
                            libroPrestar.cantidad--;
                            JOptionPane.showMessageDialog(null, "Libro prestado exitosamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay copias disponibles de este libro.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El libro no se encuentra en la biblioteca.");
                    }
                    break;
                case "Buscar Libro":
                    String buscarNombre = JOptionPane.showInputDialog("Nombre del libro a Buscar");
                    libro libroBuscar = buscarLibro(biblioteca, buscarNombre);                   
                    if (libroBuscar !=  null) {
                        JOptionPane.showMessageDialog(null, "Libro " + libroBuscar.nombre + " encontrado, tiene " + libroBuscar.cantidad + " copias");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El Libro " + buscarNombre + " no se encuentra");
                    }
                    break;
                case "Ordenar":
                     Arrays.sort(biblioteca, new Comparator<libro>() {
                        public int compare(libro libro1, libro libro2) {
                            if (libro1 == null || libro2 == null) {                                
                                return 0; 
                            }
                            return libro1.nombre.compareToIgnoreCase(libro2.nombre);
                        }
                    });
                    JOptionPane.showMessageDialog(null, "Libros ordenados por nombre.");
                    break;
                case "Salir":
                    JOptionPane.showMessageDialog(null, "Salieendo.....");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }                       
        } else {
            JOptionPane.showMessageDialog(null, " Elija una opcion");
        }
        } while (!seleccion.equals("Salir"));
    }
    public static libro buscarLibro(libro[] biblioteca, String nombre) {
    for (libro nombreLibro : biblioteca) {
        if (nombreLibro != null && nombreLibro.nombre.equals(nombre)) {
            return nombreLibro;
        }
    }
    return null;
}

    private static void sort(libro[] biblioteca, Comparator<libro> comparator) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}





