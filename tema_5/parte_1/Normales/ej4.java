package tema_5.parte_1.Normales;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3;

        System.out.print("Ingrese un número(entero): ");
        n1 = input.nextInt();
        System.out.print("Ingrese un número(entero): ");
        n2 = input.nextInt();
        System.out.print("Ingrese un número(entero): ");
        n3 = input.nextInt();

        if (n1>n2 && n1>n3) {
            System.out.println("El número " + n1 + " es el mayor");
        }else if (n2>n1 && n2>n3) {
            System.out.println("El número " + n2 + " es el mayor");
        }else if (n3>n1 && n3>n2) {
            System.out.println("El número " + n3 + " es el mayor");
        }
    }
}
