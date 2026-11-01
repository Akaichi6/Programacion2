package tema_4.ejercicios_extra;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        String n1 = sc.nextLine();
        System.out.print("Introduce un número entero: ");
        String n2 = sc.nextLine();

        int n1_entero = Integer.parseInt(n1);
        int n2_entero = Integer.parseInt(n2);
        int suma = n1_entero + n2_entero;
        System.out.println("La suma de los dos números es: " + suma);
    }
}
