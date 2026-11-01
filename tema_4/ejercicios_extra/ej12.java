package tema_4.ejercicios_extra;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        double numero_decimal = sc.nextDouble();
        String numeroString = String.valueOf(numero_decimal);
        int longitud = numeroString.length();
        System.out.println(numeroString);
        System.out.println("La longitud es: "+ longitud);
        sc.close();
    }
}
