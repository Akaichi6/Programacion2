package tema_4.ejercicios_Normales;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de la tabla de multiplicar:");
        int num = sc.nextInt();

        int i = 0;

        System.out.print("Tabla de multiplicar del número: " );
        while (i <= 10) {
            int multiplicar = num * i;
            System.out.println( num + " X " + i + " = " + multiplicar);
            i++;
        }
    }
}
