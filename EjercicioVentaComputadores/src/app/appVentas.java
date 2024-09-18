
package app;

import javax.swing.JOptionPane;

public class appVentas {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        
        while (true) {            
            String[] opciones = {
                "Agregar Producto",
                "Registrar Fabricante",
                "Realizar Venta",
                "Calcular total de un Periodo",
                "Salir"
            };
            
            String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion",
                    "Sitema de Gestion de Ventas Computadores", JOptionPane.QUESTION_MESSAGE,null,
                    opciones, opciones[0]);
            if (seleccion == null || seleccion.equals("Salir")) {
                break;
            }
            switch (seleccion) {
                case "Agregar Producto":
                    tienda.agregarProductos();
                    break;
                case "Registrar Fabricante":
                    tienda.registrarFabricantes();
                    break;
                case "Realizar Venta":
                    tienda.realizarVentas();
                    break;
                 case "Calcular total de un Periodo":
                    tienda.calcularTotalVentas();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Cuidado!! Opcion NO Valida");
                    break;
            } 
        }
        JOptionPane.showMessageDialog(null, "Gracias por usar el sistema!!");
    }
}
