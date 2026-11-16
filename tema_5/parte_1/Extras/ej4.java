package tema_5.parte_1.Extras;

import java.util.Scanner;

public class ej4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero:");
        String numero = sc.nextLine().trim();
        String ultimo = numero.substring(numero.length()-1);
        int ultimo_int = Integer.parseInt(ultimo);
        System.out.println("El ultimo número es: " + ultimo_int);

    }
}
