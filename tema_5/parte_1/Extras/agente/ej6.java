package tema_5.parte_1.Extras.agente;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero de hasta 5 cifras: ");
        int numero = sc.nextInt();

        if (numero < -99999 || numero > 99999) {
            System.out.println("El número no puede tener más de 5 cifras.");
            return;
        }

        int cifras = String.valueOf(Math.abs(numero)).length();
        System.out.println("El número tiene " + cifras + (cifras == 1 ? " dígito." : " dígitos."));
    }
}
