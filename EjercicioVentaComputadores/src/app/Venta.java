
package app;

import java.time.LocalDate;
import java.util.Objects;

public class Venta {
    private Producto producto;
    private int cantidad;
    private LocalDate fecha;
    public double total;

    public Venta(Producto producto, int cantidad, LocalDate fecha, double total) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.total = total;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public int hashCode() {
        return Objects.hash(producto,fecha);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venta other = (Venta) obj;
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        return Objects.equals(this.fecha, other.fecha);
    }

    @Override
    public String toString() {
        return "Venta:\n" + "-Producto=" + producto + "\n" + 
                "-Cantidad=" + cantidad +"\n" +  "-Fecha=" + fecha + "\n" + 
                "-Total=" + total ;
    }

    
    
    
}
