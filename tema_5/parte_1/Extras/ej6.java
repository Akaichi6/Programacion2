package tema_5.parte_1.Extras;

import java.util.Scanner;

public class ej6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        String numero = sc.nextLine();
        int numero_int = Integer.parseInt(numero);
        String longitud = String.valueOf(numero.length());
        int longitud_int=Integer.parseInt(longitud);
        if (longitud_int<=5){
            if (numero_int<0){
                longitud = String.valueOf(numero.length()-1);
                longitud_int = Integer.parseInt(longitud);
                System.out.println(longitud_int);
            }else{
                longitud = String.valueOf(numero.length());
                System.out.println(longitud);
            }
        } else if (numero_int<0) {
            longitud = String.valueOf(numero.length() - 1);
            longitud_int = Integer.parseInt(longitud);
            if (longitud_int>5){
                System.out.println("La longitud del número no puede superar los 5 dígitos");
            } else {
                System.out.println("hola");
                System.out.println(longitud);
            }
        } else {
            System.out.println("La longitud del número no puede superar los 5 dígitos");
        }
    }
}
