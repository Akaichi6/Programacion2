package tema_4.ejercicios_Normales;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("introduce el precio original: ");
        double precio = sc.nextDouble();

        System.out.print("introduce el precio final: ");
        double precioDec = sc.nextDouble();

        double descuento = ((precio-precioDec)/precio)*100;

        System.out.printf("El porcentaje de descuento es: %.2f%%\n", descuento);
    }
}
