package tema_4.ejercicios_extra;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("MAYSCÚLAS: "+ frase.toUpperCase());
        System.out.println("minúsculas: " + frase.toLowerCase());
        System.out.printf("%S\n",frase);
        System.out.printf("%s\n",frase);
    }
}
