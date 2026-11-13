package tema_5.parte_1.Normales;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         final double MENOS_10 = 0.05, MENOS_20 = 0.15, MENOS_35 = 0.20, MENOS_60 = 0.3, IGUAL_MAS_60=0.45;

        System.out.print("Introduce tu renta anual: ");
        double renta = input.nextDouble();
        double impuesto;
        int contador = 0;
        while(contador == 0) {
            if (renta < 0) {
                System.out.println("La renta no puede ser menor que 0");
                System.out.print("Introduce tu renta anual: ");
                renta = input.nextDouble();
            } else if (renta<10000) {
                System.out.println("El tipo impositivo que te corresponde es el del: "+MENOS_10+" %");
                impuesto = renta * MENOS_10;
                System.out.println("Lo que pagas en impuestos es: "+impuesto + " €");
                contador++;
            }else if (renta<20000) {
                System.out.println("El tipo impositivo que te corresponde es el del: "+MENOS_20+" %");
                impuesto = renta * MENOS_20;
                System.out.println("Lo que pagas en impuestos es: "+impuesto + " €");
                contador++;
            } else if (renta<35000) {
                System.out.println("El tipo impositivo que te corresponde es el del: "+MENOS_35+" %");
                impuesto = renta * MENOS_35;
                System.out.println("Lo que pagas en impuestos es: "+impuesto + " €");
                contador++;
            }
            else if(renta<60000) {
                System.out.println("El tipo impositivo que te corresponde es el del: "+MENOS_60+" %");
                impuesto = renta * MENOS_60;
                System.out.println("Lo que pagas en impuestos es: "+impuesto + " €");
                contador++;
            } else if (renta >= 60000) {
                System.out.println("El tipo impositivo que te corresponde es el del: "+IGUAL_MAS_60+" %");
                impuesto = renta * IGUAL_MAS_60;
                System.out.println("Lo que pagas en impuestos es: "+impuesto + " €");
                contador++;
            }
        }

    }
}
