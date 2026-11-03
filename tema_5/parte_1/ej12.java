package tema_5.parte_1;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cómo te llamas?:");
        String nombre = sc.nextLine();
        System.out.println("¿Cuál es tu género (H o M)?");
        String sexo = sc.nextLine();

        char sexo_char = Character.toUpperCase(sexo.charAt(0));

    }
}
