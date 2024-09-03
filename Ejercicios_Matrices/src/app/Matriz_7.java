
package app;

import javax.swing.JOptionPane;

public class Matriz_7 {
    
    public static void main(String[] args) {
        int totalPacientes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de pacientes a analizar"));

        // Matriz para almacenar el área, edad y días de internación de los pacientes
        String[][] pacientes = new String[totalPacientes][3]; // 0: Área, 1: Edad, 2: Días de internación

        // Llenar la matriz con la información de los pacientes
        for (int i = 0; i < totalPacientes; i++) {
            String area = JOptionPane.showInputDialog("Ingrese el área del paciente " + (i + 1) + " (Cardiología, Neurología, Pediatría, Oncología, Traumatología)");
            String edad = JOptionPane.showInputDialog("Ingrese la edad del paciente " + (i + 1));
            String diasInternacion = JOptionPane.showInputDialog("Ingrese los días de internación del paciente " + (i + 1));

            pacientes[i][0] = area;
            pacientes[i][1] = edad;
            pacientes[i][2] = diasInternacion;
        }

        // Variables para los cálculos
        int totalEdadCardiologia = 0, totalPacientesCardiologia = 0;
        int totalEdadNeurologia = 0, totalPacientesNeurologia = 0;
        int totalEdadPediatria = 0, totalPacientesPediatria = 0;
        int totalEdadOncologia = 0, totalPacientesOncologia = 0;
        int totalEdadTraumatologia = 0, totalPacientesTraumatologia = 0;

        int edad18_25 = 0, edad26_35 = 0, edadMas35 = 0;
        int internacion1_5 = 0, internacion6_10 = 0, internacion11_15 = 0, internacion16_20 = 0, internacionMas20 = 0;

        // Calcular estadísticas
        for (int i = 0; i < totalPacientes; i++) {
            int edad = Integer.parseInt(pacientes[i][1]);
            int diasInternacion = Integer.parseInt(pacientes[i][2]);
            String area = pacientes[i][0];

            // Promedio de edad por área
            switch (area.toLowerCase()) {
                case "cardiología":
                    totalEdadCardiologia += edad;
                    totalPacientesCardiologia++;
                    break;
                case "neurología":
                    totalEdadNeurologia += edad;
                    totalPacientesNeurologia++;
                    break;
                case "pediatría":
                    totalEdadPediatria += edad;
                    totalPacientesPediatria++;
                    break;
                case "oncología":
                    totalEdadOncologia += edad;
                    totalPacientesOncologia++;
                    break;
                case "traumatología":
                    totalEdadTraumatologia += edad;
                    totalPacientesTraumatologia++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Área no válida.");
            }

            // Contar porcentaje de edades
            if (edad >= 18 && edad <= 25) {
                edad18_25++;
            } else if (edad >= 26 && edad <= 35) {
                edad26_35++;
            } else if (edad > 35) {
                edadMas35++;
            }

            // Contar rangos de días de internación
            if (diasInternacion >= 1 && diasInternacion <= 5) {
                internacion1_5++;
            } else if (diasInternacion >= 6 && diasInternacion <= 10) {
                internacion6_10++;
            } else if (diasInternacion >= 11 && diasInternacion <= 15) {
                internacion11_15++;
            } else if (diasInternacion >= 16 && diasInternacion <= 20) {
                internacion16_20++;
            } else if (diasInternacion > 20) {
                internacionMas20++;
            }
        }

        // Mostrar resultados
        double porcentajeEdad18_25 = (double) edad18_25 / totalPacientes * 100;
        double porcentajeEdad26_35 = (double) edad26_35 / totalPacientes * 100;
        double porcentajeEdadMas35 = (double) edadMas35 / totalPacientes * 100;

        JOptionPane.showMessageDialog(null,
                "Promedio de edad en Cardiología: " + (totalPacientesCardiologia > 0 ? (double) totalEdadCardiologia / totalPacientesCardiologia : 0) + "\n" +
                "Promedio de edad en Neurología: " + (totalPacientesNeurologia > 0 ? (double) totalEdadNeurologia / totalPacientesNeurologia : 0) + "\n" +
                "Promedio de edad en Pediatría: " + (totalPacientesPediatria > 0 ? (double) totalEdadPediatria / totalPacientesPediatria : 0) + "\n" +
                "Promedio de edad en Oncología: " + (totalPacientesOncologia > 0 ? (double) totalEdadOncologia / totalPacientesOncologia : 0) + "\n" +
                "Promedio de edad en Traumatología: " + (totalPacientesTraumatologia > 0 ? (double) totalEdadTraumatologia / totalPacientesTraumatologia : 0) + "\n\n" +
                "Porcentaje de pacientes con edades entre 18 y 25 años: " + porcentajeEdad18_25 + "%\n" +
                "Porcentaje de pacientes con edades entre 26 y 35 años: " + porcentajeEdad26_35 + "%\n" +
                "Porcentaje de pacientes con edades superiores a 35 años: " + porcentajeEdadMas35 + "%\n\n" +
                "Total de pacientes con internación entre 1 y 5 días: " + internacion1_5 + "\n" +
                "Total de pacientes con internación entre 6 y 10 días: " + internacion6_10 + "\n" +
                "Total de pacientes con internación entre 11 y 15 días: " + internacion11_15 + "\n" +
                "Total de pacientes con internación entre 16 y 20 días: " + internacion16_20 + "\n" +
                "Total de pacientes con internación superior a 20 días: " + internacionMas20
        );
    }
}
