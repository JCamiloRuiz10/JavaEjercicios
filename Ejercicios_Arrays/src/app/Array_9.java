
package app;

import javax.swing.JOptionPane;

class club{
   String nombre;
   String nivel;
   int cuota;
   
   public club(String nombre, String nivel, int cuota){
    this.nombre = nombre;
    this.nivel = nivel;
    this.cuota = cuota;
   }
}

public class Array_9 {
    public static void main(String[] args) {
        club[] natacion = new club[100];
        natacion[0] = new club("Pedro", "Medio", 110000);
        natacion[1] = new club("Luis", "Alto", 10000);
        natacion[2] = new club("Sonia", "Bajo", 140000);
        natacion[3] = new club("Sofia", "Medio", 80000);
        
        String seleccion;
        do {
            String[] opciones = {"Mostrar","Agregar","Actualizar Nivel","Buscar","Ingreso Total", "Salir"};
            seleccion =  (String) JOptionPane.showInputDialog(null, 
                    "Seleccione la funcion del club de Natacion",
                    "Funciones",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);
            switch (seleccion) {
                case "Mostrar":
                    String ver = "";
                    for (club inscripciones : natacion) {
                        if (inscripciones != null) {
                            ver += ("Nombre: " + inscripciones.nombre + "\n" + "Nivel de Natacion: " + inscripciones.nivel + "\n" + "Cuota mensual: " + inscripciones.cuota + "\n\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, ver);
                    break;
                case "Agregar":
                    String nombreA = JOptionPane.showInputDialog("Ingrese su nombre");
                    String nivelA = JOptionPane.showInputDialog("Ingrese su nivel de natacion");
                    int cuotaA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuota mensual en el club"));
                    boolean nuevoMiembro = agregarMiembro(natacion, nombreA, nivelA, cuotaA);
                    if (nuevoMiembro) {
                        JOptionPane.showMessageDialog(null, nombreA + "es nuevo miembro del club");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo vicular al club");
                    }
                    break;
                case "Actualizar Nivel":
                    String nombreB = JOptionPane.showInputDialog("Ingrese su nombre");
                    club busqueda = buscar(natacion, nombreB);
                    if (busqueda != null) {
                        String nuevoNivel = JOptionPane.showInputDialog("Ingrese su nuevo nivel de natacion");
                        busqueda.nivel = nuevoNivel;
                        JOptionPane.showMessageDialog(null, "Su nivel de natacion se ha actualizado");
                    } else {
                        JOptionPane.showMessageDialog(null, "No es miembro del club");
                    }
                    break;
                case "Buscar":
                    String nombreBuscar = JOptionPane.showInputDialog("Ingrese su nombre");
                    club mirar = buscar(natacion, nombreBuscar);
                    if (mirar != null) {
                        JOptionPane.showMessageDialog(null, "Nombre: " + mirar.nombre + "\n" + "Nivel de Natacion: " + mirar.nivel + "\n" + "Cuota mensual: " + mirar.cuota );
                    } else {
                        JOptionPane.showMessageDialog(null, "No esta asociado al club");
                    }
                    break;
                case "Ingreso Total":
                    int total = 0;
                    int numMiembros = 0;
                    for (club sumar : natacion) {
                        total += sumar.cuota;
                        numMiembros++;
                    }
                    JOptionPane.showMessageDialog(null, "El total de las inscriciones mensuales es: $" + total);
                    break;
                case "Salir":
                    JOptionPane.showMessageDialog(null, "Saliendo....");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
            
        } while (!seleccion.equals("Salir"));
    }
    public static boolean agregarMiembro(club[] natacion, String nombre, String nivel, int cuota){
        for (int i = 0; i < natacion.length; i++) {
            if (natacion[i] == null) {
                natacion[i] = new club(nombre, nivel, cuota);
                return true;
            }
        }
        return false;
    }
    public static club buscar(club[] natacion, String nombre){
        for (club buscar : natacion) {
            if (buscar != null && buscar.nombre.equals(nombre)) {
               return buscar; 
            }
        }
        return null;
    }
}
