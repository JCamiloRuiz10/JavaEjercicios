
package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio_POO {
    public static void main(String[] args) throws ParseException {
//        //Ejercicio 1
//        Libro lbr = new Libro("122423", "El Principito", " Antoine de Saint-Exupéry", true);
//        lbr.imprimirInformacion();
//
//        //Ejercicio 2   
//        Estudiante est = new Estudiante("Juan", 20, "ADSO", 90);
//        est.imprimirEstudiante();
//
//        //Ejercicio 3
//        Empleado empl = new Empleado("Camilo", "Programador", 30000000, 5);
//        empl.imprimirEmpleado();
//
//        //Ejercicio 4
//        Producto prodct = new Producto(034, "Manzana", 1000, 36);
//        prodct.imprimirProducto();
//
//        //Ejercicio 5
//        Coche coche = new Coche("Ford", "Max 200", 2024, 50000);
//        coche.imprimirCoche();
//
//        //Ejercicio 6
//        Cliente cliente = new Cliente("Jose", "Cra-12, cll-11", "32198764567", "jose@gmail.com");
//        cliente.imprimirCliente();
//
//        //Ejercicio 7
//        Paciente paciente = new Paciente("Ana", 34, "Gripa", "Julio");
//        paciente.imprimirPaciente();
//
//        //Ejwrcicio 8
//       Curso curso = new Curso("Sistemas", "2809", 3, "Carlos Gil");
//       curso.imprimirCurso();
//
//        //Ejercicio 9
//        Pedido pedido = new Pedido("TRY655", "PIZZA", 2, 50000);
//        pedido.imprimirPedido();
//
//        //Ejercicio 10
//        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
//        Date fecha = formatoFecha.parse("2024-08-11");
//        Evento evento = new Evento("Cumpleanios", fecha, "Paipa", 98);
//        evento.imprimirEvento();
//
//        //Ejercicio 11
//        Pelicula pelicula1 = new Pelicula("El Hobbit", "Peter Jackson", 2012, "Aventura");
//        Pelicula pelicula2 = new Pelicula("Titanic", "James Cameron", 1997, "Romance");
//        System.out.println(pelicula1);
//        System.out.println(pelicula2);
//
//        //Ejercicio 12
//        Restaurante restaurante1 = new Restaurante("Lena Verde", "Cll20-Cra10", "Asadero", 8);
//        Restaurante restaurante2 = new Restaurante("Chefsito", "Cll22-Cra15", "Integral", 7);
//        System.out.println(restaurante1);
//        System.out.println(restaurante2);
//
//        //Ejercicio 13
//        Persona persona1 = new Persona("Ana", "Gonzales", "cll20-cr3", 34);
//        Persona persona2 = new Persona("John", "Becerra", "cll19-cra21", 42);
//        System.out.println(persona1);
//        System.out.println(persona2);
//
//        //Ejercicio 14
//        Orden orden1 = new Orden(01, "2024-07-24", "Luis Baron", 45000);
//        Orden orden2 = new Orden(02, "2024-07-24", "Maria Ruiz", 32000);
//        System.out.println(orden1);
//        System.out.println(orden2);
//
//        //Ejercicio 15
//        Mascota mascota1 = new Mascota("Lucas", "Perro", 5, "Lorena Pineda");
//        Mascota mascota2 = new Mascota("Mapi", "Gato", 2, "Samuel Corredor");
//        System.out.println(mascota1);
//        System.out.println(mascota2);
//
//        //Ejercicio 16
//        Proovedor proovedor1 = new Proovedor("Miguel Perez", "Muebles SA", "324567434", "miguel@gmail.com");
//        Proovedor proovedor2 = new Proovedor("Camilo Ruiz", "JC SA", "3112353567", "jc@gmail.com");
//        System.out.println(proovedor1);
//        System.out.println(proovedor2);
//
//        //Ejercicio 17
//        Factura factura1 = new Factura(102, "2024-04-22", "Hector Fonseca", 124000);
//        Factura factura2 = new Factura(243, "2024-09-21", "Mercedez Cajica", 97000);
//        System.out.println(factura1);
//        System.out.println(factura2);
//
//        //Ejercicio 18
//        Universidad uni1 = new Universidad("Los Andes", "cra21-cll20", 567, 32);
//        Universidad uni2 = new Universidad("UPTC", "cra09-cll.12", 743, 11);
//        System.out.println(uni1);
//        System.out.println(uni2);
//
//        //Ejercicio 19
//        Juego juego1 = new Juego("FIFA", "Play Store", 2008, "Deporte");
//        Juego juego2 = new Juego("Free Fire", "Play Store", 2015, "Accion");
//        System.out.println(juego1);
//        System.out.println(juego2);
//
//        //Ejercicio 20
//        Hotel hotel1 = new Hotel("Estelar", "cra15-cll22", 200, 5);
//        Hotel hotel2 = new Hotel("Colsubsidio", "cra15-cll21", 100, 4);
//        System.out.println(hotel1);
//        System.out.println(hotel2);
//
//        //Ejercicio 21
//        Venta venta1 = new Venta("Carne", 3, 11000);
//        Venta venta2 = new Venta("Papas", 3, 8000);
//        System.out.println(venta1);
//        System.out.println(venta2);
//
//        //Ejercicio 22
//        Empleado2 empleado1 = new Empleado2("Belen Pacheco", 30, 6000);
//        Empleado2 empleado2 = new Empleado2("Nicolas Preciado", 36, 6500);
//        System.out.println(empleado1);
//        System.out.println(empleado2);
//
//        //Ejercicio 23
//        ProductoInventario producto1 = new ProductoInventario("123ER", "Teclado", 24, 50000);
//        ProductoInventario producto2 = new ProductoInventario("453TY", "Mouse", 56, 30000);
//        System.out.println(producto1);
//        System.out.println(producto2);
//
//        //Ejercicio 24
//        Factura2 factura21 = new Factura2(231, "2024-03-04", 10000);
//        Factura2 factura22 = new Factura2(456, "2024-09-22", 5500);
//        System.out.println(factura21);
//        System.out.println(factura22);
//
//        //Ejercicio 25
//        Pedido2 pedido1 = new Pedido2(23, "Natalia Caceres", 3, 19000);
//        Pedido2 pedido2 = new Pedido2(12, "Jonatan Espinosa", 5, 6700);
//        System.out.println(pedido1);
//        System.out.println(pedido2);
//
//        //Ejercicio 26
//        Inversion inversion1 = new Inversion("KJ56", "Maikol Gil",100000, 0.01);
//        Inversion inversion2 = new Inversion("JK90", "Brenda Carrasco",300000, 0.01);
//        System.out.println(inversion1);
//        System.out.println(inversion2);
//
//        //Ejercicio27
//        ProductoAlmacen productoA1 = new ProductoAlmacen("TY76", "Camisas", 96, 100000);
//        ProductoAlmacen productoA2 = new ProductoAlmacen("KL21", "Pantalon", 86, 200000);
//        System.out.println(productoA1);
//        System.out.println(productoA2);
//
//        //Ejercicio 28
//        Pago pago1 = new Pago(01, "Luis Cardozo", 1500000, 200000, 50000);
//        Pago pago2 = new Pago(02, "Juan Ruiz", 30000000, 2000000, 450000);
//        System.out.println(pago1);
//        System.out.println(pago2);
//
//        //Ejercicio 29
//        Servicio servicio1 = new Servicio(" IU21", "Mantenimiento vehiculo", 8000, 20);
//        Servicio servicio2 = new Servicio(" YT67", "Pintar casa", 7000, 4);
//        System.out.println(servicio1);
//        System.out.println(servicio2);

        //Ejercicio 30
        Compra compra1 = new Compra("KL86", "SanTiago Rincon", 4, 29000);
        Compra compra2 = new Compra("RT65", "Saniago Rincon", 4, 29000);
        System.out.println(compra1);
        System.out.println(compra2);
    }   
}
//Ejercicio 1
class Libro {
    public String ISBN;
    public String titulo;
    public String autor;
    public boolean disponible;
    // Constructor
    public Libro(String ISBN, String titulo, String autor, boolean disponible) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }
    // Método para imprimir los atributos
    public void imprimirInformacion() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + disponible);
    }
}
//Ejercicio 2
class Estudiante{
    public String nombre;
    public int edad;
    public String carrera;
    public double promedio;
    
    public Estudiante(String nombre, int edad, String carrera, double promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;      
    }
    public void imprimirEstudiante(){
        System.out.println("Nombre: " + nombre); 
        System.out.println("Edad: " + edad); 
        System.out.println("Carrera: " + carrera); 
        System.out.println("Promedio: " + promedio); 
    }
}

//Ejercicio 3
class Empleado{
    public String nombre;
    public String puesto;
    public int salario;
    public int antiguo;
    
    public Empleado(String nombre, String puesto,int salario, int antiguo){
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.antiguo = antiguo; 
    }
    public void imprimirEmpleado(){
        System.out.println("Nombre: " + nombre); 
        System.out.println("Puesto: " + puesto); 
        System.out.println("Salario: $" + salario); 
        System.out.println("Antigüedad: " + antiguo + " anios"); 
    }
}

//Ejercicio 4
class Producto{   
    public int codigo;
    public String nombre;
    public int precio;
    public int stock;
    
    public Producto( int codigo, String nombre,int precio, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;     
    }
    public void imprimirProducto(){
        System.out.println("Codigo: " + codigo); 
        System.out.println("Nombre: " + nombre); 
        System.out.println("Precio: $" + precio); 
        System.out.println("Stock: " + stock);
    }
}

//Ejercicio 5
class Coche{
    public String marca;
    public String modelo;
    public int anio;
    public int precio;
    
    public Coche(String marca, String modelo,int anio, int precio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio; 
    }
    public void imprimirCoche(){
        System.out.println("Marca: " + marca); 
        System.out.println("Modelo: " + modelo); 
        System.out.println("Anio: " + anio); 
        System.out.println("Precio: $" + precio); 
    }
}

//Ejercicio 6
class Cliente {
    public String nombre;
    public String direccion;
    public String telefono;
    public String email;

    public Cliente(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    public void imprimirCliente() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Email: " + email);
    }
}

//Ejercicio 7
class Paciente {
    public String nombre;
    public int edad;
    public String enfermedad;
    public String doctor;
   
    public Paciente(String nombre, int edad, String enfermedad, String doctor) {
        this.nombre = nombre;
        this.edad = edad;
        this.enfermedad = enfermedad;
        this.doctor = doctor;
    }
    public void imprimirPaciente() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Enfermedad: " + enfermedad);
        System.out.println("Doctor: " + doctor);
    }
}

//Ejercicio 8
class Curso {
    public String nombre;
    public String codigo;
    public int creditos;
    public String profesor;

    public Curso(String nombre, String codigo, int creditos, String profesor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.profesor = profesor;
    }
    public void imprimirCurso() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Creditos: " + creditos);
        System.out.println("Profesor: " + profesor);
    }
}

//Ejercicio 9
class Pedido{
    public String codigo;
    public String producto;
    public int cantidad;
    public int precio;
    
    public Pedido(String codigo, String producto,int cantidad, int precio){
        this.codigo = codigo;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio; 
    }
    public void imprimirPedido(){
        System.out.println("Codigo del Pedido: " + codigo); 
        System.out.println("Producto: " + producto); 
        System.out.println("Cantidad: " + cantidad); 
        System.out.println("Precio Total: $" + precio); 
    }           
}

//Ejercicio 10
class Evento{
    public String nombre;
    public Date fecha;
    public String lugar;
    public int asistentes;
    
    public Evento(String nombre, Date fecha, String lugar, int asistentes){
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.asistentes = asistentes; 
    }
    public void imprimirEvento(){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Nombre: " + nombre); 
        System.out.println("Fecha: " + formatoFecha.format(fecha)); 
        System.out.println("Lugar: " + lugar); 
        System.out.println("Asistentes: " + asistentes); 
    }     
}

//Ejercicio 11
class Pelicula {
    public String titulo;
    public String director;
    public int anio;
    public String genero;

    public Pelicula(String titulo, String director, int anio, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.genero = genero;
    }
    // Getters
    public String getTitulo() {
        return titulo;
    }
    public String getDirector() {
        return director;
    }
    public int getAnio() {
        return anio;
    }
    public String getGenero() {
        return genero;
    }
    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    // Metodo toString
    public String toString() {
        return "Titulo: " + titulo + "\n" + "Director: " + director + "\n" + "Anio: " + anio +"\n" +  "Genero: " + genero + "\n";
    }
}

//Ejercicio 12
class Restaurante{
    public String nombre;
    public String direccion;
    public String tipoCocina;
    public int calificacion;
    
    public Restaurante(String nombre, String direccion, String tipoCocina, int calificacion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoCocina = tipoCocina;
        this.calificacion = calificacion;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getnTipoCocina(){
        return tipoCocina;
    }
    public int getCalificacion(){
        return calificacion;
    }
    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    public void setDireccion( String direccion){
        this.direccion = direccion;
    }
    public void setTipoCocina( String tipoCocina){
        this.tipoCocina = tipoCocina;
    }
    public void setCalificacion( int calificacion){
        this.calificacion = calificacion;
    }
    public String toString(){
        return "Restaurante: " + nombre + "\n" + "Direccion: " + direccion + "\n" + "Tipo de Cocina: " + tipoCocina +"\n" +  "Calificacion: " + calificacion + "\n";
    }
}

//Ejercicio 13
class Persona{
    public String nombre;
    public String apellido;
    public String direccion;
    public int edad;
    
    public Persona(String nombre, String apellido, String direccion, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getnDireccion(){
        return direccion;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    public void setApellido( String apellido){
        this.apellido = apellido;
    }
    public void setDireccion( String direccion){
        this.direccion = direccion;
    }
    public void setEdad( int edad){
        this.edad = edad;
    }
    public String toString(){
        return "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Direccion: " + direccion +"\n" +  "Edad: " + edad + "\n";
    }
}

//Ejercicio 14
class Orden{
    public int numero;
    public String fecha;
    public String cliente;
    public int monto;
    
    public Orden(int numero, String fecha, String cliente, int monto){
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.monto = monto;
    }
    public int getNumero(){
        return numero;
    }
    public String getFecha(){
        return fecha;
    }
    public String getCliente(){
        return cliente;
    }
    public int getMonto(){
        return monto;
    }
    public void setNumero( int numero){
        this.numero = numero;
    }
    public void setFecha( String fecha){
        this.fecha = fecha;
    }
    public void setCliente( String cliente){
        this.cliente = cliente;
    }
    public void setMonto( int monto){
        this.monto = monto;
    }
    public String toString(){
        return "Numero de Orden: " + numero + "\n" + "Fecha: " + fecha + "\n" + "Cliente: " + cliente +"\n" +  "Monto Total: " + monto + "\n";
    }
}

//Ejercicio 15
class Mascota{
    public String nombre;
    public String tipo;
    public int edad;
    public String dueno;
    
    public Mascota(String nombre, String tipo, int edad, String dueno){
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.dueno = dueno;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public int getEdad(){
        return edad;
    }
    public String getDueno(){
        return dueno;
    }
    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    public void setTipo( String tipo){
        this.tipo = tipo;
    }
    public void setEdad( int edad){
        this.edad = edad;
    }
    public void setDueno( String dueno){
        this.dueno = dueno;
    }
    public String toString(){
        return "Nombre: " + nombre + "\n" + "Tipo: " + tipo + "\n" + "Edad: " + edad + " anios" + "\n" +  "Dueno: " + dueno + "\n";
    }
}

//Ejercicio 16
class Proovedor{
    public String nombre;
    public String empresa;
    public String telefono;
    public String email;
    
    public Proovedor(String nombre, String empresa, String telefono, String email){
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
        this.email = email;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEmpresa(){
        return empresa;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getEmail(){
        return email;
    }
    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    public void setEmpresa( String empresa){
        this.empresa = empresa;
    }
    public void setTelefono( String direccion){
        this.telefono = direccion;
    }
    public void setEmail( String email){
        this.email = email;
    }
    public String toString(){
        return "Nombre: " + nombre + "\n" + "Empresa: " + empresa + "\n" + "Telefono: " + telefono +"\n" +  "Email: " + email + "\n";
    }
}

//Ejercicio 17
class Factura{
    public int numero;
    public String fecha;
    public String cliente;
    public int importe;
    
    public Factura(int numero, String fecha, String cliente, int importe){
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.importe = importe;
    }
    public int getNumero(){
        return numero;
    }
    public String getFecha(){
        return fecha;
    }
    public String getCliente(){
        return cliente;
    }
    public int getImporte(){
        return importe;
    }
    public void setNumero( int numero){
        this.numero = numero;
    }
    public void setFecha( String fecha){
        this.fecha = fecha;
    }
    public void setCliente( String cliente){
        this.cliente = cliente;
    }
    public void setImporte( int importe){
        this.importe = importe;
    }
    public String toString(){
        return "Numero de Factura: " + numero + "\n" + "Fecha: " + fecha + "\n" + "Cliente: " + cliente +"\n" +  "Importe Total: " + importe + "\n";
    }
}

//Ejercicio 18
class Universidad{
    public String nombre;
    public String direccion;
    public int numero;
    public int ranking;
    
    public Universidad(String nombre, String direccion, int numero, int ranking){
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;
        this.ranking = ranking;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public int getNumero(){
        return numero;
    }
    public int getRanking(){
        return ranking;
    }
    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    public void setDireccion( String direccion){
        this.direccion = direccion;
    }
    public void setNumero( int numero){
        this.numero = numero;
    }
    public void setRanking( int ranking){
        this.ranking = ranking;
    }
    public String toString(){
        return "Universidad: " + nombre + "\n" + "Direccion: " + direccion + "\n" + "Numero de Estudiantes: " + numero +"\n" +  "Ranking: " + ranking + "\n";
    }
}

//Ejercico 19
class Juego{
    public String titulo;
    public String plataforma;
    public int anio;
    public String genero;
    
    public Juego(String titulo, String plataforma, int anio, String genero){
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.anio = anio;
        this.genero = genero;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getPlataforma(){
        return plataforma;
    }
    public int getAnio(){
        return anio;
    }
    public String getGenero(){
        return genero;
    }
    public void setTitulo( String titulo){
        this.titulo = titulo;
    }
    public void setPlataforma( String plataforma){
        this.plataforma = plataforma;
    }
    public void setAnio( int anio){
        this.anio = anio;
    }
    public void setGenero( String genero){
        this.genero = genero;
    }
    public String toString(){
        return "Titulo: " + titulo + "\n" + "Plataforma: " + plataforma + "\n" + "Anio de Lanzamiento: " + anio + " anios" + "\n" +  "Genero: " + genero + "\n";
    }
}

//Ejercicio 20
class Hotel{
    public String nombre;
    public String direccion;
    public int numero;
    public int estrellas;
    
    public Hotel(String nombre, String direccion, int numero, int estrellas){
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;
        this.estrellas = estrellas;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public int getNumero(){
        return numero;
    }
    public int getEstrellas(){
        return estrellas;
    }
    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    public void setDireccion( String direccion){
        this.direccion = direccion;
    }
    public void setNumero( int numero){
        this.numero = numero;
    }
    public void setEstrellas( int estrellas){
        this.estrellas = estrellas;
    }
    public String toString(){
        return "Hotel: " + nombre + "\n" + "Direccion: " + direccion + "\n" + "Numero de Habitaciones: " + numero +"\n" +  "Estrellas: " + estrellas + "\n";
    }
}

//Ejercicio 21
class Venta{
    public String nombre;
    public int cantidad;
    public int unidad;
    public int total;
    
    public Venta(String nombre, int cantidad, int unidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.total = cantidad * unidad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantidad(){
        return cantidad;
    }
    public int getUnidad(){
        return unidad;
    }
    public int getTotal(){
        return total;
    }
    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    public void setCantidad( int cantidad){
        this.cantidad = cantidad;
    }
    public void setUnidad( int unidad){
        this.unidad = unidad;
    }
    public void setTotal( int total){
        this.total = total;
    }
    public String toString(){
        return "Producto: " + nombre + "\n" + "Cantidad: " + cantidad + "\n" + "Precio Unitario: " + unidad +"\n" +  "Precio Total: " + total + "\n";
    }
}

//Ejercicio 22
class Empleado2{
    public String nombre;
    public int cantidad;
    public int pagoHora;
    public int total;
    
    public Empleado2(String nombre, int cantidad, int pagoHora){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.pagoHora = pagoHora;
        this.total = cantidad * pagoHora;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantidad(){
        return cantidad;
    }
    public int getUnidad(){
        return pagoHora;
    }
    public int getTotal(){
        return total;
    }
    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    public void setCantidad( int cantidad){
        this.cantidad = cantidad;
    }
    public void setUnidad( int pagoHora){
        this.pagoHora = pagoHora;
    }
    public void setTotal( int total){
        this.total = total;
    }
    public String toString(){
        return "Nombre: " + nombre + "\n" + "Cantidad de Horas: " + cantidad + "\n" + "Pago Hora: " + pagoHora +"\n" +  "Salario Total: " + total + "\n";
    }
}

//Ejercicio 23
class ProductoInventario{
    public String codigo;
    public String nombre;
    public int cantidad;
    public int precio;
    public int total;
    
    public ProductoInventario(String codigo, String nombre, int cantidad, int precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = cantidad * precio;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantidad(){
        return cantidad;
    }
    public int getUnidad(){
        return precio;
    }
    public int getTotal(){
        return total;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    public void setCantidad( int cantidad){
        this.cantidad = cantidad;
    }
    public void setUnidad( int precio){
        this.precio = precio;
    }
    public void setTotal( int total){
        this.total = total;
    }
    public String toString(){
        return "Codigo del Producto: " + codigo + "\n" +"Nombre: " + nombre + "\n" + "Cantidad en Stock: " + cantidad + "\n" + "Precio por Unidad: " + precio +"\n" +  "Valor Total en stock: " + total + "\n";
    }
}

//Ejercicio 24
class Factura2{
    public int numero;
    public String fecha;
    public int subtotal;
    public double iva;
    public double total;
    
    public Factura2(int numero, String fecha, int subtotal){
        this.numero = numero;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.iva = subtotal * 0.19;
        this.total = subtotal + iva;
    }
    public int getCodigo(){
        return numero;
    }
    public String getNombre(){
        return fecha;
    }
    public int getCantidad(){
        return subtotal;
    }
    public double getUnidad(){
        return iva;
    }
    public double getTotal(){
        return total;
    }
    public void setCodigo(int numero){
        this.numero = numero;
    }
    public void setNombre( String fecha){
        this.fecha = fecha;
    }
    public void setCantidad( int subtotal){
        this.subtotal = subtotal;
    }
    public void setUnidad( double iva){
        this.iva = iva;
    }
    public void setTotal( double total){
        this.total = total;
    }
    public String toString(){
        return "Numero de Factura: " + numero + "\n" +"Fecha: " + fecha + "\n" + "Subtotal: " + subtotal + "\n" + "IVA: " + iva +"\n" +  "Total: " + total + "\n";
    }
}

//Ejercicio 25
class Pedido2{
    public int numero;
    public String cliente;
    public int cantidad;
    public int precio;
    public int total;
    
    public Pedido2(int numero, String cliente, int cantidad, int precio){
        this.numero = numero;
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = cantidad * precio;
    }
    public int getNumero(){
        return numero;
    }
    public String getCliente(){
        return cliente;
    }
    public int getCantidad(){
        return cantidad;
    }
    public int getPrecio(){
        return precio;
    }
    public int getTotal(){
        return total;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setCliente( String cliente){
        this.cliente = cliente;
    }
    public void setCantidad( int cantidad){
        this.cantidad = cantidad;
    }
    public void setPrecio( int precio){
        this.precio = precio;
    }
    public void setTotal( int total){
        this.total = total;
    }
    public String toString(){
        return "Numero de Pedido: " + numero + "\n" +"Cliente: " + cliente + "\n" + "Cantidad de Articulos: " + cantidad + "\n" + "Precio por Articulo: " + precio +"\n" +  "Precio Total: " + total + "\n";
    }
}

//Ejercicio 26
class Inversion{
    public String codigo;
    public String inversor;
    public int monto;
    public double interes;
    public double total;
    
    public Inversion(String codigo, String inversor, int monto, double interes){
        this.codigo = codigo;
        this.inversor = inversor;
        this.monto = monto;
        this.interes = interes;
        this.total = monto * interes / 100;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getInversor(){
        return inversor;
    }
    public int getMonto(){
        return monto;
    }
    public double getInteres(){
        return interes;
    }
    public double getTotal(){
        return total;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setInversor( String inversor){
        this.inversor = inversor;
    }
    public void setMonto( int monto){
        this.monto = monto;
    }
    public void setInteres( double interes){
        this.interes = interes;
    }
    public void setTotal( double total){
        this.total = total;
    }
    public String toString(){
        return "Codigo de Inversion: " + codigo + "\n" +"Inversor: " + inversor + "\n" + "Monto inicial: " + monto + "\n" + "Tasa de interes anual: " + interes +"\n" +  "Interes Generado: " + total + "\n";
    }
}

//Ejercicio 27
class ProductoAlmacen{
    public String codigo;
    public String nombre;
    public int cantidad;
    public int precio;
    public int total;
    
    public ProductoAlmacen(String codigo, String nombre, int cantidad, int precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = cantidad * precio;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantidad(){
        return cantidad;
    }
    public int getUnidad(){
        return precio;
    }
    public int getTotal(){
        return total;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    public void setCantidad( int cantidad){
        this.cantidad = cantidad;
    }
    public void setUnidad( int precio){
        this.precio = precio;
    }
    public void setTotal( int total){
        this.total = total;
    }
    public String toString(){
        return "Codigo del Producto: " + codigo + "\n" +"Nombre: " + nombre + "\n" + "Cantidad en Almacen: " + cantidad + "\n" + "Precio por Unidad: " + precio +"\n" +  "Valor Total en Almacen: " + total + "\n";
    }
}

//Ejercicio 28
class Pago{
    public int numero;
    public String empleado;
    public int salario;
    public int bonificacion;
    public int deduccion;
    public int total;
    
    public Pago(int numero, String empleado, int salario, int bonificacion, int deduccion){
        this.numero = numero;
        this.empleado = empleado;
        this.salario = salario;
        this.bonificacion = bonificacion;
        this.deduccion = deduccion;
        this.total = salario + bonificacion - deduccion;
    }
    public int getNumero(){
        return numero;
    }
    public String getEmpleado(){
        return empleado;
    }
    public int getSalario(){
        return salario;
    }
    public int getBonificacion(){
        return bonificacion;
    }
    public int getDeduccion(){
        return deduccion;
    }
    public int getTotal(){
        return total;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setEmpleado( String empleado){
        this.empleado = empleado;
    }
    public void setSalario( int salario){
        this.salario = salario;
    }
    public void setBonificacion( int bonificacion){
        this.bonificacion = bonificacion;
    }
    public void setDuduccion(int deduccion){
        this.deduccion = deduccion;
    }
    public void setTotal( int total){
        this.total = total;
    }
    public String toString(){
        return "Numero de Pago: " + numero + "\n" +"Empleado: " + empleado + "\n" + "Salario Base: " + salario + "\n" + "Bonificacion: " + bonificacion +"\n" + "Deduccion: " + deduccion +"\n" + "Precio Total: " + total + "\n";
    }
}

//Ejercicio 29
class Servicio{
    public String codigo;
    public String descripcion;
    public int precio;
    public int horas;
    public int total;
    
    public Servicio(String codigo, String descripcion, int precio, int horas){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.horas = horas;
        this.total = precio * horas;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return descripcion;
    }
    public int getCantidad(){
        return precio;
    }
    public int getUnidad(){
        return horas;
    }
    public int getTotal(){
        return total;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setNombre( String descripcion){
        this.descripcion = descripcion;
    }
    public void setCantidad( int precio){
        this.precio = precio;
    }
    public void setUnidad( int horas){
        this.horas = horas;
    }
    public void setTotal( int total){
        this.total = total;
    }
    public String toString(){
        return "Codigo del Servicio: " + codigo + "\n" +"Descripcion: " + descripcion + "\n" + "Precio por Horas: " + precio + "\n" + "Horas Trabajadas: " + horas +"\n" +  "Precio Total " + total + "\n";
    }
}

//Ejercicio 30
class Compra{
    public String codigo;
    public String nombre;
    public int cantidad;
    public int precio;
    public int total;
    
    public Compra(String codigo, String nombre, int cantidad, int precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = cantidad * precio;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantidad(){
        return cantidad;
    }
    public int getUnidad(){
        return precio;
    }
    public int getTotal(){
        return total;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    public void setCantidad( int cantidad){
        this.cantidad = cantidad;
    }
    public void setUnidad( int precio){
        this.precio = precio;
    }
    public void setTotal( int total){
        this.total = total;
    }
    public String toString(){
        return "Numero de Compra: " + codigo + "\n" +"Comprador: " + nombre + "\n" + "Cantidad de Productos: " + cantidad + "\n" + "Precio por producto: " + precio +"\n" +  "Precio Total: " + total + "\n";
    }
}
