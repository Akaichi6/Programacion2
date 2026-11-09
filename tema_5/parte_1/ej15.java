package tema_5.parte_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        final double DESCUENTO_MAS_1000 = 0.1, RECARGO_MENOS_50 = 5;
        System.out.print("Introduce el importe total del pedido: ");
        double importe = sc.nextDouble();

        for (;importe <0;){
            System.out.println("El importe no puede ser negativo.");
            System.out.print("Introduce el importe total del pedido: ");
            importe = sc.nextDouble();
        }
        if (importe > 100 ){
            System.out.println("El importe es: "+df.format(importe)+" al ser mayor de 100€ se le aplica un descuento del 10%.");
            double descuento =importe*DESCUENTO_MAS_1000;
            double precio_final = importe+descuento;
            System.out.println("El precio final con el descuento aplicado es: "+df.format(precio_final)+" €");
        } else if (importe<50) {
            System.out.println("El importe es: "+df.format(importe)+" al ser menor de 50€ se le aplica un recargo de 5€.");
            double precio_final =importe+RECARGO_MENOS_50;
            System.out.println("El precio final con el descuento aplicado es: "+df.format(precio_final)+" €");
        }
        else if (importe>50 && importe<100){
            System.out.println("El importe es: "+df.format(importe)+" al estar entre 50€ y 100€ no se le aplica ni descuento ni recargo.");

        }

    }
}
