package tema_4.ejercicios_Normales;

import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double PRECIO_FRESCO = 1.20;
        Double PRECIO_VIEJAS = (PRECIO_FRESCO * 50) /100;

        System.out.print("Introduce el número de barras frescas vendidas: ");
        int barras_frescas = input.nextInt();
        System.out.print("Introduce el número de barras que no son del día: ");
        int barras_viejas = input.nextInt();

        double ingresos = (barras_frescas * PRECIO_FRESCO) + (barras_viejas * PRECIO_VIEJAS);

        System.out.println(" El total de ingresos del día es " + (int)ingresos);
    }
}
