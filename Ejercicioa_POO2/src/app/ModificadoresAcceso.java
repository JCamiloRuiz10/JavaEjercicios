
package app;

import java.time.LocalDate;
import java.time.Period;

public class ModificadoresAcceso {
    public static void main(String[] args) {
//        //Ejercicio 31
//        Empleado empleado = new Empleado("Carla Munoz", 130);
//        System.out.println("Nombre: " + empleado.getNombre()+ "\n"  + "Sueldo Mensual: " + empleado.getSueldo() + "\n" + "Sueldo Anual: " + empleado.salarioAnual());

//        //Ejercicio 32
//        Producto producto = new Producto("FT67", "Bicicleta", 500000);
//        System.out.println("Codigo del producto: " + producto.getCodigo() + "\n" + "Nombre: " + producto.getNombre() + "\n" +  "Precio: " + producto.getPrecio() +
//                "\n"  + "Precio con descuento del 10%: " + producto.precioFin());

//        //Ejercicio 33
//        Cliente cliente = new Cliente("Laura Mateus", "cra12-cll32", "3112355679");
//        System.out.println("Nombre: " + cliente.getNombre()+ "\n"  + "Direccion: " + cliente.getDireccion() + "\n" + "Telefono: " + cliente.getTelefono());

//        //Ejercicio 34
//        Factura factura = new Factura("23", "Pablo Ochoa", 125000);
//        System.out.println("Numero de Factura: " + factura.numero + "\n" + "Cliente: " + factura.nombre + "\n" +  "Subtotal: " + factura.subtotal +
//                "\n"  + "Total con iva: " + factura.total());

//        //Ejercicio 35
//        Pedido pedido = new Pedido("236", "Juan", 2, 18000);
//        System.out.println("Numero: " + pedido.numero +"\n" + "Cliente: " + pedido.nombre + "\n" +"Cantidad: " + pedido.cantidad + 
//                "\n" + "Precio Unidad: " + pedido.precio);

//        //Ejercicio 36
//        Inventario inventario = new Inventario("DF60", 58, 12000);
//        System.out.println("Codigo: " + inventario.codigo + "\n" + "Cantidad: " + inventario.cantidad + "\n" +  "Precio por Unidad: " + inventario.precio +
//                "\n"  + "Valor Total: " + inventario.valorFin());

//        //Ejercicio 37
//        Proovedor proovedor = new Proovedor("Andea Palacios", "Cartones SA", "3125674387");
//        System.out.println(proovedor.info());

//        //Ejercicio 38
//        Compra compra = new Compra("342", "Jose Alarcon", 6, 56000);
//        System.out.println("Numero: " + compra.getNumero() +"\n" + "Proovedor: " + compra.getNombre() + "\n" +"Cantidad: " + compra.getCantidad() + 
//                "\n" + "Precio Unidad: " + compra.getPrecio() + "\n" + "Precio total: " + compra.precioCompra());

//        //Ejercicio 39
//        Venta venta = new Venta("Cuadernos", 57, 2900);
//        System.out.println("Producto: " + venta.producto + "\n" + "Cantidad: " + venta.cantidad + "\n" +  "Precio por Unidad: " + venta.precio +
//                "\n"  + "Valor Total: " + venta.valorFin());

        //Ejercicio 40
//        Servicio servicio = new Servicio("SE34", "Mantenimiento moto", 9000, 15);
//        System.out.println("Codigo: " + servicio.codigo + "\n" + "Descrpcion: " + servicio.descripcion + "\n" +  "Precio por Hora: " + servicio.precio +
//                "\n"  + "Horas trabajadas : " + servicio.horas + "\n" + "Costo del Servicio: " + servicio.costoFin());

//        //Ejercicio 41
//        Gerente gerente1 = new Gerente("Paco Perez", 100000, 10000);
//        Gerente gerente2 = new Gerente("Isabel Lopez", 490000, 50000);
//        System.out.println(gerente1);
//        System.out.println(gerente2);

//        //Ejercicio 42
//        ProductoPerecedero perecedero1 = new ProductoPerecedero("JFY78", "QUESO", 20000, LocalDate.of(2024, 07, 28));
//        ProductoPerecedero perecedero2 = new ProductoPerecedero("KDJ70", "POLLO", 30000, LocalDate.of(2024, 07, 20));
//        System.out.println(perecedero1);
//        System.out.println(perecedero2);

//        //Ejercicio 43
//        ClienteFrecuente clienteA = new ClienteFrecuente("Adriana Ocaciones", "cra09-cll23", "3112497603", 10, 8);
//        ClienteFrecuente clienteB = new ClienteFrecuente("Yoifer Rincon", "cra22-cll12", "3256789876", 20, 15);
//        System.out.println(clienteA);
//        System.out.println(clienteB);

//        //Ejercicio 44
//        FacturaConDescuento descuento1 = new FacturaConDescuento(23, 50000, 10);
//        FacturaConDescuento descuento2 = new FacturaConDescuento(43, 120000, 13);
//        System.out.println(descuento1);
//        System.out.println(descuento2);

//        //Ejercicio 45
//        PedidoExpress express1 =new PedidoExpress(24, "Ricardo Gil", 3, 17000, 20000, 3);
//        PedidoExpress express2 =new PedidoExpress(37, "Eduardo Pena", 7, 23000, 18000, 4);
//        System.out.println(express1);
//        System.out.println(express2);

//        //Ejercicio 46
//        InversionRiesgo riesgo1 = new InversionRiesgo(4234, "Pepito Perez", 500000, 2, "Alto");
//        InversionRiesgo riesgo2 = new InversionRiesgo(4234, "Yeison Monroy", 230000, 1, "Bajo");
//        System.out.println(riesgo1);
//        System.out.println(riesgo2);

//        //Ejercicio 47
//        ProductoFragil fragil1 = new ProductoFragil(12341, "Copas", 43, 15000, "Alto");
//        ProductoFragil fragil2 = new ProductoFragil(12341, "Cucharas", 143, 5000, "Bajo");
//        System.out.println(fragil1);
//        System.out.println(fragil2);

//        //Ejercicio 48
//        ServicioUrgente urgente1 = new ServicioUrgente(345, "Operacion", 10, 50000);
//        ServicioUrgente urgente2 = new ServicioUrgente(2356, "Analisis", 5, 30000);
//        System.out.println(urgente1);
//        System.out.println(urgente2);

//        //Ejercicio 49
//        CompraInternacional inter1 = new CompraInternacional(24, "Jasmin Perez", 12, 34000);
//        CompraInternacional inter2 = new CompraInternacional(12, "Jose Luis", 22, 12000);
//        System.out.println(inter1);
//        System.out.println(inter2);

//        //Ejercicio 50
//        Vendedor3 vend1 = new Vendedor3("Camilo", 40000000, 6000000);
//        Vendedor3 vend2 = new Vendedor3("Julian", 30000000, 4000000);
//        System.out.println(vend1);
//        System.out.println(vend2);

        //Ejercicio 51
        Vehiculo sedan = new Sedan("Ford", "Rambo", 2022, 40, "Diesel");
        Vehiculo suv = new SUV("Mercedez", "A21", 2020, 30, "Gasolina");
        Vehiculo deportiva = new Deportiva("AKT", "CR4", 2019, 20, 150);
        Vehiculo turismo = new Turismo("AKT", "CR4", 2019, 20, 150);
        Vehiculo comercial = new Comercial("Embraer", "S200", 2018, 120, "Grande");
        Vehiculo privado = new Privado("Cessna", "EF", 2020, 10, "Pequenio");
        Vehiculo militar = new Militar("Bell ", "AZ", 2010, 25, 5000);
        Vehiculo civil = new Civil("Airbus ", "M67", 2020, 15, 4000);
        System.out.println(sedan);
        System.out.println(suv);
        System.out.println(deportiva);
        System.out.println(turismo);
        System.out.println(comercial);
        System.out.println(privado);
        System.out.println(militar);
        System.out.println(civil);
    }
}

//Ejercicio 31
class Empleado{
    //Atributos privados
    private String nombre;
    private double salario;
    
    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    //Metodos publicos para obtener y establecer nombre y sueldo
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getSueldo(){
        return salario;
    }
    public void setSueldo(double salario){
        this.salario = salario;
    }
    //Metodo para calcular salario
    public double salarioAnual(){
        return salario * 12;
    }
}

//Ejercicio 32
class Producto{
    protected String codigo;
    protected String nombre;
    protected double precio;
    
    public Producto(String codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public double precioFin(){
        return precio - (precio * 0.1);
    }
}

//Ejercicio 33
class Cliente{
     String nombre;
     String direccion;
     String telefono;
    
    public Cliente(String nombre, String direccion, String telefono){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}

//Ejercicio 34
class Factura{
    public String numero;
    public String nombre;
    public double subtotal;
    
    public Factura(String numero, String nombre, double subtotal){
        this.numero = numero;
        this.nombre = nombre;
        this.subtotal = subtotal;
    }
    private double iva(){
        return subtotal * 0.15;
    }
    private double totalFactura(){
        return subtotal + iva();
    }
    public double total(){
        return totalFactura();
    }
}

//Ejercicio 35
class Pedido{
    protected String numero;
    protected String nombre;
    protected int cantidad;
    protected double precio;
    
    public Pedido(String numero, String nombre, int cantidad, double precio){
        this.numero = numero;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
}

//Ejercicio 36
class Inventario{
    public String codigo;
    public int cantidad;
    public double precio;
    
    public Inventario(String codigo, int cantidad, double precio){
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    private double valorInventario(){
        return cantidad * precio;
    }
    public double valorFin(){
        return valorInventario();
    }
}

//Ejercicio 37
class Proovedor{
    protected String nombre;
    protected String empresa;
    protected String telefono;
    
    public Proovedor(String nombre, String empresa, String telefono){
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
    }
    protected String getNombre(){
        return nombre;
    }
    protected void setNombre(String nombre){
        this.nombre = nombre;
    }
    protected String getDireccion(){
        return empresa;
    }
    protected void setDireccion(String empresa){
        this.empresa = empresa;
    }
    protected String getTelefono(){
        return telefono;
    }
    protected void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String info(){
        return "Nombre: " + nombre +"\n" +  "Empresa: " + empresa +"\n" +  "Telefono: " + telefono;
    }
}

//Ejercicio 38
class Compra{
    private String numero;
    private String nombre;
    private int cantidad;
    private double precio;
    
    public Compra(String numero, String nombre, int cantidad, double precio){
        this.numero = numero;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public double precioCompra(){
        return cantidad * precio;
    }
}

//Ejercicio 39
class Venta{
    public String producto;
    public int cantidad;
    public double precio;
    
    public Venta(String producto, int cantidad, double precio){
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    private double valorVenta(){
        return cantidad * precio;
    }
    public double valorFin(){
        return valorVenta();
    }
}

//Ejercicio 40
class Servicio{
    public String codigo;
    public String descripcion;
    public double precio;
    public int horas;
    
    public Servicio(String codigo, String descripcion, double precio, int horas){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.horas = horas;
    }
    private double costo(){
        return precio * horas;
    }
    public double costoFin(){
        return costo();
    }
}

//Eercicio 41
class Empleado2 {
    String nombre;
    double salarioBase;

    public Empleado2(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
class Gerente extends Empleado2 {
    double bonificacion;
    double salarioTotal;
    
    public Gerente(String nombre, double salarioBase, double bonificacion) {
        super(nombre, salarioBase);
        this.bonificacion = bonificacion;
        this.salarioTotal = salarioTotal();
    }
    public double getBonificacion() {
        return bonificacion;
    }
    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }
    public double salarioTotal() {
        return salarioBase + bonificacion;
    }
    public String toString() {
        return "Empleado: " + nombre + "\n" +  "Salario Base: " + salarioBase + "\n" +  "Bonificacion: " + bonificacion + "\n" +  "Salario Total: " + salarioTotal() + "\n";
    }
}

//Ejercicio 42
class Producto2{
    String codigo;
    String nombre;
    double precioUnidad;

    public Producto2(String codigo, String nombre, double precioUnidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnidad = precioUnidad;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecioPorUnidad() {
        return precioUnidad;
    }
    public void setPrecioPorUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
}
class ProductoPerecedero extends Producto2 {
    private LocalDate fecha;

    public ProductoPerecedero(String codigo, String nombre, double precioUnidad, LocalDate fecha) {
        super(codigo, nombre, precioUnidad);
        this.fecha = fecha;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFechaCaducidad(LocalDate fecha) {
        this.fecha = fecha;
    }
    public double diasVencer() {
        LocalDate fechaActual = fecha;
        LocalDate fechaCaducidad = LocalDate.of(2024, 07, 31);
        Period periodo = Period.between(fechaActual, fechaCaducidad);
        long diasRestantes = periodo.getDays();
        return diasRestantes;
    }
    public double precioDescuento(){
        double dcto = 0;
        if (diasVencer() <= 5 ) {
            dcto = precioUnidad * 0.2;          
        }else{
            dcto = 0;
        }
        double precioDes = precioUnidad - dcto;
        return precioDes;
    }
    public String toString() {
        return "Codigo del Producto: " + codigo + "\n" +  "Nombre: " + nombre + "\n" +  "Precio Unidad: " + precioUnidad +
                "\n" +  "Vence: " + fecha + "\n" + "Precio con Descuento por Vencimiento: " + precioDescuento() + "\n" ;
    }
}

//Ejercicio 43
class Cliente2{
    String nombre;
    String direccion;
    String telefono;

    public Cliente2(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }    
}
class ClienteFrecuente extends Cliente2 {
    int descuento;
    int numCompras;
    
    public ClienteFrecuente(String nombre, String direccion, String telefono, int descuento, int numCompras) {
        super(nombre, direccion, telefono);
        this.descuento = descuento;
        this.numCompras = numCompras;
    }
    public int getDescuento() {
        return descuento;
    }
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    public int getNumCompras() {
        return numCompras;
    }
    public void setNumCompras(int numCompras) {
        this.numCompras = numCompras;
    }
    public String toString() {
        return "Cliente: " + nombre + "\n" +  "Direccion : " + direccion + "\n" +  "Telefono: " + telefono + "\n" + 
                "Descuento : " + descuento + "%" + "\n"+ "Numero de Compras: " + numCompras + "\n";
    }
}

//Ejercicio 44
class Factura2{
    int numero;
    int subtotal;
    double iva;
    double total;

    public Factura2(int numero, int subtotal) {
        this.numero = numero;
        this.subtotal = subtotal;
        this.iva = calcularIva();
        this.total = calcularTotal();
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
    public double calcularIva() {
        return subtotal * 0.19;
    }
    public double getIva() {
        return iva;
    }
    public double calcularTotal() {
        return subtotal + calcularIva();
    }
    public double setTotal() {
        return total; 
    }     
}
class FacturaConDescuento extends Factura2 {
    double descuento;
    double totalconDescuento;
    
    public FacturaConDescuento(int numero, int subtotal, double descuento) {
        super(numero, subtotal);
        this.descuento = descuento;
        this.totalconDescuento = totalconDescuento();
    }
    public double descuento() {
        return (descuento / 100) * calcularTotal();
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento){
        this.descuento = descuento;
    }
    public double totalconDescuento() {
        return calcularTotal() - descuento();
    }
    public double getTotalconDescuento() {
        return totalconDescuento;
    }
    public void setTotalconDescuento(double totalconDescuento){
        this.totalconDescuento = totalconDescuento;
    }
    public String toString() {
        return "Numero de Factura: " + numero + "\n" +  "Subtotal : " + subtotal + "\n" +  "Iva: " + calcularIva() + "\n" + 
                "Total : " + calcularTotal() + "\n"+ "Descuento: " + descuento() + "\n" + "Total Con Descuento: " + totalconDescuento()+ "\n";
    }
}

//Ejercicio 45
class Pedido2{
    int numero;
    String nombre;
    int cantidad;
    int precioUni;
    int total;

    public Pedido2(int numero, String nombre, int cantidad, int precioUni) {
        this.numero = numero;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUni = precioUni;
        this.total = calcularTotal();
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getPrecioUni() {
        return precioUni;
    }
    public void setPrecioUni(int precioUni) {
        this.precioUni = precioUni;
    }
    public int calcularTotal() {
        return cantidad * precioUni;
    }
    public int getTotal() {
        return total;
    }
}
class PedidoExpress extends Pedido2 {
    int envio;
    int dias;
    int totalconEnvio;
    
    public PedidoExpress(int numero, String nombre, int cantidad, int precioUni, int envio, int dias) {
        super(numero, nombre, cantidad, precioUni);
        this.envio = envio;
        this.dias = dias;
        this.totalconEnvio = calculoconEnvio();
    }
    public int getDescuento() {
        return envio;
    }
    public void setDescuento(int envio){
        this.envio = envio;
    }
    public int getDias() {
        return dias;
    }
    public void setDias(int dias){
        this.dias = dias;
    }
    public int calculoconEnvio() {
        return calcularTotal() + envio;
    }
    public double getTotalconEnvio() {
        return totalconEnvio;
    }
    public String toString() {
        return "Numero: " + numero + "\n" +  "Cliente : " + nombre + "\n" +  "Cantidad de Articulos: " + cantidad + "\n" + 
                "Precio por Articulo : " + precioUni + "\n"+ "Precio Total: " + calcularTotal() + "\n"
                + "Costo de Envio: " + envio + "\n" + "Tiempo de Entrega: " + dias + "dias" + "\n"  + "Precio con Envio: " + calculoconEnvio() + "\n" ;
    }
}

//Ejercicio 46
class Inversion{
    int codigo;
    String nombre;
    int monto;
    int interesAnual;
    double interesGenerado;

    public Inversion(int codigo, String nombre, int monto, int interesAnual) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.monto = monto;
        this.interesAnual = interesAnual;
        this.interesGenerado = calcularInteresGenerado();
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getMonto() {
        return monto;
    }
    public void setMonto(int monto) {
        this.monto = monto;
    }
    public int getInteresAnual() {
        return interesAnual;
    }
    public void setInteresAnual(int interesAnual) {
        this.interesAnual = interesAnual;
    }
    public double calcularInteresGenerado() {
        return monto * (interesAnual / 100.0);
    }
    public double getInteresGenerado() {
        return interesGenerado;
    }
}
class InversionRiesgo extends Inversion {
    String riesgo;
    double ganancia;   
    public InversionRiesgo(int codigo, String nombre, int monto, int interesAnual, String riesgo) {
        super(codigo, nombre, monto, interesAnual);
        this.riesgo = riesgo;
        this.ganancia = calculoGanancia();
    }
    public String getRiesgo() {
        return riesgo;
    }
    public void setRiesgo(String riesgo){
        this.riesgo = riesgo;
    }
    public double calculoGanancia() {
        double ganar = 0;
        if (riesgo.equals("Alto")) {
            ganar = calcularInteresGenerado() * 2;
        }else if (riesgo.equals("Medio")) {
            ganar = calcularInteresGenerado() * 1.5;
        }else if (riesgo.equals("Bajo")) {
            ganar = calcularInteresGenerado() * 1;
        }
        return ganar;
    }
    public double getGanacia() {
        return ganancia;
    }
    public String toString() {
        return "Codigo de Inversion: " + codigo + "\n" +  "Inversor : " + nombre + "\n" +  "Monto Inicial: " + monto + "\n" + 
                "Tasa de Interes Anual : " + interesAnual + "\n"+ "interes Generado: " + calcularInteresGenerado()+ "\n"
                + "Nivel de Riesgo: " + riesgo + "\n" + "Potencial de Ganancia: " + calculoGanancia() + "\n" ;
    }
}

//Ejercicio 47
class ProductoAlmacen{
    int codigo;
    String nombre;
    int cantidad;
    int precio;
    int total;

    public ProductoAlmacen(int codigo, String nombre, int cantidad, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = calcularTotal();
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int calcularTotal() {
        return cantidad * precio;
    }
    public int getTotal() {
        return total;
    }
}
class ProductoFragil extends ProductoAlmacen {
    String fragil;
    int costoAdicional;   
    public ProductoFragil(int codigo, String nombre, int cantidad, int precio, String fragil) {
        super(codigo, nombre, cantidad, precio);
        this.fragil = fragil;
        this.costoAdicional = calcularTotal();
    }
    public String getFragil() {
        return fragil;
    }
    public void setFragil(String fragil){
        this.fragil = fragil;
    }
    public double calculoAdicional() {
        double adicion = 0;
        if (fragil.equals("Alto")) {
            adicion =  calcularTotal() * 0.2;
        }else if (fragil.equals("Medio")) {
            adicion = 0;
        }else if (fragil.equals("Bajo")) {
            adicion = 0;
        }
        return adicion;
    }
    public int getCostoAdicional() {
        return costoAdicional;
    }
    public String toString() {
        return "Codigo del Producto: " + codigo + "\n" +  "Nombre : " + nombre + "\n" +  "Cantidad en Almacen: " + cantidad + "\n" + 
                "Precio por Unidad: " + precio + "\n"+ "Valor de Almacen: " + calcularTotal()+ "\n"
                + "Nivel de fragilidad: " + fragil + "\n" + "Costo Adicional: " + calculoAdicional()+ "\n" ;
    }
}

//Ejercicio 48
class Servicio2{
    int codigo;
    String descripcion;
    int horas;
    int precio;
    int total;

    public Servicio2(int codigo, String descripcion, int horas, int precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.horas = horas;
        this.precio = precio;
        this.total = calculoTotal();
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int calculoTotal() {
        return horas * precio;
    }
    public int getTotal() {
        return total;
    }
}
class ServicioUrgente extends Servicio2 {
    double recargo;
    double totalconRecargo;   
    public ServicioUrgente(int codigo, String descripcion, int horas, int precio) {
        super(codigo, descripcion, horas, precio);
        this.recargo = calculoRecargo();
        this.totalconRecargo = calculoPrecioFin();
    }
    public double calculoRecargo() {
        return calculoTotal() * 0.25;
    }
    public double getRecargo(){
        return recargo;
    }
    public double calculoPrecioFin() {       
        return calculoTotal() + calculoRecargo();
    }
    public double getTotalconRecargo() {
        return totalconRecargo;
    }
    public String toString() {
        return "Codigo del Servicio: " + codigo + "\n" +  "Descripcion : " + descripcion + "\n" +  "Horas Trabajadas : " + horas + "\n" + 
                "Precio por Hora: " + precio + "\n"+ "Precio Total: " + calculoTotal()+ "\n"
                + "Recargo por Urgencia: " + calculoRecargo() + "\n" + "Precio Total con Recargo: " + calculoPrecioFin()+ "\n" ;
    }
}

//Ejercicio 49
class Compra2{
    int codigo;
    String proveedor;
    int cantidad;
    int precio;
    int total;

    public Compra2(int codigo, String proveedor, int cantidad, int precio) {
        this.codigo = codigo;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = calculoPrecioTotal();
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getProveedor() {
        return proveedor;
    }
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int calculoPrecioTotal() {
        return cantidad * precio;
    }
    public int getTotal() {
        return total;
    }
}
class CompraInternacional extends Compra2 {
    double impuesto;
    double totalconImpuesto;   
    public CompraInternacional(int codigo, String proveedor, int cantidad, int precio) {
        super(codigo, proveedor, cantidad, precio);
        this.impuesto = calculoImpuesto();
        this.totalconImpuesto = calculoTotalFin();
    }
    public double calculoImpuesto() {
        return calculoPrecioTotal() * 0.15;
    }
    public double getImpuesto(){
        return impuesto;
    }
    public double calculoTotalFin() {       
        return calculoPrecioTotal() + calculoImpuesto();
    }
    public double getTotalconImpuesto() {
        return totalconImpuesto;
    }
    public String toString() {
        return "Numero de compra: " + codigo + "\n" +  "Proveedor : " + proveedor + "\n" +  "Cantidad: " + cantidad + "\n" + 
                "Precio por Producto: " + precio + "\n"+ "Precio Total: " + calculoPrecioTotal()+ "\n"
                + "Impuesto de Importacion: " + calculoImpuesto()+ "\n" + "Precio Total con Impuesto: " + calculoTotalFin()+ "\n" ;
    }
}

//Ejercicio 50
class Empleado3{
    String nombre;
    int salario;
    
    public Empleado3(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getSalario(){
        return salario;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }
}
class Vendedor3 extends Empleado3{
    int comision;
    int total;
    public Vendedor3(String nombre, int salario, int comision){
        super(nombre, salario);
        this.comision = comision;
        this.total = total();
    }
    public int getComsion(){
        return comision;
    }
    public void setComision(int comision){
        this.comision = comision;
    }
    public int total(){
        return salario + comision;
    }
    public int getTotal(){
        return total;
    }
    public String toString(){
        return "Empleado: " + nombre + "\n" + "Salario Base: " + salario + "\n" +"Comision por Ventas: " + comision +
               "\n" + "Salario Total: " + total()+"\n" ;
                
    }
}

//Ejercicio 51
class Vehiculo{
    String marca;
    String modelo;
    int anio;
    
    public Vehiculo(String marca, String modelo,int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getAnio(){
        return anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public String toString(){
        return "Marca: " + marca + "Modelo: " + modelo + "Anio: " + anio; 
    }
}
//1
class Terrestre extends Vehiculo{
    int fuerza;
    public Terrestre(String marca, String modelo,int anio, int fuerza) {
        super(marca, modelo, anio);
        this.fuerza = fuerza;
    }
    public int getFuerza(){
        return fuerza;
    }
    public void setFuerza(int fuerza){
        this.fuerza = fuerza;
    }
}
//2
class Aereo extends Vehiculo{
    int capacidad;
    public Aereo(String marca, String modelo,int anio, int capacidad) {
        super(marca, modelo, anio);
        this.capacidad = capacidad;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
}
//1.1
class Automovil extends Terrestre{
    String motor;
    public Automovil(String marca, String modelo, int anio, int fuerza, String motor) {
        super(marca, modelo, anio, fuerza);
        this.motor = motor;
    }
    public String getMotor(){
        return motor;
    }
    public void setMotor(String motor){
        this.motor = motor;
    }
}
//1.2
class Motocicleta extends Terrestre{
    int cilindraje;
    public Motocicleta(String marca, String modelo, int anio, int fuerza, int cilindraje) {
        super(marca, modelo, anio, fuerza);
    }
    public int getCilindraje(){
        return cilindraje;
    }
    public void setCilindraje(int cilindraje){
        this.cilindraje = cilindraje;
    }
}
//2.1
class Avion extends Aereo{
    String tamanio;
    public Avion(String marca, String modelo, int anio, int capacidad,String tamanio) {
        super(marca, modelo, anio, capacidad);
        this.tamanio = tamanio;
    }
    public String getTamanio(){
        return tamanio;
    }
    public void setTamanio(String tamanio){
        this.tamanio = tamanio;
    }
}
//2.2
class Helicoptero extends Aereo{
    int alcance;
    public Helicoptero(String marca, String modelo, int anio, int capacidad, int alcance) {
        super(marca, modelo, anio, capacidad);
    }  
    public int getCilindraje(){
        return alcance;
    }
    public void setCilindraje(int alcance){
        this.alcance = alcance;
    }
}
//1.1.1
class Sedan extends Automovil{
    public Sedan(String marca, String modelo, int anio, int fuerza, String motor) {
        super(marca, modelo, anio, fuerza, motor);
    }
    public String toString(){
        return "Auto Sedan" + "\n" + "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Anio: " + anio + "\n" + "Caballos de Fuerza: " +
               fuerza + "\n" + "Motor: " + motor + "\n" ;
    }   
}
//1.1.2
class SUV extends Automovil{
    public SUV(String marca, String modelo, int anio, int fuerza, String motor) {
        super(marca, modelo, anio, fuerza, motor);
    }
    public String toString(){
        return "Auto SUV" + "\n" + "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Anio: " + anio + "\n" + "Caballos de Fuerza: " +
               fuerza + "\n" + "Motor: " + motor + "\n" ;
    }   
}
//1.2.1
class Deportiva extends Motocicleta{   
    public Deportiva(String marca, String modelo, int anio, int fuerza, int cilindraje) {
        super(marca, modelo, anio, fuerza, cilindraje);
    }
    public String toString(){
        return "Moto Deportiva" + "\n" + "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Anio: " + anio + "\n" + "Caballos de Fuerza: " +
               fuerza + "\n" + "Cilindraje: " + cilindraje + "\n" ;
    }  
}
//1.2.2
class Turismo extends Motocicleta{   
    public Turismo(String marca, String modelo, int anio, int fuerza, int cilindraje) {
        super(marca, modelo, anio, fuerza, cilindraje);
    }
    public String toString(){
        return "Moto Turistica" + "\n" + "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Anio: " + anio + "\n" + "Caballos de Fuerza: " +
                fuerza + "\n" + "Cilindraje: " + cilindraje + "\n" ;
    }  
}
//2.1.1
class Comercial extends Avion{   
    public Comercial(String marca, String modelo, int anio, int capacidad, String tamanio) {
        super(marca, modelo, anio, capacidad, tamanio);
    }
    public String toString(){
        return "Avion Comercial" + "\n" + "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Anio: " + anio + "\n" + "Capacidad Pasajeros: " +
                capacidad + "\n" + "Tamanio: " + tamanio + "\n" ;
    }  
}
//2.1.2
class Privado extends Avion{   
    public Privado(String marca, String modelo, int anio, int capacidad, String tamanio) {
        super(marca, modelo, anio, capacidad, tamanio);
    }
    public String toString(){
        return "Avion Privado" + "\n" + "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Anio: " + anio + "\n" + "Capacidad Pasajeros: " +
                capacidad + "\n" + "Tamanio: " + tamanio + "\n" ;
    }  
}
//2.2.1
class Militar extends Helicoptero{   
    public Militar(String marca, String modelo, int anio, int capacidad, int alcance) {
        super(marca, modelo, anio, capacidad, alcance);
    }
    public String toString(){
        return "Helicoptero Militar" + "\n" + "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Anio: " + anio + "\n" + "Capacidad Pasajeros: " +
                capacidad + "\n" + "Alcance(Km): " + alcance + "\n" ;
    }
}
//2.2.1
class Civil extends Helicoptero{   
    public Civil(String marca, String modelo, int anio, int capacidad, int alcance) {
        super(marca, modelo, anio, capacidad, alcance);
    }
    public String toString(){
        return "Helicoptero Civil" + "\n" + "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Anio: " + anio + "\n" + "Capacidad Pasajeros: " +
                capacidad + "\n" + "Alcance(Km): " + alcance + "\n" ;
    }
}

