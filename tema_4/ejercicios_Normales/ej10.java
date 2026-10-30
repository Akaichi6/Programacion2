package tema_4.ejercicios_Normales;

import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double num1 =  sc.nextDouble();
        System.out.print("Introduce el Segundo número: ");
        double num2 =  sc.nextDouble();

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
