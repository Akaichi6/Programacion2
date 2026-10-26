package tema_4;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        System.out.println("Vamos a calcular el área de un triangulo isosceles");
        System.out.print("Introduce la base del triangulo:");
        double base = new Scanner(System.in).nextInt();
        System.out.print("Introduce la altura del triangulo:");
        double altura = new Scanner(System.in).nextInt();

        double area = (base * altura)/2;

        System.out.println("El área del triangulo es: "+ area);
    }
}
