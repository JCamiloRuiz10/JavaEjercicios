
package app;

import javax.swing.JOptionPane;

public class AppBanda {
    public static void main(String[] args) {
        GestionInstrumentos instrumentos = new GestionInstrumentos();
        
        byte opcion;
        
        do {            
            opcion = Byte.parseByte(JOptionPane.showInputDialog(
            "Menu Principal\n"
            + "1.Agregar Instrumento\n"
            + "2.Eliminar Instrumento\n"
            + "3.Actualizar cantidad\n"
            + "4.Actualizar Estado\n"
            + "5.Solicitar Prestamo\n"
            + "6.Registrar Devolucion\n"
            + "7.Instrumentos Disponibles\n"
            + "8.Historial de Prestamos\n"
            + "9.Prestamos Atrasados\n"
            + "10.Uso por Grupo \n"
            + "11. Salir\n"));
            
            switch (opcion) {
                case 1:
                    instrumentos.agregarInstrumento();
                    break;
                case 2:
                    instrumentos.eliminarInstrumento();
                    break;
                case 3:
                    instrumentos.actualizarCantidad();
                    break;
                case 4:
                    instrumentos.actualizarEstado();
                    break;
                case 5:
                    instrumentos.solicitarPrestamo();
                    break;
                case 6:
                    instrumentos.registrarDevolucion();
                    break;
                case 7:
                    instrumentos.reporteInstrumentosDisponibles();
                    break;
                case 8:
                    instrumentos.historialPrestamos();
                    break;
                case 9:
                    instrumentos.reporteInstrumentosAtrasados();
                    break;
                case 10:
                    instrumentos.reporteUsoPorGrupo();
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null, "!!Gracias por utilizar el Sistema!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "!!Opcion no valida!!");
            }
        }while (opcion != 11);
    }
    
    
}
