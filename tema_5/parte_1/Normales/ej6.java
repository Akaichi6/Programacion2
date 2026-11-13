package tema_5.parte_1.Normales;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        double n1 =input.nextDouble();
        System.out.println("Introduce un número: ");
        double n2 =input.nextDouble();

        if (n1<n2){
            System.out.println("Los números en orden descendente son:");
            System.out.println(n1);
            System.out.println(n2);
        }else {
            System.out.println("Los números en orden descendente son:");
            System.out.println(n2);
            System.out.println(n1);
        }
    }
}
