package tema_5.parte_1.Extras;

import java.util.Scanner;

public class ej5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número de maximo 5 cifras: ");
        String numero_string = sc.nextLine().trim();
        int length = numero_string.length();
        while (length>5){
            System.out.print("Introduce de nuevo un número de maximo 5 cifras: ");
            numero_string = sc.nextLine().trim();
            length = numero_string.length();
        }
            String primero = numero_string.substring(Integer.parseInt(numero_string),0);
            System.out.println("El primer numero de "+numero_string+" es: "+primero);
    }
}
