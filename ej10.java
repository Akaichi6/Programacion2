package tema_4;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        double num1 =  new Scanner(System.in).nextDouble();
        System.out.print("Introduce el Segundo número: ");
        double num2 =  new Scanner(System.in).nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;
        System.out.println("El resultado de la suma es: "+ Math.round(suma));
        System.out.println("El resultado de la resta es: "+ Math.round(resta));
        System.out.println("El resultado de la multiplicacion es: "+ Math.round(multiplicacion));
        System.out.println("El resultado de la division es: "+ Math.round(division));

    }
}
