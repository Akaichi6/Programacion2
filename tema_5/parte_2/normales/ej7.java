package tema_5.parte_2.normales;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int negativo = 0;
        for (int i = 1; i <= 10; i++){
            System.out.print("Introduce un número:");
            int num = sc.nextInt();

            if (num<0){
                negativo++;
            }else {
                positivos++;
            }
        }
        System.out.println("Los números negativos que has introducido son: "+ negativo);
        System.out.println("Los números negativos que has introducido son: "+ positivos);
    }
}
