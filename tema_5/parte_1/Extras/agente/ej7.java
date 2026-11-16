package tema_5.parte_1.Extras.agente;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura en metros: ");
        double altura = sc.nextDouble();

        if (altura < 0) {
            System.out.println("La altura no puede ser negativa.");
            return;
        }

        double tiempo = Math.sqrt((2 * altura) / 9.81);
        System.out.printf("El objeto tardará %.2f segundos en caer.%n", tiempo);
    }
}
