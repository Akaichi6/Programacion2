package tema_5.parte_2.ejercicios_A;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Número " + i);
        }
    }
}
