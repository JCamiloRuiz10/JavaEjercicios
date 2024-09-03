
package app;

import javax.swing.JOptionPane;


public class Matriz_4 {
    public static void main(String[] args) {
        String[][] pedidos = new String[100][3]; // Matriz para almacenar nombre del cliente, número de mesa y lista de platos
        double[][] precios = new double[100][10]; // Matriz para almacenar los precios de cada plato en un pedido (máximo 10 platos por pedido)
        int numPedidos = 0;

        String[] opciones = {"Registrar Pedido", "Actualizar Pedido", "Eliminar Pedido", "Calcular Total", "Mostrar Detalles", "Salir"};
        String seleccion;

        do {
            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Gestión de Pedidos",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case "Registrar Pedido":
                    if (numPedidos < pedidos.length) {
                        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                        String numeroMesa = JOptionPane.showInputDialog("Ingrese el número de mesa");
                        String listaPlatos = JOptionPane.showInputDialog("Ingrese la lista de platos solicitados (separados por comas)");

                        pedidos[numPedidos][0] = nombreCliente;
                        pedidos[numPedidos][1] = numeroMesa;
                        pedidos[numPedidos][2] = listaPlatos;

                        for (int i = 0; i < listaPlatos.split(",").length; i++) {
                            precios[numPedidos][i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del plato " + (i + 1)));
                        }
                        numPedidos++;
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay espacio para más pedidos.");
                    }
                    break;

                case "Actualizar Pedido":
                    String numeroMesaActualizar = JOptionPane.showInputDialog("Ingrese el número de mesa del pedido a actualizar");
                    int indicePedido = buscarPedido(pedidos, numPedidos, numeroMesaActualizar);

                    if (indicePedido != -1) {
                        String listaPlatosActualizar = JOptionPane.showInputDialog("Ingrese la nueva lista de platos solicitados (separados por comas)");
                        pedidos[indicePedido][2] = listaPlatosActualizar;

                        for (int i = 0; i < listaPlatosActualizar.split(",").length; i++) {
                            precios[indicePedido][i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio del plato " + (i + 1)));
                        }
                        JOptionPane.showMessageDialog(null, "Pedido actualizado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró el pedido con el número de mesa proporcionado.");
                    }
                    break;

                case "Eliminar Pedido":
                    String numeroMesaEliminar = JOptionPane.showInputDialog("Ingrese el número de mesa del pedido a eliminar");
                    indicePedido = buscarPedido(pedidos, numPedidos, numeroMesaEliminar);

                    if (indicePedido != -1) {
                        for (int i = indicePedido; i < numPedidos - 1; i++) {
                            pedidos[i] = pedidos[i + 1];
                            precios[i] = precios[i + 1];
                        }
                        pedidos[numPedidos - 1] = new String[3];
                        precios[numPedidos - 1] = new double[10];
                        numPedidos--;
                        JOptionPane.showMessageDialog(null, "Pedido eliminado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró el pedido con el número de mesa proporcionado.");
                    }
                    break;

                case "Calcular Total":
                    String numeroMesaTotal = JOptionPane.showInputDialog("Ingrese el número de mesa del pedido a calcular");
                    indicePedido = buscarPedido(pedidos, numPedidos, numeroMesaTotal);

                    if (indicePedido != -1) {
                        double total = calcularTotal(precios[indicePedido]);
                        JOptionPane.showMessageDialog(null, "El total a pagar por el pedido es: $" + total);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró el pedido con el número de mesa proporcionado.");
                    }
                    break;

                case "Mostrar Detalles":
                    StringBuilder detallesPedidos = new StringBuilder();
                    for (int i = 0; i < numPedidos; i++) {
                        String nombreCliente = pedidos[i][0];
                        String numeroMesa = pedidos[i][1];
                        String listaPlatos = pedidos[i][2];
                        double total = calcularTotal(precios[i]);

                        detallesPedidos.append("Cliente: ").append(nombreCliente).append("\n")
                                .append("Mesa: ").append(numeroMesa).append("\n")
                                .append("Platos: ").append(listaPlatos).append("\n")
                                .append("Total a pagar: $").append(total).append("\n\n");
                    }
                    JOptionPane.showMessageDialog(null, detallesPedidos.toString());
                    break;

                case "Salir":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (!seleccion.equals("Salir"));
    }

    public static int buscarPedido(String[][] pedidos, int numPedidos, String numeroMesa) {
        for (int i = 0; i < numPedidos; i++) {
            if (pedidos[i][1].equals(numeroMesa)) {
                return i;
            }
        }
        return -1;
    }

    public static double calcularTotal(double[] precios) {
        double total = 0;
        for (double precio : precios) {
            total += precio;
        }
        return total;
    }
}
