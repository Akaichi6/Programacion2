package tema_4.ejercicios_Normales;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        int contador = 1;
        int suma = 0;
        while (contador <= num) {
            suma = suma + contador;
            contador++;
        }
        System.out.println("La suma es: " + suma);
    }
}
