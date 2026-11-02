package tema_5.parte_1;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número:");
        double n1 = input.nextDouble();

        if (n1>=0){
            System.out.println("El numero "+n1+" es positivo");
        }else{
            System.out.println("El numero "+n1+" es negativo");
        }
    }
}
