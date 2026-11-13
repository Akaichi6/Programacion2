package tema_5.parte_1.Normales;

import java.util.Scanner;

public class ej2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad:");
        int edad = sc.nextInt();

        if (edad > 18) {
            System.out.println("Eres mayor de edad");
        }else  {
            System.out.println("Eres menor de edad");
        }
    }
}
