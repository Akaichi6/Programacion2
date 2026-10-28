package tema_4.ejercicios_extra;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //producto 1
        System.out.print("Producto 1 (nombre): ");
        String nombre1 = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad1 =Integer.parseInt(sc.nextLine().trim());
        System.out.print("Precio unitario: ");

        double precio1 =Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
        double subtotal1 = cantidad1 * precio1;
        // producto 2
        System.out.print("Producto 2 (nombre): ");
        String nombre2 = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad2 =Integer.parseInt(sc.nextLine().trim());
        System.out.print("Precio unitario: ");
        double precio2 = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
        double subtotal2 = cantidad2 * precio2;
        //producto 3
        System.out.print("Producto 3 (nombre): ");
        String nombre3 = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad3 =Integer.parseInt(sc.nextLine());
        System.out.print("Precio unitario: ");
        double precio3 = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
        double subtotal3 = cantidad3 * precio3;
        //producto 4
        System.out.print("Producto 4 (nombre): ");
        String nombre4 =sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad4 =Integer.parseInt(sc.nextLine());
        System.out.print("Precio unitario: ");
        double precio4 = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
        double subtotal4 = cantidad4 * precio4;
        //producto 5
        System.out.print("Producto 5 (nombre): ");
        String nombre5 =sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad5 =Integer.parseInt(sc.nextLine());
        System.out.print("Precio unitario: ");
        double precio5 = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
        double subtotal5 = cantidad5 * precio5;
        String total = "Total";
        int cantidad_total = cantidad1+cantidad2+cantidad3+cantidad4+cantidad5;
        double suma = subtotal1+subtotal2+subtotal3+subtotal4+subtotal5;

        String producto_s = "producto";
        String cantidad_s = "cantiad";
        String precio_s = "precio";
        String subtotal_s = "subtotal";
        System.out.println("");
        System.out.printf("\n|%-11s|%8s|%15s|%10s|\n",producto_s,cantidad_s,precio_s,subtotal_s);
        System.out.printf("-------------------------------------------------\n");
        System.out.printf("|%-11s|%8s|%15s|%10.2f|\n",nombre1,cantidad1,precio1,subtotal1);
        System.out.printf("|%-11s|%8s|%15s|%10.2f|\n",nombre2,cantidad2,precio2,subtotal2);
        System.out.printf("|%-11s|%8s|%15s|%10.2f|\n",nombre3,cantidad3,precio3,subtotal3);
        System.out.printf("|%-11s|%8s|%15s|%10.2f|\n",nombre4,cantidad4,precio4,subtotal4);
        System.out.printf("|%-11s|%8s|%15s|%10.2f|\n",nombre5,cantidad5,precio5,subtotal5);
        System.out.println("-------------------------------------------------");
        System.out.printf("|%-11s|%8s|%15s|%10.2f|\n",total,cantidad_total,"",suma);

    }
}
