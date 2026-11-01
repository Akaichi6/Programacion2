package tema_4.examen_repaso;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int KB = 1024;
        System.out.print("Introduce los KB que quieres transformar: ");
        double kb = sc.nextDouble();

        double mg = kb / KB;
        System.out.printf("Los %,.2f Kb son en mg: %,.2f Mg",kb,mg);

        sc.close();
    }
}
