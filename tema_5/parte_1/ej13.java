package tema_5.parte_1;

import java.util.Scanner;

public class ej13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int GRATIS = 0, PRECIO_5 = 5, PRECIO_10 = 10;

            System.out.print("Introduce tu edad: ");
            int edad = sc.nextInt();

            if(edad >= 0 && edad <= 100) {
               if (edad<4){
                   System.out.println("El precio de la entrada es: "+GRATIS+" €");
               } else if (edad <= 17) {
                   System.out.println("El precio de la entrada es: "+PRECIO_5+" €");
               }else {
                   System.out.println("El precio de la entrada es: "+PRECIO_10+" €");
               }
            }

    }
}
