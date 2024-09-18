
package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.stream.Collectors;

public class Tienda {
    private List<Producto> productos;
    private List<Fabricante> fabricantes;
    private List<Venta> ventas;
    
    public Tienda(){
        this.productos =new ArrayList<>();
        this.fabricantes =new ArrayList<>();
        this.ventas =new ArrayList<>();
    }
    
    public void agregarProductos(){
        String nombre = JOptionPane.showInputDialog("Digite el nombre del producto: ");
        String codigo = JOptionPane.showInputDialog("Digite el código del producto: ");
        String tipo = JOptionPane.showInputDialog("Digite el tipo de producto (Laptop, Monitor, Accesorio): ");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del producto: "));
        
        Producto producto = new Producto(nombre, codigo, tipo, precio);
        
        String nombreFabricante = JOptionPane.showInputDialog("Digite el nombre del fabricante asociado: ");
            Fabricante fabricante = fabricantes.stream()
                .filter(f -> f.getNombre().equals(nombreFabricante))
                .findFirst()
                .orElse(null);
            
            if (fabricante != null) {
                producto.getFabricantes().add(fabricante);
            } else {
                JOptionPane.showMessageDialog(null, "Fabricante no encontrado.");
            }
        productos.add(producto);
        JOptionPane.showMessageDialog(null, "!!Producto agregado exitosamente!!");
    }
    
    public void registrarFabricantes(){
        String nombre = JOptionPane.showInputDialog("Digite el nombre del fabricante: ");
        String pais = JOptionPane.showInputDialog("Digite el pais del Fabricante: ");
        int anioFudacion = Integer.parseInt(JOptionPane.showInputDialog("Digite el anio de Fundacion del Fabricante: "));
        
        Fabricante fabricante = new Fabricante(nombre, pais, anioFudacion);
        fabricantes.add(fabricante);
        JOptionPane.showMessageDialog(null, "!!Fabricante agregado exitosamente!!");
    }
    
    public void realizarVentas(){
        String nombreProducto = JOptionPane.showInputDialog("Digite el nombre del producto: ");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad: "));
        LocalDate fecha = LocalDate.parse(JOptionPane.showInputDialog("Digite la feha de la compra (AAAA-MM-DD)"));
        
        Producto producto = productos.stream()
                .filter(h -> h.getNombre().equals(nombreProducto))
                .findFirst()
                .orElse(null);
        if (producto != null) {
            double total = producto.getPrecio()*cantidad;
            Venta venta = new Venta(producto, cantidad, fecha, total);
            ventas.add(venta);
            JOptionPane.showMessageDialog(null, "!!Venta relizada Exitosamente!! \n" + venta);
        }
        else{
            JOptionPane.showMessageDialog(null, "Cuidado!! Producto NO encontrado");
        }       
    }
    
    public void calcularTotalVentas(){
         LocalDate fechaInicio = LocalDate.parse(JOptionPane.showInputDialog("Digite la feha de Comienzo(AAAA-MM-DD)"));
         LocalDate fechaFin = LocalDate.parse(JOptionPane.showInputDialog("Digite la feha de finalizacion (AAAA-MM-DD)"));
          
        double totalVentas = ventas.stream()
          .filter(venta -> !venta.getFecha().isBefore(fechaInicio) && !venta.getFecha().isAfter(fechaFin))
          .mapToDouble(Venta::getTotal)
          .sum();
        
        JOptionPane.showMessageDialog(null, "Total de ventas entre " + fechaInicio + " y " + fechaFin + ": $" + totalVentas);
   
    }
}
