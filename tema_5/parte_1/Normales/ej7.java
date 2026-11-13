package tema_5.parte_1.Normales;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double n1 = sc.nextDouble();

        int n1_int = (int)n1;

        if (n1_int % 2 == 0){
            System.out.println("El numero "+n1_int+" es par");
        }else {
            System.out.println("El numero "+n1_int+" es impar");
        }
    }
}
