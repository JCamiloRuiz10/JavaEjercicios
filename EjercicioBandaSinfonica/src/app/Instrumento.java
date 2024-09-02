
package app;

public class Instrumento {
    private String nombre;
    private String grupo;
    private String estado;
    private int cantidad;
    
    public Instrumento(){
        this.nombre = "";
        this.grupo = "";
        this.estado = "";
        this.cantidad = 1;
    }

    public Instrumento(String nombre, String grupo, String estado, int cantidad) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.estado = estado;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
