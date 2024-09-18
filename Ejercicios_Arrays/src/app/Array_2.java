
package app;

import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;

class vehiculo{
    String modelo;
    String matricula;
    double precio;
    String disponible;
    
    public vehiculo(String modelo, String matricula, double precio, String disponible){
        this.modelo = modelo;
        this.matricula = matricula;
        this.precio = precio;
        this.disponible = disponible;
    }
}
public class Array_2 {
    public static void main(String[] args) {
        vehiculo[] alquiler = new vehiculo[50];
        
        alquiler[0] = new vehiculo("Toyota Corolla", "ABC1234", 50000, "SI");
        alquiler[1] = new vehiculo("Honda Civic", "DEF5678", 35000, "SI");
        alquiler[2] = new vehiculo("Mercedez JC", "JYD456", 70000, "NO");
        alquiler[3] = new vehiculo("Ford WM", "WER789", 30000, "SI");
        alquiler[4] = new vehiculo("AKT 125", "SD456", 10000, "ALQUILADO");
        
        String seleccion;
        do {            
        String[] opciones = {"Lista", "Alquilar", "Devolver", "Buscar", "Ordenar", "Salir"};
        seleccion = (String) JOptionPane.showInputDialog(null,
                "Selecione la accion con el Vehuculo",
                "Acciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
            if (seleccion != null) {
                switch (seleccion) {
                    case "Lista":
                        String listaFinal = "";
                        for (vehiculo lista : alquiler) {
                            if (lista!=null) {
                                listaFinal += ("Modelo: " + lista.modelo + "\n" + "Matricula: " + lista.matricula + "\n" + "Precio por Hora: " + lista.precio + "\n" + "Disponible: " +lista.disponible + "\n\n" );
                            }
                        }
                        JOptionPane.showMessageDialog(null, listaFinal);
                        break;                   
                    case "Alquilar":
                        String modelVehiculo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo a alquilar");
                        String placaVehiculo = JOptionPane.showInputDialog("Ingrese la matricula vehiculo " + modelVehiculo);
                        vehiculo alquilada = buscarVehiculo(alquiler, modelVehiculo, placaVehiculo);
                        if (alquilada != null) {
                        if (alquilada.disponible.equals("SI")) {
                            alquilada.disponible = "ALQUILADO";
                            JOptionPane.showMessageDialog(null, "El Vehiculo" + modelVehiculo + placaVehiculo + " se alquilo exitosamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "El Vehiculo" + modelVehiculo + placaVehiculo + " NO esta disponible");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El vehiculo no lo tenemos");
                    }
                        break;
                    case "Devolver":
                        String modelVehiculo2 = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo a Devolver");
                        String placaVehiculo2 = JOptionPane.showInputDialog("Ingrese la matricula vehiculo " + modelVehiculo2);
                        vehiculo devolver = buscarVehiculo(alquiler, modelVehiculo2, placaVehiculo2);
                        if (devolver != null) {
                        if (devolver.disponible.equals("ALQUILADO")) {
                            devolver.disponible = "SI";
                            JOptionPane.showMessageDialog(null, "El Vehiculo" + modelVehiculo2 + placaVehiculo2 + " se Devolvio exitosamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "El Vehiculo" + modelVehiculo2 + placaVehiculo2 + " NO esta alquilado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El vehiculo no lo tenemos");
                    }
                        break;
                    case "Buscar":
                        String modelVehiculo3 = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo a Buscar");
                        String placaVehiculo3 = JOptionPane.showInputDialog("Ingrese la matricula vehiculo " + modelVehiculo3);
                        vehiculo buscar = buscarVehiculo(alquiler, modelVehiculo3, placaVehiculo3);
                        if (buscar != null) {
                            JOptionPane.showMessageDialog(null, "El vehiculo " + buscar.modelo + buscar.matricula + " se encuentra y su disposicion es: " + buscar.disponible);
                        } else {
                            JOptionPane.showMessageDialog(null, "El vehiculo no lo tenemos");
                        }
                        break;
                    case "Ordenar":
                        Arrays.sort(alquiler, new Comparator<vehiculo>() {
                        public int compare(vehiculo vehiculo1, vehiculo vehiculo2) {
                            if (vehiculo1 == null || vehiculo2 == null) {                               
                                return 0; 
                            }
                            return Double.compare(vehiculo1.precio, vehiculo2.precio);
                        }
                    });
                    JOptionPane.showMessageDialog(null, "Vehículos ordenados por precio.");
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
    public static vehiculo buscarVehiculo(vehiculo[] alquiler, String modelo, String placa){
        for (vehiculo verVehiculo : alquiler) {
            if (verVehiculo != null && verVehiculo.modelo.equals(modelo) && verVehiculo.matricula.equals(placa) ) {
                return verVehiculo;
            }
        }
        return null;
    }
}



