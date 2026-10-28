package tema_4.ejercicios_Normales;

import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el dividendo (entero): ");
        int dividendo = sc.nextInt();

        System.out.print("Introduce el divisor (entero): ");
        int divisor = sc.nextInt();

        int division = dividendo /divisor;

        int resto = dividendo%divisor;

        System.out.println(dividendo + " entre " + divisor + " da un coeficiente " + division + " y un resto " + resto);
    }
}
