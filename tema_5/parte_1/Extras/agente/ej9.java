package tema_5.parte_1.Extras.agente;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora (0-23): ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        int minutos = sc.nextInt();

        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) {
            System.out.println("La hora introducida no es válida.");
            return;
        }

        int segundosRestantes = 24 * 60 * 60 - (hora * 60 * 60 + minutos * 60);
        System.out.println("Faltan " + segundosRestantes + " segundos para la medianoche.");
    }
}
