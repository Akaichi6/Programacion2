package tema_5.parte_1.Extras.agente;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo de hasta 5 cifras: ");
        int numero = sc.nextInt();

        if (numero < 0 || numero > 99999) {
            System.out.println("El número debe ser positivo y tener como máximo 5 cifras.");
            return;
        }

        int original = numero;
        int invertido = 0;
        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }

        if (original == invertido) {
            System.out.println("El número es capicúa.");
        } else {
            System.out.println("El número no es capicúa.");
        }
    }
}
