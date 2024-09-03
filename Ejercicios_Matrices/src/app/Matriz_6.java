
package app;

import javax.swing.JOptionPane;

public class Matriz_6 {
    public static void main(String[] args) {
        int totalClientes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de clientes a analizar"));

        // Matriz para almacenar la categoría, edad y meses de membresía de los clientes
        String[][] clientes = new String[totalClientes][3]; // 0: Categoría, 1: Edad, 2: Meses de membresía

        // Llenar la matriz con la información de los clientes
        for (int i = 0; i < totalClientes; i++) {
            String categoria = JOptionPane.showInputDialog("Ingrese la categoría del cliente " + (i + 1) + " (Pesas, Cardio, Yoga, Natación, Boxeo)");
            String edad = JOptionPane.showInputDialog("Ingrese la edad del cliente " + (i + 1));
            String mesesMembresia = JOptionPane.showInputDialog("Ingrese los meses de membresía del cliente " + (i + 1));

            clientes[i][0] = categoria;
            clientes[i][1] = edad;
            clientes[i][2] = mesesMembresia;
        }

        // Variables para los cálculos
        int totalEdadPesas = 0, totalClientesPesas = 0;
        int totalEdadCardio = 0, totalClientesCardio = 0;
        int totalEdadYoga = 0, totalClientesYoga = 0;
        int totalEdadNatacion = 0, totalClientesNatacion = 0;
        int totalEdadBoxeo = 0, totalClientesBoxeo = 0;

        int edad18_25 = 0, edad26_35 = 0, edadMas35 = 0;
        int membresia1_5 = 0, membresia6_10 = 0, membresia11_15 = 0, membresia16_20 = 0, membresiaMas20 = 0;

        // Calcular estadísticas
        for (int i = 0; i < totalClientes; i++) {
            int edad = Integer.parseInt(clientes[i][1]);
            int mesesMembresia = Integer.parseInt(clientes[i][2]);
            String categoria = clientes[i][0];

            // Promedio de edad por categoría
            switch (categoria.toLowerCase()) {
                case "pesas":
                    totalEdadPesas += edad;
                    totalClientesPesas++;
                    break;
                case "cardio":
                    totalEdadCardio += edad;
                    totalClientesCardio++;
                    break;
                case "yoga":
                    totalEdadYoga += edad;
                    totalClientesYoga++;
                    break;
                case "natación":
                    totalEdadNatacion += edad;
                    totalClientesNatacion++;
                    break;
                case "boxeo":
                    totalEdadBoxeo += edad;
                    totalClientesBoxeo++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Categoría no válida.");
            }

            // Contar porcentaje de edades
            if (edad >= 18 && edad <= 25) {
                edad18_25++;
            } else if (edad >= 26 && edad <= 35) {
                edad26_35++;
            } else if (edad > 35) {
                edadMas35++;
            }

            // Contar rangos de meses de membresía
            if (mesesMembresia >= 1 && mesesMembresia <= 5) {
                membresia1_5++;
            } else if (mesesMembresia >= 6 && mesesMembresia <= 10) {
                membresia6_10++;
            } else if (mesesMembresia >= 11 && mesesMembresia <= 15) {
                membresia11_15++;
            } else if (mesesMembresia >= 16 && mesesMembresia <= 20) {
                membresia16_20++;
            } else if (mesesMembresia > 20) {
                membresiaMas20++;
            }
        }

        // Mostrar resultados
        double porcentajeEdad18_25 = (double) edad18_25 / totalClientes * 100;
        double porcentajeEdad26_35 = (double) edad26_35 / totalClientes * 100;
        double porcentajeEdadMas35 = (double) edadMas35 / totalClientes * 100;

        JOptionPane.showMessageDialog(null,
                "Promedio de edad en Pesas: " + (totalClientesPesas > 0 ? (double) totalEdadPesas / totalClientesPesas : 0) + "\n" +
                "Promedio de edad en Cardio: " + (totalClientesCardio > 0 ? (double) totalEdadCardio / totalClientesCardio : 0) + "\n" +
                "Promedio de edad en Yoga: " + (totalClientesYoga > 0 ? (double) totalEdadYoga / totalClientesYoga : 0) + "\n" +
                "Promedio de edad en Natación: " + (totalClientesNatacion > 0 ? (double) totalEdadNatacion / totalClientesNatacion : 0) + "\n" +
                "Promedio de edad en Boxeo: " + (totalClientesBoxeo > 0 ? (double) totalEdadBoxeo / totalClientesBoxeo : 0) + "\n\n" +
                "Porcentaje de clientes con edades entre 18 y 25 años: " + porcentajeEdad18_25 + "%\n" +
                "Porcentaje de clientes con edades entre 26 y 35 años: " + porcentajeEdad26_35 + "%\n" +
                "Porcentaje de clientes con edades superiores a 35 años: " + porcentajeEdadMas35 + "%\n\n" +
                "Total de clientes con membresía entre 1 y 5 meses: " + membresia1_5 + "\n" +
                "Total de clientes con membresía entre 6 y 10 meses: " + membresia6_10 + "\n" +
                "Total de clientes con membresía entre 11 y 15 meses: " + membresia11_15 + "\n" +
                "Total de clientes con membresía entre 16 y 20 meses: " + membresia16_20 + "\n" +
                "Total de clientes con membresía superior a 20 meses: " + membresiaMas20
        );
    }
}
