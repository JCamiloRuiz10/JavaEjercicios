
package app;

import javax.swing.JOptionPane;

public class Matriz_2 {
    public static void main(String[] args) {
        String[][] reserva = new String[100][6]; //Matriz para almacenar nombre, apellido, cédula, habitación, entrada, salidapermite 100 resrvas
        int numReservas = 0;
        
        String[] opciones = {"Reservar","Cancelar Reserva","Costo Total","Mostrar Reservas","Salir"};
        String seleccion;
        
        do {            
            seleccion = (String)JOptionPane.showInputDialog(null, "Seleccione una opcion", "Gestion de Reservas",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            switch (seleccion) {
                case "Reservar":
                    if (numReservas < reserva.length) {
                        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
                        String cedula = JOptionPane.showInputDialog("Ingrese su cedula");
                        String numHabitacion = JOptionPane.showInputDialog("Ingrese el numero de Habitacion Asignado");
                        String fechaEntrada = JOptionPane.showInputDialog("Ingrese la fecha de entrada (dd/MM/yyyy)");
                        String fechaSalida = JOptionPane.showInputDialog("Ingrese la fecha de salida (dd/MM/yyyy)");
                        
                        reserva[numReservas][0] = nombre;
                        reserva[numReservas][1] = apellido;
                        reserva[numReservas][2] = cedula;
                        reserva[numReservas][3] = numHabitacion;
                        reserva[numReservas][4] = fechaEntrada;
                        reserva[numReservas][5] = fechaSalida;                       
                        numReservas++;
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay reservas Disponibles");
                    }
                    break;
                case "Cancelar Reserva":
                    
                    break;
                case "Costo Total":
                    
                    break;
                case "Mostrar Reservas":
                    
                    break;
                case "Salir":
                    
                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }
}

















































//        String[][] reservas = new String[100][6]; // Matriz para almacenar nombre, apellido, cédula, habitación, fecha entrada, fecha salida
//        double precioPorNoche = 100; // Precio fijo por noche (puede cambiarse según la necesidad)
//        int numReservas = 0;
//
//        String[] opciones = {"Registrar Reserva", "Cancelar Reserva", "Calcular Costo de Estancia", "Mostrar Reservas", "Salir"};
//        String seleccion;
//
//        do {
//            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Gestión de Reservas del Hotel",
//                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//            switch (seleccion) {
//                case "Registrar Reserva":
//                    if (numReservas < reservas.length) {
//                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del huésped");
//                        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del huésped");
//                        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del huésped");
//                        String habitacion = JOptionPane.showInputDialog("Ingrese el número de habitación");
//                        String fechaEntrada = JOptionPane.showInputDialog("Ingrese la fecha de entrada (dd/MM/yyyy)");
//                        String fechaSalida = JOptionPane.showInputDialog("Ingrese la fecha de salida (dd/MM/yyyy)");
//
//                        reservas[numReservas][0] = nombre;
//                        reservas[numReservas][1] = apellido;
//                        reservas[numReservas][2] = cedula;
//                        reservas[numReservas][3] = habitacion;
//                        reservas[numReservas][4] = fechaEntrada;
//                        reservas[numReservas][5] = fechaSalida;
//                        numReservas++;
//                    } else {
//                        JOptionPane.showMessageDialog(null, "No hay espacio para más reservas.");
//                    }
//                    break;
//
//                case "Cancelar Reserva":
//                    String cedulaCancelar = JOptionPane.showInputDialog("Ingrese la cédula del huésped para cancelar la reserva");
//                    boolean cancelada = false;
//                    for (int i = 0; i < numReservas; i++) {
//                        if (reservas[i][2].equals(cedulaCancelar)) {
//                            for (int j = i; j < numReservas - 1; j++) {
//                                reservas[j] = reservas[j + 1];
//                            }
//                            reservas[numReservas - 1] = new String[6]; // Eliminar última reserva
//                            numReservas--;
//                            cancelada = true;
//                            JOptionPane.showMessageDialog(null, "Reserva cancelada exitosamente.");
//                            break;
//                        }
//                    }
//                    if (!cancelada) {
//                        JOptionPane.showMessageDialog(null, "No se encontró la reserva con la cédula proporcionada.");
//                    }
//                    break;
//
//                case "Calcular Costo de Estancia":
//                    String cedulaCosto = JOptionPane.showInputDialog("Ingrese la cédula del huésped para calcular el costo de la estancia");
//                    boolean encontrado = false;
//                    for (int i = 0; i < numReservas; i++) {
//                        if (reservas[i][2].equals(cedulaCosto)) {
//                            String fechaEntradaStr = reservas[i][4];
//                            String fechaSalidaStr = reservas[i][5];
//                            long noches = calcularNoches(fechaEntradaStr, fechaSalidaStr);
//                            double costoTotal = noches * precioPorNoche;
//                            JOptionPane.showMessageDialog(null, "El costo total de la estancia es: $" + costoTotal);
//                            encontrado = true;
//                            break;
//                        }
//                    }
//                    if (!encontrado) {
//                        JOptionPane.showMessageDialog(null, "No se encontró la reserva con la cédula proporcionada.");
//                    }
//                    break;
//
//                case "Mostrar Reservas":
//                    StringBuilder detallesReservas = new StringBuilder();
//                    for (int i = 0; i < numReservas; i++) {
//                        String nombre = reservas[i][0];
//                        String apellido = reservas[i][1];
//                        String cedula = reservas[i][2];
//                        String habitacion = reservas[i][3];
//                        String fechaEntrada = reservas[i][4];
//                        String fechaSalida = reservas[i][5];
//                        long noches = calcularNoches(fechaEntrada, fechaSalida);
//                        double costoTotal = noches * precioPorNoche;
//
//                        detallesReservas.append("Nombre: ").append(nombre).append(" ").append(apellido).append("\n")
//                                .append("Cédula: ").append(cedula).append("\n")
//                                .append("Habitación: ").append(habitacion).append("\n")
//                                .append("Fecha de Entrada: ").append(fechaEntrada).append("\n")
//                                .append("Fecha de Salida: ").append(fechaSalida).append("\n")
//                                .append("Costo Total: $").append(costoTotal).append("\n\n");
//                    }
//                    JOptionPane.showMessageDialog(null, detallesReservas.toString());
//                    break;
//
//                case "Salir":
//                    JOptionPane.showMessageDialog(null, "Saliendo...");
//                    break;
//
//                default:
//                    JOptionPane.showMessageDialog(null, "Opción no válida.");
//            }
//        } while (!seleccion.equals("Salir"));
//    }
//
//    public static long calcularNoches(String fechaEntradaStr, String fechaSalidaStr) {
//        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//        try {
//            Date fechaEntrada = formato.parse(fechaEntradaStr);
//            Date fechaSalida = formato.parse(fechaSalidaStr);
//            long diferencia = fechaSalida.getTime() - fechaEntrada.getTime();
//            return diferencia / (1000 * 60 * 60 * 24); // Convertir milisegundos a días
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error en el formato de la fecha.");
//            return 0;
//        }