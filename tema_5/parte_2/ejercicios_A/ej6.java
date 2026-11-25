package tema_5.parte_2.ejercicios_A;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negativo=0;
        for (int i = 0; i <100; i++) {
            System.out.print("Introduce un número: ");
            int num = sc.nextInt();
            if ( num < 0){
                negativo++;
            }
        }
        System.out.println("Numeros negativos: "+negativo);

    }
}
