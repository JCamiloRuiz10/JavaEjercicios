
package app;

import javax.swing.JOptionPane;

public class Matriz_1 {
    public static void main(String[] args) {
        String[][] libros = new String[100][5]; // Arreglo para almacenar título, autor, ISBN, precio, cantidad
        int numLibros = 0;

        String[] opciones = {"Agregar Libro", "Eliminar Libro", "Calcular Valor Total", "Mostrar Inventario", "Salir"};
        String seleccion;

        do {
            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Inventario de Librería",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case "Agregar Libro":
                    if (numLibros < libros.length) {
                        String titulo = JOptionPane.showInputDialog("Ingrese el título del libro");
                        String autor = JOptionPane.showInputDialog("Ingrese el autor del libro");
                        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro");
                        String precio = JOptionPane.showInputDialog("Ingrese el precio del libro");
                        String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad en stock del libro");

                        libros[numLibros][0] = titulo;
                        libros[numLibros][1] = autor;
                        libros[numLibros][2] = isbn;
                        libros[numLibros][3] = precio;
                        libros[numLibros][4] = cantidad;
                        numLibros++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Inventario lleno, no se puede agregar más libros");
                    }
                    break;

                case "Eliminar Libro":
                    String isbnEliminar = JOptionPane.showInputDialog("Ingrese el ISBN del libro a eliminar");
                    boolean eliminado = false;
                    for (int i = 0; i < numLibros; i++) {
                        if (libros[i][2].equals(isbnEliminar)) {
                            for (int j = i; j < numLibros - 1; j++) {
                                libros[j] = libros[j + 1];
                            }
                            libros[numLibros - 1] = new String[5]; // Eliminar último libro
                            numLibros--;
                            eliminado = true;
                            JOptionPane.showMessageDialog(null, "Libro eliminado exitosamente");
                            break;
                        }
                    }
                    if (!eliminado) {
                        JOptionPane.showMessageDialog(null, "No se encontró el libro con el ISBN proporcionado");
                    }
                    break;

                case "Calcular Valor Total":
                    double valorTotal = 0;
                    for (int i = 0; i < numLibros; i++) {
                        double precio = Double.parseDouble(libros[i][3]);
                        int cantidad = Integer.parseInt(libros[i][4]);
                        valorTotal += precio * cantidad;
                    }
                    JOptionPane.showMessageDialog(null, "El valor total del inventario es: $" + valorTotal);
                    break;

                case "Mostrar Inventario":
                    StringBuilder inventario = new StringBuilder();
                    for (int i = 0; i < numLibros; i++) {
                        String titulo = libros[i][0];
                        String autor = libros[i][1];
                        String isbn = libros[i][2];
                        double precio = Double.parseDouble(libros[i][3]);
                        int cantidad = Integer.parseInt(libros[i][4]);
                        double valorTotalLibro = precio * cantidad;

                        inventario.append("Título: ").append(titulo).append("\n")
                                .append("Autor: ").append(autor).append("\n")
                                .append("ISBN: ").append(isbn).append("\n")
                                .append("Precio: $").append(precio).append("\n")
                                .append("Cantidad en stock: ").append(cantidad).append("\n")
                                .append("Valor total: $").append(valorTotalLibro).append("\n\n");
                    }
                    JOptionPane.showMessageDialog(null, inventario.toString());
                    break;

                case "Salir":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (!seleccion.equals("Salir"));
    }
}
