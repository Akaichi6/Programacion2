package tema_5.parte_1;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double n1 = sc.nextDouble();
        System.out.print("Introduce un numero: ");
        double n2 = sc.nextDouble();

        if (n1 == n2){
            System.out.println("Fin del programa, los números deben de ser diferentes");
        } else if (n1 != n2 && n1 % 1 == 0 && n2 % 1 == 0) {
            System.out.println("Números enteros: " + (int)n1 + " y " + (int)n2);
        } else if (n1 != n2 && n1 % 1 == 0 && n2 %  1!=0) {
            System.out.println("Números enteros: " + (int)n1);
        } else if (n1 != n2 && n2 % 1 == 0 && n1 %  1!=0) {
            System.out.println("Números enteros: " + (int)n2);
        } else {
            System.out.println("Ningún número es entero");
        }
    }
}
