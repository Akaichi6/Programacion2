package tema_5.parte_1;

import java.util.Scanner;

public class ej3 {
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("introduce un número: ");
        double n1 = sc.nextDouble();
        System.out.print("introduce un número: ");
        double n2 = sc.nextDouble();

        if (n1 == n2) {
            System.out.println("Ambos números son iguales");
        } else if (n1>n2) {
            System.out.println("El número " + n1 + " es mayor a " + n2);
        }else {
            System.out.println("El número " + n2 + " es mayor a " + n1);
        }
    }

}
