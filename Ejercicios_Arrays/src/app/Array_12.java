
package app;

import java.util.ArrayList;

public class Array_12 {
    public static void main(String[] args) {
        String[] nombre = {"Juan", "Ana", "Maria", "Paula", "Carlos"};
        double[] tiempo = {48, 42, 53, 51, 47};
        int[] edad = {20, 24, 21, 18, 26};
        
        double promedio = promedioTiempo(tiempo);
        
        ArrayList<String> clasifican = new ArrayList<>();
        ArrayList<String> noClasifican = new ArrayList<>();
        
        for (int i = 0; i < nombre.length; i++) {
            if (tiempo[i] <= promedio && edad[i] <= 25 && edad[i] > 18) {
                clasifican.add(nombre[i]);
            } else {
                noClasifican.add(nombre[i]);
            }
        }
        String nadadorMayorTiempo = "";
        double mayorTiempo = Double.MIN_VALUE;
        String nadadorMenorTiempo = "";
        double menorTiempo = Double.MAX_VALUE;
        
        for (int i = 0; i < nombre.length; i++) {
            if (clasifican.contains(nombre[i])) {
                if (tiempo[i] < menorTiempo) {
                    menorTiempo = tiempo[i];
                    nadadorMenorTiempo = nombre[i];
                }
                if (tiempo[i] > mayorTiempo) {
                    mayorTiempo = tiempo[i];
                    nadadorMayorTiempo = nombre[i];
                }
            }
        }
        System.out.println("Nadadores que clasifican: " + clasifican);
        System.out.println("Nadadores que No clasifican: " + noClasifican);
        System.out.println("Nadador clasificado con mayor Tiempo: " + nadadorMayorTiempo);
        System.out.println("Nadador clasificado con menor Tiempo: " + nadadorMenorTiempo);
    }
    public static double promedioTiempo(double[] tiempo){
        double suma = 0;
        for (double prom : tiempo) {
            suma += prom;
        }
        return suma / tiempo.length;
    }
}
