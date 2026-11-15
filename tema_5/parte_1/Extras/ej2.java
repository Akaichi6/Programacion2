package tema_5.parte_1.Extras;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora (solo la hora): ");
        int hora = sc.nextInt();
        do {
            System.out.print("Introduce la hora (solo la hora, de 0 a 23): ");
            hora = sc.nextInt();

            if (hora < 0 || hora > 23) {
                System.out.println("Error: introduce una hora dentro del rango de 0 a 23.\n");
            }
        } while (hora < 0 || hora > 23);

            if  (hora >= 6 && hora <= 12) {
                System.out.println("Buenos Días");
            }else if (hora >= 13 && hora <= 20) {
                System.out.println("Buenas Tardes");
            } else{
                System.out.println("Buenas Noches");
        }
    }
}
