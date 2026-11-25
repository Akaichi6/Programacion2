package tema_5.parte_2.ejercicios_A;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una nota(0-10): ");
        int numero = sc.nextInt();
        while(numero < 0 || numero > 10){
            System.out.println("Has introducido una nota invalida.");
            System.out.print("Introduce una nota de nuevo: ");
            numero = sc.nextInt();
        }
        boolean hay10 = false;
        while(numero != -1){
            System.out.print("Introduce una nota: ");
            numero = sc.nextInt();
            if( numero == 10){
                hay10 = true;
            }
        }
        if(hay10 == true){
            System.out.println("Hay minimo un 10 en las notas introducidas.");
        }else {
            System.out.println("Hay minimo un 10 en las notas introducidas.");
        }
    }
}
