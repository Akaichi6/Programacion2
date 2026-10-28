package tema_4.ejercicios_Normales;

import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double EMPANADILLA = 112;
        double NAPOLITANA = 75;

        System.out.print("Introduce el numero de empanadillas a enviar: ");
        int empanadillas = sc.nextInt();
        System.out.print("Introduce el numero de napolitanas a enviar: ");
        int napolitanas = sc.nextInt();

        double peso_envio = ((empanadillas * EMPANADILLA)/1000) + ((napolitanas * NAPOLITANA)/1000);

        System.out.printf("El peso total del paquete es %.3f%% Kg\n", peso_envio);
    }
}
