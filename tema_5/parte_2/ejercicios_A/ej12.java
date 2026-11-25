package tema_5.parte_2.ejercicios_A;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero base:");
        int base = sc.nextInt();
        System.out.print("Introduce el numero de la potencia:");
        int potencia = sc.nextInt();
        int resultado = 1;

        for (int i = 0; i < potencia; i++) {
           resultado *= base;
            System.out.println(resultado);
        }
        System.out.print("El resultado de " +base+"^"+potencia+" es: " + resultado);
    }
}
