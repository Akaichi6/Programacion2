package tema_4.ejercicios_extra;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la palabra true: ");
        String tru = sc.nextLine().trim();
        System.out.print("Introduce la palabra false: ");
        String fals = sc.nextLine().trim();
        
        boolean fals_b = Boolean.parseBoolean(fals);
        boolean tru_b = Boolean.parseBoolean(tru);

        System.out.println("El valor booleano para true es: " + tru_b);
        System.out.println("El valor booleano para false es: "+ fals_b);

    }
    
}
