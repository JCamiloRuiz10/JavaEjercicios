
package app;

import javax.swing.JOptionPane;

public class Matriz_3 {
    public static void main(String[] args) {
        String[][] estudiantes = new String[100][4]; // Matriz para almacenar nombre, apellido, identificación, curso
        double[][] notas = new double[100][5]; // Matriz para almacenar las notas de 5 asignaturas para cada estudiante
        int numEstudiantes = 0;

        String[] opciones = {"Agregar Estudiante", "Ingresar Notas", "Calcular Promedio", "Mostrar Detalles", "Salir"};
        String seleccion;

        do {
            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Gestión de Notas",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case "Agregar Estudiante":
                    if (numEstudiantes < estudiantes.length) {
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
                        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante");
                        String identificacion = JOptionPane.showInputDialog("Ingrese el número de identificación del estudiante");
                        String curso = JOptionPane.showInputDialog("Ingrese el curso del estudiante");

                        estudiantes[numEstudiantes][0] = nombre;
                        estudiantes[numEstudiantes][1] = apellido;
                        estudiantes[numEstudiantes][2] = identificacion;
                        estudiantes[numEstudiantes][3] = curso;
                        numEstudiantes++;
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay espacio para más estudiantes.");
                    }
                    break;

                case "Ingresar Notas":
                    String identificacionNotas = JOptionPane.showInputDialog("Ingrese el número de identificación del estudiante");
                    int indiceEstudiante = buscarEstudiante(estudiantes, numEstudiantes, identificacionNotas);

                    if (indiceEstudiante != -1) {
                        for (int i = 0; i < 5; i++) {
                            notas[indiceEstudiante][i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de la asignatura " + (i + 1)));
                        }
                        JOptionPane.showMessageDialog(null, "Notas ingresadas correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró el estudiante con la identificación proporcionada.");
                    }
                    break;

                case "Calcular Promedio":
                    String identificacionPromedio = JOptionPane.showInputDialog("Ingrese el número de identificación del estudiante");
                    indiceEstudiante = buscarEstudiante(estudiantes, numEstudiantes, identificacionPromedio);

                    if (indiceEstudiante != -1) {
                        double promedio = calcularPromedio(notas[indiceEstudiante]);
                        JOptionPane.showMessageDialog(null, "El promedio de notas del estudiante es: " + promedio);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró el estudiante con la identificación proporcionada.");
                    }
                    break;

                case "Mostrar Detalles":
                    StringBuilder detallesEstudiantes = new StringBuilder();
                    for (int i = 0; i < numEstudiantes; i++) {
                        String nombre = estudiantes[i][0];
                        String apellido = estudiantes[i][1];
                        String identificacion = estudiantes[i][2];
                        String curso = estudiantes[i][3];
                        double promedio = calcularPromedio(notas[i]);

                        detallesEstudiantes.append("Nombre: ").append(nombre).append(" ").append(apellido).append("\n")
                                .append("Identificación: ").append(identificacion).append("\n")
                                .append("Curso: ").append(curso).append("\n")
                                .append("Notas: ");

                        for (int j = 0; j < 5; j++) {
                            detallesEstudiantes.append(notas[i][j]).append(" ");
                        }

                        detallesEstudiantes.append("\nPromedio: ").append(promedio).append("\n\n");
                    }
                    JOptionPane.showMessageDialog(null, detallesEstudiantes.toString());
                    break;

                case "Salir":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (!seleccion.equals("Salir"));
    }

    public static int buscarEstudiante(String[][] estudiantes, int numEstudiantes, String identificacion) {
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i][2].equals(identificacion)) {
                return i;
            }
        }
        return -1;
    }

    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}
