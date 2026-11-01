package tema_4.ejercicios_extra;

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine().trim();

        String primera_letra = palabra.substring(0,1).toUpperCase();
        String texto_medio = palabra.substring(1,palabra.length()-1);
        String ultima_letra = palabra.substring(palabra.length()-1).toUpperCase();

        String resultado = primera_letra + texto_medio + ultima_letra;
        System.out.println("La palabra con la primera y ultima letra seria: " + resultado);
        sc.close();
    }
}
