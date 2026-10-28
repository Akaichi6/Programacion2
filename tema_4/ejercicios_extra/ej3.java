package tema_4.ejercicios_Refuerzo_extra;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //producto 1
        System.out.print("Producto 1 (nombre): ");
        String nombre1 = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad1 = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Precio unitario: ");
        double precio1 = sc.nextDouble();
        double subtotal1 = cantidad1 * precio1;
        // producto 2
        System.out.print("Producto 2 (nombre): ");
        String nombre2 = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad2 = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Precio unitario: ");
        double precio2 = sc.nextDouble();
        double subtotal2 = cantidad2 * precio2;
        //producto 3
        System.out.print("Producto 3 (nombre): ");
        String nombre3 = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad3 = Integer.parseInt(sc.nextLine());
        System.out.print("Precio unitario: ");
        double precio3 = sc.nextDouble();
        double subtotal3 = cantidad3 * precio3;
        //producto 4
        System.out.print("Producto 4 (nombre): ");
        String nombre4 = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad4 = Integer.parseInt(sc.nextLine());
        System.out.print("Precio unitario: ");
        double precio4 = sc.nextDouble();
        double subtotal4 = cantidad4 * precio4;
        //producto 5
        System.out.print("Producto 5 (nombre): ");
        String nombre5 = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad5 = Integer.parseInt(sc.nextLine());
        System.out.print("Precio unitario: ");
        double precio5 = sc.nextDouble();
        double subtotal5 = cantidad5 * precio5;

        String producto_s = "producto";
        String cantidad_s = "cantiad";
        String precio_s = "precio";
        String subtotal_s = "subtotal";
        System.out.printf("|%-10s|%8s|%15s|%10s|",producto_s,cantidad_s,precio_s,subtotal_s);
        System.out.printf("-----------------------------------------------------------------");
        //System.out.printf("|%-10s|%8s|%15s|%10s|",cantidad1,precio1,subtotal1);
        System.out.printf("|%-10s|%8s|%15s|%10s|",cantidad2,precio2,subtotal2);
        System.out.printf("|%-10s|%8s|%15s|%10s|",cantidad3,precio3,subtotal3);
        System.out.printf("|%-10s|%8s|%15s|%10s|",cantidad4,precio4,subtotal4);
        System.out.printf("|%-10s|%8s|%15s|%10s|",cantidad5,precio5,subtotal5);

    }
}
