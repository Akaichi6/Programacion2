package tema_4.ejercicios_Normales;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la distancia en millas: ");
        double dato = sc.nextDouble();

        int MILLA = 1852;

        double metro = dato * MILLA;

        System.out.println(dato + " milllas son: " + metro + " m.");

    }
}
