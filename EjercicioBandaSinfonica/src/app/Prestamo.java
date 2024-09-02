
package app;

import java.time.LocalDate;

public class Prestamo {
    private Instrumento grupo;
    private Instrumento instrumento;
    private String nombreUsuario;
    private String celular;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Instrumento grupo, Instrumento instrumento, String nombreUsuario, String celular) {
        this.grupo = grupo;
        this.instrumento = instrumento;
        this.nombreUsuario = nombreUsuario;
        this.celular = celular;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = fechaPrestamo.plusDays(2);
    }

    public Instrumento getGrupo() {
        return grupo;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getCelular() {
        return celular;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    
    public boolean isAtrasado(){
        return LocalDate.now().isAfter(fechaDevolucion);
    }
    
    public void mostrarInfo(){
        System.out.println("Usuario:" + nombreUsuario);
        System.out.println("Grupo del Instrumento:" + grupo.getGrupo());
        System.out.println("Nombre del Instrumento:" + instrumento.getNombre());
        System.out.println("Celular:" + celular);
        System.out.println("Fecha Prestamo:" + fechaPrestamo);
        System.out.println("Fecha Devolucion:" + fechaDevolucion);
        System.out.println("Estado: " +(isAtrasado() ? "Atrasado" : "En Plazo"));
        System.out.println("");
    }
}
