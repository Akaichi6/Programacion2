package tema_4.ejercicios_Normales;

import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double INTERES_ANUAL = 0.04;

        System.out.print("Inteoduce la inversión inicial: ");
        double inversion_inicial = sc.nextDouble();
        double rendimiento = inversion_inicial * (1 + INTERES_ANUAL);
        int contador = 0;
        int anio = 1;
        while (contador < 3){
            contador++;
            if (anio == 1 ) {
                System.out.println("Balance año " + anio + ": " + (String.format("%.2f",rendimiento)));
                anio++;
            }else if (anio == 2){
                rendimiento = rendimiento + (rendimiento *  INTERES_ANUAL );
                System.out.println("Balance año " + anio + ": " + (String.format("%.2f",rendimiento)));
                anio++;
            }else if (anio == 3){

                rendimiento = rendimiento + (rendimiento *  INTERES_ANUAL );
                System.out.println("Balance año " + anio + " y final: " + (String.format("%.2f",rendimiento)));
                anio++;
            }

        }
    }
}
