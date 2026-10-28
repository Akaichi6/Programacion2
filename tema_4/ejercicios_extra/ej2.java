package tema_4.ejercicios_Refuerzo_extra;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio del primer producto: ");
        double precio1 = sc.nextDouble();
        System.out.print("Introduce el precio del segundo producto: ");
        double precio2 = sc.nextDouble();

        double maximo = Math.max(precio1,precio2);
        double minimo = Math.min(precio1,precio2);
        double diferencia = maximo - minimo;
        System.out.printf("El producto más caro: %.2f €%n",maximo);
        System.out.printf("El producto más barato: %.2f €%n ",minimo);
        System.out.printf("Diferencia: %.2f €%n", diferencia);

    }
}
