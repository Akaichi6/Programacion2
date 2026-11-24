package tema_5.parte_2.normales;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce un nmero positivo:");
        int n = sc.nextInt();
        while (n < 0){
            System.out.print("Introduce un nmero positivo:");
            n = sc.nextInt();
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiplica y acumula el resultado
        }
        System.out.println("resultdo:"+ factorial);
    }
}
