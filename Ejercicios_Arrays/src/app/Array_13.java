
package app;

import java.util.ArrayList;

public class Array_13 {
    public static void main(String[] args) {
        String[] nombre = {"Oscar", "Pablo", "Yohana", "Hector", "Eliana"};
        double[] ranking = {5, 8, 22, 12, 17};
        int[] edad = {27, 34, 31, 22, 21};
        
        double promedio = promedioRanking(ranking);
        
        ArrayList<String> clasifican = new ArrayList<>();
        ArrayList<String> noClasifican = new ArrayList<>();
        
        for (int i = 0; i < nombre.length; i++) {
            if (ranking[i] <= promedio && edad[i] < 30 && edad[i] > 20) {
                clasifican.add(nombre[i]);
            } else {
                noClasifican.add(nombre[i]);
            }
        }
        String tenistaMayorTiempo = "";
        double mayorRanking = Double.MIN_VALUE;
        String tenistaMenorTiempo = "";
        double menorRanking = Double.MAX_VALUE;
        
        for (int i = 0; i < nombre.length; i++) {
            if (clasifican.contains(nombre[i])) {
                if (ranking[i] < menorRanking) {
                    menorRanking = ranking[i];
                    tenistaMenorTiempo = nombre[i];
                }
                if (ranking[i] > mayorRanking) {
                    mayorRanking = ranking[i];
                    tenistaMayorTiempo = nombre[i];
                }
            }
        }
        System.out.println("Tenistas que clasifican: " + clasifican);
        System.out.println("Tenistas que No clasifican: " + noClasifican);
        System.out.println("Tenista clasificado con menor Ranking: " + tenistaMayorTiempo);
        System.out.println("Tenista clasificado con mejor Ranking: " + tenistaMenorTiempo);
    }
    public static double promedioRanking(double[] ranking){
        double suma = 0;
        for (double prom : ranking) {
            suma += prom;
        }
        return suma / ranking.length;
    }
}
