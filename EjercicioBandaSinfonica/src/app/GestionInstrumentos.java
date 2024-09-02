
package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionInstrumentos {
    private ArrayList<Instrumento> listaInstrumentos = new ArrayList<>();
    private ArrayList<Prestamo> listaPrestamos = new ArrayList<>();
    
    public String entrada (String texto){
        return JOptionPane.showInputDialog(texto);
    }
    
    public void agregarInstrumento(){
        String nombre = entrada("Nombre del Instrumento: ");
        
        for (Instrumento instrumento : listaInstrumentos) {
            if (instrumento.getNombre().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, " !!!El instrumento ya se encuentra¡¡¡");
                return;
            }
        }
        String grupo = entrada("Grupo del Instrumento: (Cuerdas/ Cuerdas Frotadas/ Vientos/ Metales/ Percusion)");
        String estado = entrada("Estado del Instrumento");
        int cantidad = Integer.parseInt(entrada("Cantidad de Instrumentos"));
        
        Instrumento instrumento = new Instrumento(nombre, grupo, estado, cantidad);
        listaInstrumentos.add(instrumento);
        JOptionPane.showMessageDialog(null, " !!!El Instrumentos ha sido agregado exitosamentre¡¡¡");
    }
    
    public void eliminarInstrumento(){
        String nombre = entrada("Ingrese el nombre del Instrumento a Eliminar: ");
        boolean eliminado = listaInstrumentos.removeIf(libro-> libro.getNombre().equalsIgnoreCase(nombre));
        if (eliminado) {
            JOptionPane.showMessageDialog(null, "!!Instrumento Eliminado Exitosamente!!\n");
        }else{
            JOptionPane.showMessageDialog(null, "!!Instrumento NO Encontrado!!");
        }
    }
    
    public Instrumento buscarInstrumentoPorNombre(String nombre) {
        for (Instrumento instrumento : listaInstrumentos) {
            if (instrumento.getNombre().equalsIgnoreCase(nombre)) {
                return instrumento;
            }
        }
        return null;
    }
    public void actualizarEstado(){
        String nombre = JOptionPane.showInputDialog("Nombre del Instrumento a cambiar el Estado:");
        Instrumento instrumento = buscarInstrumentoPorNombre(nombre);
        if (instrumento != null) {
            String nuevoEstado = JOptionPane.showInputDialog("Nuevo Estado (Nuevo, Usado, En Reparación):");
            instrumento.setEstado(nuevoEstado);
            JOptionPane.showMessageDialog(null, "Estado actualizado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Instrumento no encontrado.");
        }
    }
    public void actualizarCantidad(){
        String nombre = JOptionPane.showInputDialog("Nombre del Instrumento a cambiar su Cantidad:");
        Instrumento instrumento = buscarInstrumentoPorNombre(nombre);
        if (instrumento != null) {
            int nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva Cantidad del Instrumento:"));
            instrumento.setCantidad(nuevaCantidad);
            JOptionPane.showMessageDialog(null, "Cantidad actualizado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Instrumento no encontrado.");
        }
    }
    
    public void solicitarPrestamo(){
        if (listaInstrumentos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay Instrumentos disponibles");
        }
        String[] grupos = {"Cuerdas", "Cuerdas Frotadas", "Vientos", "Metales", "Percusion"};
        String grupoSeleccionado = (String) JOptionPane.showInputDialog(null,
                "Seleccione el grupo de Instrumentos a Solicitar",
                "Grupo de Instrumento",
                JOptionPane.QUESTION_MESSAGE,
                null,
                grupos,
                grupos[0]);
        if (grupoSeleccionado == null) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun grupo");
        }
        
        Instrumento grupoSeleccionado2 = null;
        
        //lista de los instrumentos segun su grupo seleccionado
        List<String> nombresInstrumentos = new ArrayList<>();
        for (Instrumento instrumento : listaInstrumentos) {
            if (instrumento.getGrupo().equalsIgnoreCase(grupoSeleccionado)) {
                grupoSeleccionado2 = instrumento;
                nombresInstrumentos.add(instrumento.getNombre());
            }
        }        
        if (nombresInstrumentos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay instrumentos en este grupo grupo");
            return;
        }
        
        String instrumentoSeleccionado = (String) JOptionPane.showInputDialog(null,
                "Seleccione el Instrumento",
                "Nombre del Instrumento",
                JOptionPane.QUESTION_MESSAGE,
                null,
                nombresInstrumentos.toArray(),
                nombresInstrumentos.get(0));
        
        if (instrumentoSeleccionado == null) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún instrumento.");
            return;
        }       
        
        Instrumento instrumentoElegido = null;
        
        for (Instrumento instrumento : listaInstrumentos) {
            if (instrumento.getNombre().equalsIgnoreCase(instrumentoSeleccionado)) {
                instrumentoElegido = instrumento;
                instrumento.setCantidad(instrumento.getCantidad()-1);
                break;
            }
        }
        if (instrumentoElegido.getCantidad() < 0) {
            JOptionPane.showMessageDialog(null, "!!!El instrumento no esta disponible¡¡¡");
            return;
        }
       
        
        String nombreUsuario = entrada("Ingrese su nombre: ");
        String celular = entrada("Ingrese su numero de celular:v");
        
        Prestamo prestamo = new Prestamo(grupoSeleccionado2, instrumentoElegido, nombreUsuario, celular);
        listaPrestamos.add(prestamo);
        
        JOptionPane.showMessageDialog(null, "Instrumento '" + instrumentoSeleccionado + "' del grupo '" + grupoSeleccionado + "' solicitado exitosamente.");
    }
    
    public void registrarDevolucion() {
    if (listaPrestamos.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No hay préstamos registrados.");
        return;
    }

        String nombreUsuario = entrada("Ingrese su nombre: ");
        String nombreInstrumento = entrada("Ingrese el nombre del Instrumento que está devolviendo: ");

        Prestamo prestamoDevolver = null;

        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getNombreUsuario().equalsIgnoreCase(nombreUsuario) &&
                prestamo.getInstrumento().getNombre().equalsIgnoreCase(nombreInstrumento)) {
                prestamoDevolver = prestamo;
                break;
            }
        }

        if (prestamoDevolver == null) {
            JOptionPane.showMessageDialog(null, "Préstamo no encontrado. Verifique la información ingresada.");
            return;
        }

        //actualiza la cantidad del instrumento 
        Instrumento instrumentoDevuelto = prestamoDevolver.getInstrumento();
        instrumentoDevuelto.setCantidad(instrumentoDevuelto.getCantidad() + 1);

        // cambiar el estado del instrumento
        String nuevoEstado = entrada("Ingrese el nuevo estado del Instrumento (Nuevo/Usado/Enreparación): ");
        if (nuevoEstado != null) {
            instrumentoDevuelto.setEstado(nuevoEstado);
        }

        //fecha de devolución
        prestamoDevolver.mostrarInfo();  // Muestra la información antes de la devolución
        prestamoDevolver.getFechaDevolucion(); 
        JOptionPane.showMessageDialog(null, "Devolución registrada exitosamente.");

        listaPrestamos.remove(prestamoDevolver); // elimina el préstamo de la lista
    }

    public void reporteInstrumentosDisponibles() {
        if (listaInstrumentos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay instrumentos disponibles.");
            return;
        }

        StringBuilder reporte = new StringBuilder("Listado de Instrumentos Disponibles:\n");

        // Categorizar instrumentos por grupo
        for (String grupo : new String[]{"Cuerdas", "Cuerdas Frotadas", "Vientos", "Metales", "Percusion"}) {
            reporte.append("\nGrupo: ").append(grupo).append("\n");
            for (Instrumento instrumento : listaInstrumentos) {
                if (instrumento.getGrupo().equalsIgnoreCase(grupo) && instrumento.getCantidad() > 0) {
                    reporte.append(" - ").append(instrumento.getNombre())
                           .append(" (Cantidad: ").append(instrumento.getCantidad()).append(")\n");
                }
            }
        }

        JOptionPane.showMessageDialog(null, reporte.toString());
    }
    
    public void historialPrestamos() {
        if (listaPrestamos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay historial de préstamos.");
            return;
        }

        StringBuilder reporte = new StringBuilder("Historial de Préstamos:\n");

        for (Prestamo prestamo : listaPrestamos) {
            reporte.append("Usuario: ").append(prestamo.getNombreUsuario()).append("\n")
                   .append("Instrumento: ").append(prestamo.getInstrumento().getNombre()).append("\n")
                   .append("Grupo: ").append(prestamo.getGrupo().getGrupo()).append("\n")
                   .append("Fecha de Préstamo: ").append(prestamo.getFechaPrestamo()).append("\n")
                   .append("Fecha de Devolución: ").append(prestamo.getFechaDevolucion()).append("\n")
                   .append("Estado: ").append(prestamo.isAtrasado() ? "Atrasado" : "En Plazo").append("\n\n");
        }

        JOptionPane.showMessageDialog(null, reporte.toString());
    }
    
    public void reporteInstrumentosAtrasados() {
        if (listaPrestamos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay préstamos registrados.");
            return;
        }

        StringBuilder reporte = new StringBuilder("Instrumentos Atrasados:\n");
        boolean atrasados = false;

        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.isAtrasado()) {
                atrasados = true;
                reporte.append("Usuario: ").append(prestamo.getNombreUsuario()).append("\n")
                       .append("Instrumento: ").append(prestamo.getInstrumento().getNombre()).append("\n")
                       .append("Grupo: ").append(prestamo.getGrupo().getGrupo()).append("\n")
                       .append("Fecha de Préstamo: ").append(prestamo.getFechaPrestamo()).append("\n")
                       .append("Fecha de Devolución: ").append(prestamo.getFechaDevolucion()).append("\n\n");
            }
        }

        if (atrasados) {
            JOptionPane.showMessageDialog(null, reporte.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No hay instrumentos atrasados.");
        }
    }

    public void reporteUsoPorGrupo() {
        if (listaPrestamos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay préstamos registrados.");
            return;
        }

        StringBuilder reporte = new StringBuilder("Uso por Grupo de Instrumentos:\n");
        int[] conteoPorGrupo = new int[5];
        String[] grupos = {"Cuerdas", "Cuerdas Frotadas", "Vientos", "Metales", "Percusion"};

        for (Prestamo prestamo : listaPrestamos) {
            String grupo = prestamo.getGrupo().getGrupo();
            for (int i = 0; i < grupos.length; i++) {
                if (grupo.equalsIgnoreCase(grupos[i])) {
                    conteoPorGrupo[i]++;
                    break;
                }
            }
        }

        for (int i = 0; i < grupos.length; i++) {
            reporte.append("Grupo: ").append(grupos[i])
                   .append(" - Préstamos realizados: ").append(conteoPorGrupo[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, reporte.toString());
    }

}
