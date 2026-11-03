package tema_5.parte_1;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cómo te llamas?:");
        String nombre = sc.nextLine().toUpperCase().trim();
        System.out.print("¿Cuál es tu género (H o M)?");
        char sexo = sc.nextLine().toUpperCase().trim().charAt(0);
        char nombre_char = nombre.charAt(0);
        if (sexo == 'H' && nombre_char >= 'N' || sexo == 'M' && nombre_char <= 'M') {
            System.out.println("Tu grupo es A");
        }else  {
            System.out.println("Tu grupo es B");
        }
    }
}
