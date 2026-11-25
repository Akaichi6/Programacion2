package tema_5.parte_2.ejercicios_A;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Introduce un número:");
        int num = 1;//sc.nextInt();
        int negativo=0;
        int positivo=0;
        boolean negativoInicial=false;
        while(num!=0){
            System.out.print("Introduce un número:");
            num = sc.nextInt();
            if (num <0){
                negativo++;
                negativoInicial=true;
            }else if (num > 0){
                positivo++;
            }
        }
        System.out.println("Ha leido algun numero negativo: " + negativoInicial);
        System.out.println("Los números negativos que has introducido son: "+ negativo);
        System.out.println("Los números negativos que has introducido son: "+ positivo);
    }
}
