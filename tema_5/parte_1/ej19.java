package tema_5.parte_1;

import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nIniciando el programa...");
        System.out.println("---------------------------------");
        System.out.println("| COMPROBADOR DE AÑOS BISIESTOS |");
        System.out.println("---------------------------------");
        System.out.print("Introduce el año que quieres comprobar: ");
        int anyo = input.nextInt();
        if (anyo % 400==0 ){
            System.out.println("\tEl "+anyo+" es bisiesto.");
        }else if (anyo % 100!=0){
            System.out.println("\tEl "+anyo+" no es bisiesto.");
        }else if (anyo % 4==0){
            System.out.println("\tEl "+anyo+" es bisiesto.");
        }
    }
}
