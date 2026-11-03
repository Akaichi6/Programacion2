package tema_5.parte_1;

import java.util.Scanner;

public class ej11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Opción 1: De Celsius a Fahrenheit.");
        System.out.println("Opción 2: De Fahrenheit a Celsius.");
        System.out.println("Opción 3: De Celsius a Kelvin.");
        System.out.print("Introduce un número (del 1 - 3): ");
        int num = sc.nextInt();
        if (num <= 3 && num >= 1) {
            switch (num) {
                case 1:
                    System.out.println("La opcion que elegiste es el cambio de Celsius a Fahrenheit.");
                    System.out.print("Introduce los Celsius: ");
                    double celsius = sc.nextDouble();
                    double f = (celsius * 9/5) + 32;
                    System.out.println(celsius + "Celsius a Fahrenheit: " + f);
                    break;
                case 2:
                    System.out.println("La opcion que elegiste es el cambio de Fahrenheit a Celsius.");
                    System.out.print("Introduce los Fharenheit: ");
                    double fharenheit = sc.nextDouble();
                    double c = (fharenheit - 32) * 5/9;
                    System.out.println(fharenheit+"Fahrenheit a Celsius: " + c);
                    break;
                case 3:
                    System.out.println("La opcion que elegiste es el cambio de Celsius a Kelvin.");
                    System.out.print("Introduce los Celsius: ");
                    double celsius_k = sc.nextDouble();
                    double k = celsius_k + 273.15;
                    System.out.println(celsius_k + "Celsius a Kelvin: " + k);
            }
        }else {
            System.out.println("Las opciones presentadas son del 1-3 seleccione una de esas 3 opciones. Gracias!!");
        }
    }
}
