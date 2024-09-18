
package app;

import java.util.ArrayList;

public class Array_11 {
    public static void main(String[] args) {
        String[] nombres = {"Camilo","Santiago","Sebastian","Nixon","David","Amilcar"};
        double[] pesos = {60, 61, 70, 57, 80, 72};
        int[] edades = {19, 24, 21, 19, 24, 20};
        
        double calculoPromedio = promedio(pesos);

        ArrayList<String> clasifican = new ArrayList<>();
        ArrayList<String> noClasifican = new ArrayList<>();
        
        
        for (int i = 0; i < nombres.length; i++) {
            if (pesos[i] <= calculoPromedio && edades[i] <= 30 && edades[i] > 18) {
                clasifican.add(nombres[i]);
            } else {
                noClasifican.add(nombres[i]);
            }
        }
        String jugadorMenorPeso = null;
        double menorPeso = Double.MAX_VALUE;
        String jugadorMayorPeso = null;
        double mayorPeso = Double.MIN_VALUE;
        
        for (int i = 0; i < nombres.length; i++) {
            if (clasifican.contains(nombres[i])) {
                if (pesos[i] < menorPeso) {
                menorPeso = pesos[i];
                jugadorMenorPeso = nombres[i];
                }
                if (pesos[i] > mayorPeso) {
                    mayorPeso = pesos[i];
                    jugadorMayorPeso = nombres[i];
                }
            }            
        }   
        System.out.println("Jugadores que clasifican: " + clasifican);
        System.out.println("Jugadores que NO clasifican: " + noClasifican);
        System.out.println("Jugador que clasifica con Menor Peso: " + jugadorMenorPeso);
        System.out.println("Jugador que clasifica con Mayor Peso: " + jugadorMayorPeso);
    }
    public static double promedio(double[] pesos){
        double suma = 0;
        for (double peso : pesos) {
            suma += peso;
        }
        return suma/pesos.length;
    }
    
//     public static void main(String[] args) {
//        String[] nombres = {"Juan", "Pedro", "Luis", "Carlos", "Andres"};
//        double[] pesos = {70.5, 80.2, 75.0, 82.0, 68.5};
//        int[] edades = {25, 29, 22, 31, 19};
//
//        double promedioPeso = calcularPromedioPeso(pesos);
//
//        ArrayList<String> jugadoresClasifican = new ArrayList<>();
//        ArrayList<String> jugadoresNoClasifican = new ArrayList<>();
//
//        for (int i = 0; i < nombres.length; i++) {
//            if ((pesos[i] < promedioPeso && edades[i] <= 30) ||
//                (pesos[i] == promedioPeso && edades[i] > 18)) {
//                jugadoresClasifican.add(nombres[i]);
//            } else {
//                jugadoresNoClasifican.add(nombres[i]);
//            }
//        }
//
//        String jugadorMenorPeso = null;
//        double menorPeso = Double.MAX_VALUE;
//        String jugadorMayorPeso = null;
//        double mayorPeso = Double.MIN_VALUE;
//
//        for (int i = 0; i < nombres.length; i++) {
//            if (jugadoresClasifican.contains(nombres[i])) {
//                if (pesos[i] < menorPeso) {
//                    menorPeso = pesos[i];
//                    jugadorMenorPeso = nombres[i];
//                }
//                if (pesos[i] > mayorPeso) {
//                    mayorPeso = pesos[i];
//                    jugadorMayorPeso = nombres[i];
//                }
//            }
//        }
//
//        imprimirResultados(jugadoresClasifican, jugadoresNoClasifican, jugadorMenorPeso, jugadorMayorPeso);
//    }
//
//    private static double calcularPromedioPeso(double[] pesos) {
//        double suma = 0;
//        for (double peso : pesos) {
//            suma += peso;
//        }
//        return suma / pesos.length;
//    }
//
//    private static void imprimirResultados(ArrayList<String> clasifican, ArrayList<String> noClasifican, String menorPeso, String mayorPeso) {
//        JOptionPane.showMessageDialog(null, "Jugadores que clasifican: " + String.join(", ", clasifican));
//        JOptionPane.showMessageDialog(null, "Jugadores que no clasifican: " + String.join(", ", noClasifican));
//        JOptionPane.showMessageDialog(null, "Jugador que clasificó con el menor peso: " + menorPeso);
//        JOptionPane.showMessageDialog(null, "Jugador que clasificó con el mayor peso: " + mayorPeso);
//    }
}
