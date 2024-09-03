
package app;

import javax.swing.JOptionPane;

public class Matriz_5 {
     public static void main(String[] args) {
        int totalEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de estudiantes a encuestar"));
        
        // Matriz para almacenar las edades y promedios de los estudiantes junto con sus facultades
        String[][] estudiantes = new String[totalEstudiantes][3]; // 0: Facultad, 1: Edad, 2: Promedio

        // Llenar la matriz con la información de los estudiantes
        for (int i = 0; i < totalEstudiantes; i++) {
            String facultad = JOptionPane.showInputDialog("Ingrese la facultad del estudiante " + (i + 1) + " (Ingeniería, Medicina, Derecho, Ciencias Sociales, Administración)");
            String edad = JOptionPane.showInputDialog("Ingrese la edad del estudiante " + (i + 1));
            String promedio = JOptionPane.showInputDialog("Ingrese el promedio del estudiante " + (i + 1));

            estudiantes[i][0] = facultad;
            estudiantes[i][1] = edad;
            estudiantes[i][2] = promedio;
        }

        // Variables para los cálculos
        int totalEdadIngenieria = 0, totalEstudiantesIngenieria = 0;
        int totalEdadMedicina = 0, totalEstudiantesMedicina = 0;
        int totalEdadDerecho = 0, totalEstudiantesDerecho = 0;
        int totalEdadCienciasSociales = 0, totalEstudiantesCienciasSociales = 0;
        int totalEdadAdministracion = 0, totalEstudiantesAdministracion = 0;

        int edad18_25 = 0, edad26_35 = 0, edadMas35 = 0;
        int promedio1_2 = 0, promedio2_3 = 0, promedio3_4 = 0, promedio4_5 = 0, promedioMas5 = 0;

        // Calcular estadísticas
        for (int i = 0; i < totalEstudiantes; i++) {
            int edad = Integer.parseInt(estudiantes[i][1]);
            double promedio = Double.parseDouble(estudiantes[i][2]);
            String facultad = estudiantes[i][0];

            // Promedio de edad por facultad
            switch (facultad.toLowerCase()) {
                case "ingeniería":
                    totalEdadIngenieria += edad;
                    totalEstudiantesIngenieria++;
                    break;
                case "medicina":
                    totalEdadMedicina += edad;
                    totalEstudiantesMedicina++;
                    break;
                case "derecho":
                    totalEdadDerecho += edad;
                    totalEstudiantesDerecho++;
                    break;
                case "ciencias sociales":
                    totalEdadCienciasSociales += edad;
                    totalEstudiantesCienciasSociales++;
                    break;
                case "administración":
                    totalEdadAdministracion += edad;
                    totalEstudiantesAdministracion++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Facultad no válida.");
            }

            // Contar porcentaje de edades
            if (edad >= 18 && edad <= 25) {
                edad18_25++;
            } else if (edad >= 26 && edad <= 35) {
                edad26_35++;
            } else if (edad > 35) {
                edadMas35++;
            }

            // Contar rangos de promedios
            if (promedio >= 1.0 && promedio <= 2.0) {
                promedio1_2++;
            } else if (promedio > 2.0 && promedio <= 3.0) {
                promedio2_3++;
            } else if (promedio > 3.0 && promedio <= 4.0) {
                promedio3_4++;
            } else if (promedio > 4.0 && promedio <= 5.0) {
                promedio4_5++;
            } else if (promedio > 5.0) {
                promedioMas5++;
            }
        }

        // Mostrar resultados
        double porcentajeEdad18_25 = (double) edad18_25 / totalEstudiantes * 100;
        double porcentajeEdad26_35 = (double) edad26_35 / totalEstudiantes * 100;
        double porcentajeEdadMas35 = (double) edadMas35 / totalEstudiantes * 100;

        JOptionPane.showMessageDialog(null,
                "Promedio de edad en Ingeniería: " + (totalEstudiantesIngenieria > 0 ? (double) totalEdadIngenieria / totalEstudiantesIngenieria : 0) + "\n" +
                "Promedio de edad en Medicina: " + (totalEstudiantesMedicina > 0 ? (double) totalEdadMedicina / totalEstudiantesMedicina : 0) + "\n" +
                "Promedio de edad en Derecho: " + (totalEstudiantesDerecho > 0 ? (double) totalEdadDerecho / totalEstudiantesDerecho : 0) + "\n" +
                "Promedio de edad en Ciencias Sociales: " + (totalEstudiantesCienciasSociales > 0 ? (double) totalEdadCienciasSociales / totalEstudiantesCienciasSociales : 0) + "\n" +
                "Promedio de edad en Administración: " + (totalEstudiantesAdministracion > 0 ? (double) totalEdadAdministracion / totalEstudiantesAdministracion : 0) + "\n\n" +
                "Porcentaje de estudiantes con edades entre 18 y 25 años: " + porcentajeEdad18_25 + "%\n" +
                "Porcentaje de estudiantes con edades entre 26 y 35 años: " + porcentajeEdad26_35 + "%\n" +
                "Porcentaje de estudiantes con edades superiores a 35 años: " + porcentajeEdadMas35 + "%\n\n" +
                "Total de estudiantes con promedio entre 1.0 y 2.0: " + promedio1_2 + "\n" +
                "Total de estudiantes con promedio entre 2.1 y 3.0: " + promedio2_3 + "\n" +
                "Total de estudiantes con promedio entre 3.1 y 4.0: " + promedio3_4 + "\n" +
                "Total de estudiantes con promedio entre 4.1 y 5.0: " + promedio4_5 + "\n" +
                "Total de estudiantes con promedio superior a 5.0: " + promedioMas5
        );
    }
}
