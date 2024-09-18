
package app;

import javax.swing.JOptionPane;

class club{
    String nombre;
    int edad;
    String nivel;
    int cuota;
    
    public club(String nombre, int edad, String nivel, int cuota){
        this.nombre = nombre;
        this.edad = edad;
        this.nivel = nivel;
        this.cuota = cuota;   
    }
}

public class Array_10 {
    public static void main(String[] args) {
        club[] ajedrez = new club[100];
        ajedrez[0] = new club("Carlos", 25, "Medio", 50000);
        ajedrez[1] = new club("Nicolas", 16, "Alto", 60000);
        ajedrez[2] = new club("Yesica", 19, "Medio", 63000);
        ajedrez[3] = new club("Cristian", 23, "Bajo", 70000);

        
        String seleccion;
        do {                   
            String[] opciones = {"Lista", "Agregar", "Actualizar Habilidad", "Buscar", "Promedio de Edad", "Salir"};
            seleccion = (String) JOptionPane.showInputDialog(null,
                    "Seleccione la funcion de los mienbros del club de Ajedrez",
                    "Funciones",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);
            switch (seleccion) {
                case "Lista":
                    String ver = "";
                    for (club lista : ajedrez) {
                        if (lista != null) {
                            ver += ("Nombre: " + lista.nombre + "\n" + "Edad: " + lista.edad + "\n" + "Nivel de habilidad: " + lista.nivel + "\n\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, ver);
                    break;
                case "Agregar":
                    String nombreA = JOptionPane.showInputDialog("Ingrese su nombre");
                    int edadA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                    String nivelA = JOptionPane.showInputDialog("Ingresee su nivel de habilidad en ajedrez");
                    int cuotaA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cuota mensual"));
                    boolean nuevo = agregarMiembro(ajedrez, nombreA, edadA, nivelA, cuotaA);
                    if (nuevo) {
                        JOptionPane.showMessageDialog(null, nombreA + " es nuevo miembro del club");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puede unir al club");
                    }
                    break;
                case "Actualizar Habilidad":
                    String nombreActualizar = JOptionPane.showInputDialog("Ingrese su nombre");
                    club actualizar = buscar(ajedrez, nombreActualizar);
                    if (actualizar != null) {
                        String nuevoNivel = JOptionPane.showInputDialog("Ingrese su nuevo nivel de ajedrez");
                        actualizar.nivel = nuevoNivel;
                        JOptionPane.showMessageDialog(null, nombreActualizar + " se ha actualizado su nivel en el ajedrez");
                    } else {
                        JOptionPane.showMessageDialog(null, " No se ha actualizado su nivel en el ajedrez");
                    }
                    break;
                case "Buscar":
                    String nombreBuscar = JOptionPane.showInputDialog("Ingrese su nombre");
                    club busqueda = buscar(ajedrez, nombreBuscar);
                    if (busqueda != null) {
                        JOptionPane.showMessageDialog(null, "Nombre: " + busqueda.nombre + "\n" + "Edad: " + busqueda.edad + "\n" + "Nivel de habilidad: " + busqueda.nivel);
                    } else {
                        JOptionPane.showMessageDialog(null, " No se encuentra en el club de ajedrez");
                    }
                    break;
                case "Promedio de Edad":
                    int sumaEdad = 0;
                    int numMiembros = 0;
                    for (club sumar : ajedrez) {
                        if (sumar != null) {
                            sumaEdad += sumar.edad;
                            numMiembros++;
                        }
                    }
                    if (numMiembros > 0) {
                        double promedio = sumaEdad / numMiembros;
                        JOptionPane.showMessageDialog(null, "El promedio de esdad de los miembros es: " + promedio);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay miembros");
                    }
                    break;
                case "Salir":
                    JOptionPane.showMessageDialog(null, "Saliendo....");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "");
            }
            
        } while (!seleccion.equals("Salir"));
    }
    public static boolean agregarMiembro(club[] ajedrez, String nombre, int edad, String nivel, int cuota){
        for (int i = 0; i < ajedrez.length; i++) {
            if (ajedrez[i] == null) {
                ajedrez[i] = new club(nombre, edad, nivel, cuota);
                return true;
            }
        }
        return false;
    }
    public static club buscar(club[] ajedrez, String nombre){
        for (club buscar : ajedrez) {
            if (buscar != null && buscar.nombre.equals(nombre)) {
                return buscar;
            }
        }
        return null;
    }
}
