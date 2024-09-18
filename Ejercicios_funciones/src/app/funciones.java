
package app;

import javax.swing.JOptionPane;

//EJERCICIOS FUNCIONES
public class funciones {
    public static void main(String[] args) {
        
//        //Ejercicio 1
//        double salarioMensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario mensual: "));
//        double porcentajeRetencion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje de retencion en la fuente: "));
//        
//        double salarioAnual = sueldoAnual(salarioMensual);
//        double retencionSueldo = retencionSueldo(salarioAnual, porcentajeRetencion);
//        JOptionPane.showMessageDialog(null, "Su sueldo anual es: " + salarioAnual + " con una retencion de " + retencionSueldo);
        
//        //Ejercicio 2
//        int cantidadProducos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de productos a verificar: "));
//        for (int i = 0; i < cantidadProducos; i++) {
//            String producto = JOptionPane.showInputDialog("Ingrese el nombre del Producto");
//            int cantidadAhora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad actual del producto " + producto));
//            int cantidadMinima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la catidad minima de " + producto ));
//            boolean pedido = verificarCantidad(cantidadAhora, cantidadMinima);
//            if (pedido) {
//                int cantidadComprar = comprar(cantidadMinima, cantidadAhora);
//                JOptionPane.showMessageDialog(null, "Se necesita un pedido para " + producto + " de minimo " + cantidadComprar);
//            } else {
//                JOptionPane.showMessageDialog(null, "El Stock es suficiente " + producto);
//            }            
//        }
        
//        //Ejercicio 3
//        int costosMateriales  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los costos materiales: "));
//        int manoObra  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los costos de mano de obra: "));
//        int gastosGenerales  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los gastos generales: "));
//        int costoFinal = costoProduccion(costosMateriales, manoObra, gastosGenerales);
//        JOptionPane.showMessageDialog(null, "El costo total de la produccion es " + costoFinal);

//        //Ejercicio 4
//        int cantidadDepartamentos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de departamentos: "));
//        int mayor = 0; 
//        String ganador = "";
//        for (int i = 0; i < cantidadDepartamentos; i++) {
//            String nombreDepartamento = JOptionPane.showInputDialog("Ingrese el nombre del Departamento: ");
//            int ganancias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ganancias de este trimestre de " + nombreDepartamento));
//            boolean mejorTrimestre = mayorGanancia(ganancias, mayor);
//            if (mejorTrimestre) {
//                mayor = ganancias;
//                ganador =  (nombreDepartamento); 
//            }
//        }
//        JOptionPane.showMessageDialog(null, "El departamento con mejor rendimiento en este trimestre es " + ganador);   

//        //Ejercicio 5
//        double valorInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor inicial del activo"));
//        double valorResidual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor residual del activo"));
//        double anios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los anios de vida util del activo"));
//        double depreciacionAnio = depreciacionAnual(valorInicial, valorResidual, anios);
//        JOptionPane.showMessageDialog(null, "La depreciacion anual del Activo es $" + depreciacionAnio); 

//        //Ejercicio 6
//        double capitalInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el capital inicial "));
//        double interes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el interes anual (%) "));
//        int anios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de anios "));
//        double valorFin = calcularRentabilidad(capitalInicial, interes, anios);
//        JOptionPane.showMessageDialog(null, "E l valor futuro de la inversion es $" + valorFin);

//        //Ejercicio 7
//        int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de empleados: "));
//        int suma = 0;
//        for (int i = 0; i < empleados; i++) {
//            String nombres = JOptionPane.showInputDialog("Ingrese el nombre ");
//            int horasExtras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de horas extras de " + nombres));
//            suma += horasExtras;
//        }       
//        JOptionPane.showMessageDialog(null, "El numerototal de horas extras es "  + suma);

//        //Ejercicio 8
//        int costoMateriales  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los costos materiales: "));
//        int manodeObra  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los costos de mano de obra: "));
//        int equipos  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los costos de equipos: "));
//        int costoFin = costoProduccion(costoMateriales, manodeObra, equipos);
//        JOptionPane.showMessageDialog(null, "El costo total del Proyecto de construccion es " + costoFin);

//        //Ejercicio 9
//        int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de empleados: "));
//        int suma = 0;
//        for (int i = 0; i < empleados; i++) {
//            String nombre = JOptionPane.showInputDialog("Ingrese su nombre ");
//            int horasTrabajo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas Trabajadas " + nombre));
//            int pagoHora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su pago por hora " + nombre));
//            int pagos = calculoPago(horasTrabajo, pagoHora);
//            suma += pagos;
//        }       
//        JOptionPane.showMessageDialog(null, "El pago total de la nomina es "  + suma);

//        //Ejercicio 10
//        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia para la entrega (Km) " ));
//        double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad promedio (Km/h) " ));
//        double tiempo = calculoTiempo(distancia, velocidad);
//        JOptionPane.showMessageDialog(null, "El tempo estimado en la entrega fue " + tiempo + " Horas");

//        //Ejercicio 11
//        int vehiculos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vehiculos de la Flota: "));
//        int suma = 0;
//        for (int i = 0; i < vehiculos; i++) {
//            String placa = JOptionPane.showInputDialog("Ingrese placa");
//            double distancia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia (Km) recorrida del vehuculo " + placa));
//            double combustible = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el consumo de combustible (L) del vehiculo " + placa));
//            double consumo = calculoConsumo(combustible, distancia);
//            suma += consumo;
//        } 
//        double promedioCon = promedio(suma,vehiculos);
//        JOptionPane.showMessageDialog(null, "El consumo promedio de combustible es" + promedioCon + " L/Km");
        
//        //Ejercicio 12
//        int equipos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de equipos: "));
//        String ganador = "";
//        int maxPuntos = 0;
//        for (int i = 0; i < equipos; i++) {
//            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del equipo ");
//            int puntos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puntos del equipo " + nombre));
//            boolean campeon = mayorGanancia(puntos, maxPuntos);
//            if (campeon) {
//                maxPuntos = puntos;
//                ganador = nombre;
//            }           
//        }
//        JOptionPane.showMessageDialog(null, "El equipo ganador con mas puntos es " + ganador + " con " + maxPuntos + " puntos");

//        //Ejercicio 13
//        int materias = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de Asignaturas"));
//        double suma = 0;
//        for (int i = 0; i < materias; i++) {
//            double notas = Double.parseDouble(JOptionPane.showInputDialog("Digite la calificacion para " + i));
//            suma += notas;
//        }
//        double promedioFin = promedio(suma, materias);
//        JOptionPane.showMessageDialog(null, "El promedio de notas es: " + promedioFin);

//        //Ejercicio 14
//        int numProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Productos"));
//        int maxCalificacion = 0;
//        String mejorProducto = "";
//        for (int i = 0; i < numProductos; i++) {
//            int suma = 0;
//            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Producto ");
//            int numCalificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de calificaciones para " + nombre));
//            for (int j = 0; j < numCalificacion; j++) {
//                int calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificacion de " + nombre));
//                suma += calificacion;
//            }
//            double promedioCalificacion = promedio(suma, numCalificacion);
//            boolean mejorCalificado = mayorGanancia(promedioCalificacion, maxCalificacion);
//            if (mejorCalificado) {
//                maxCalificacion = (int)promedioCalificacion;
//                mejorProducto = nombre;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "El producto que tiene una mejor calificacion promedio es " + mejorProducto + " con un promedio de " + maxCalificacion);

//        //Ejercicio 15
//        int numElectrodometicos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de Electrodomesticos "));
//        for (int i = 0; i < numElectrodometicos; i++) {
//            String electrodomestico = JOptionPane.showInputDialog("Ingrese nombre del Electrodomestico");
//            double consumo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el consumo (kwh)de " + electrodomestico));
//            double rendimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rendimiento (%) de " + electrodomestico));
//            double rendimientoDecimal = decimal(rendimiento);
//            double eficiencia = dividir(rendimientoDecimal, consumo); // la eficiencia se evalua rendimiento sobre consumo Energetico
//            JOptionPane.showMessageDialog(null, "La eficiencia de " + electrodomestico + " es " + eficiencia );
//        } 

//        //Ejercicio 16
//        int alquiler  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del Alquiler: "));
//        int catering  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los costos en catering: "));
//        int entretenimiento  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los costos de entretenimiento: "));
//        int otrosGastos  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los costos de gastos restantes: "));
//        int costoFin = costoEvento(alquiler, catering, entretenimiento,otrosGastos );
//        JOptionPane.showMessageDialog(null, "El costo total del Evento es $" + costoFin);

//        //Ejercicio 17
//        int clientes = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de clientes"));
//        double suma = 0;
//        for (int i = 0; i < clientes; i++) {
//            String nombreCliente = JOptionPane.showInputDialog("Ingrese su nombre");
//            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Digite su calificacion " + nombreCliente + " de 1 a 10"));
//            suma += calificacion;
//        }
//        double promedioFin = promedio(suma, clientes);
//        JOptionPane.showMessageDialog(null, "El promedio de Satisfaccion de los clientes es: " + promedioFin);

//        //Ejercicio 18
//        double metasEstablecidas  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de metas establecidas "));
//        double metasCumplidas  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de metas cumplidas "));
//        double porcentajeMetas = porcentaje(metasCumplidas, metasEstablecidas);
//        JOptionPane.showMessageDialog(null, "El porcentaje de cumplimiento de las metas es " + porcentajeMetas+ "%");

        //Ejercicio 19
//        int capacidad  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del almacen"));
//        int uso  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad ocupada del almacen "));
//        int limite = comprar(capacidad, uso);
//        JOptionPane.showMessageDialog(null, "La capacidad restante del almacen es " + limite);

        //Ejercicio 20
        double distancia  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia (Km) de la carrera"));
        double valor  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la carrera "));
        double valorKilometro = dividir(valor, distancia);
        JOptionPane.showMessageDialog(null, "El valor por Kilometro es $" + valorKilometro);
    }    
    
    //Ejercicio 1
    public static double sueldoAnual(double salario){
        return salario * 12;
    }
    public static double retencionSueldo (double salarioAnual, double retencion){
        return salarioAnual * (retencion / 100);
    }
    
    //Ejercicio 2, 19
    public static boolean verificarCantidad(int actual, int minimo){
        return actual < minimo;
    }
    public static int comprar (int minimo, int actual){
        return minimo - actual;
    }
    
    //Ejercicio 3, 8
    public static int costoProduccion (int materiales, int manoObra, int gastos){
        return materiales + manoObra + gastos;
    }
    
    //Ejercicio 4, 12, 13, 14
    public static boolean mayorGanancia(double ganancia, double mayor){
        return ganancia > mayor;
    }
    
    //Ejercicio 5
    public static double depreciacionAnual(double inicio, double residual, double anios){
        double valorDepresiable = inicio - residual;
        return valorDepresiable / anios;
    }
    
    //Ejercicio 6
    public static double calcularRentabilidad (double capitalInicio, double interes, int anios){
        double tasaDecimal = interes / 100; // Convertir tasa a decimal
        return capitalInicio * Math.pow(1 + tasaDecimal, anios);
    }
     
    //Ejercicio 9
    public static int calculoPago (int horas, int pagoHora){
        return horas * pagoHora;
    }
    
    //Ejercicio 10
    public static double calculoTiempo (double distancia, double velocidad){
        return distancia / velocidad;
    }
    
    //Ejercicio 11
    public static double calculoConsumo (double combustible, double distancia){
        return combustible/distancia;
    }
    
    //Ejercicio 13, 11, 14,17
    public static double promedio(double suma, int materias){
        return suma/materias;
    }
    
    //Ejercicio 15
    public static double dividir(double num1, double num2){
        return num1 / num2;
    }
    public static double decimal(double numero){
        return numero / 100;
    }
    
    //Ejercico 16
    public static int costoEvento (int gasto1, int gasto2, int gasto3, int gasto4){
        return gasto1 + gasto2 + gasto3 + gasto4;
    }
    
    //Ejercicio 18
    public static double porcentaje(double metasEstablecidas, double metasCumplidas){
        double porcentaje = metasEstablecidas / metasCumplidas * 100;
        return porcentaje;
    }
}
        
    
