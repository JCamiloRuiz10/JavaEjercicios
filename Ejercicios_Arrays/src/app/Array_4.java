
package app;

import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;

class ropa{
    String tipo;
    int cantidad;
    int precio;
    public ropa(String tipo, int cantidad, int precio){
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
    }
}
public class Array_4 {
    public static void main(String[] args) {
        ropa[] almacen = new ropa[50];
        almacen[0] = new ropa("Pantalon", 30, 15000);
        almacen[1] = new ropa("Camisa", 50, 80000);
        almacen[2] = new ropa("Chaqueta", 45, 120000);
        almacen[3] = new ropa("Medias", 100, 6000);
        
        String seleccion;
        do {            
            String[] opciones = {"Agregar Unidades", "Vender", "Buscar", "Ordenar", "Salir"};
            seleccion = (String) JOptionPane.showInputDialog(null,
                "Selecione la funcion de la Tienda de Ropa",
                "Funciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
            if (seleccion != null) {
                switch (seleccion) {
                    case "Agregar Unidades":
                        String nomRopa = JOptionPane.showInputDialog("Ingrese el tipo de ropa a agregar");
                        ropa agregar = buscarRopa(almacen, nomRopa);
                        
                        if (agregar != null) {
                            int cantidadAgregar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de prendas a agregar:"));
                            agregar.cantidad += cantidadAgregar;
                            JOptionPane.showMessageDialog(null, "Se agregaron " + cantidadAgregar + " prendas de " + nomRopa);
                        } else {
                            JOptionPane.showMessageDialog(null, "La prenda no esta disponible");
                        }
                        break;
                    case "Vender":
                        String ropaVender = JOptionPane.showInputDialog("Ingrese el tipo de ropa a vender");
                        ropa vender = buscarRopa(almacen, ropaVender);
                        if (vender != null) {
                            if (vender.cantidad > 0) {
                                vender.cantidad --;
                                JOptionPane.showMessageDialog(null, "Prenda Vendida");
                            } else {
                                JOptionPane.showMessageDialog(null, "Prenda no vendida");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "La prenda no se encunetra");
                        }                        
                        break;
                    case "Buscar":
                        String buscaRopa = JOptionPane.showInputDialog("Ingrese el tipo de ropa a Buscar");
                        ropa busqueda = buscarRopa(almacen, buscaRopa);
                        if (busqueda != null) {
                            JOptionPane.showMessageDialog(null, "Tipo: " + busqueda.tipo + "\n" + "Cantidad: " + busqueda.cantidad + "\n" + "Precio por Unidad: " + busqueda.precio);
                        }else{
                            JOptionPane.showMessageDialog(null, "La prenda no se encunetra");
                        }                       
                        break;
                    case "Ordenar":
                        Arrays.sort(almacen, new Comparator<ropa>() {
                        public int compare(ropa ropa1, ropa ropa2) {
                            if (ropa1 == null || ropa2 == null) {                                
                                return 0; 
                            }
                            return Integer.compare(ropa1.precio, ropa2.precio);
                        }
                    });
                    JOptionPane.showMessageDialog(null, "Ropa ordenada por precio.");
                        break;
                    case "Salir":
                        JOptionPane.showMessageDialog(null, "Salieendo.....");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
            } else {
            }
        } while (!seleccion.equals("Salir"));
    }
    public static ropa buscarRopa(ropa[] almacen, String tipo){
        for (ropa buscar : almacen) {
            if (buscar != null && buscar.tipo.equals(tipo)) {
                return buscar;
            }
        }
        return null;
    }
}
