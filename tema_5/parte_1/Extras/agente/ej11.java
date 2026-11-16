package tema_5.parte_1.Extras.agente;

import java.util.Arrays;
import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);
        System.out.println("Números ordenados de menor a mayor: "
                + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}
