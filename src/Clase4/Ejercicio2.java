package Clase4;

import java.text.DecimalFormat;

public class Ejercicio2 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");
        double inflacion[] = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6};
        double total = 0, max = 0, min = 0;
        int mes_max = 1;
        int mes_min = 1;

        for (int i = 0; i < inflacion.length; i++) {
            total += inflacion[i];
        }
        System.out.println("inflacion semestral " + total);
        System.out.println("promedio del semestre " + df.format(total / inflacion.length));

        {
            int i = 0;

            if (inflacion[i] > max) {
                max = inflacion[i];
                int[] mes = null; 
                mes_max = mes[i];

            }

        }

    }
}