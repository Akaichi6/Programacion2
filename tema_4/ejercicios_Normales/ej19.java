package tema_4.ejercicios_Normales;

import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cantidad a invretir: ");
        double cantidad1 = input.nextDouble();
        System.out.print("Interés porcentual anual: ");
        double interes = input.nextDouble();
        System.out.print("Duración de la inversión en meses:");
        int meses = input.nextInt();

        int anios = meses/12;

        double rendimiento = cantidad1 * Math.pow((interes/100 + 1), anios);

        System.out.printf("Capital final:  %.2f\n", rendimiento);
    }
}
