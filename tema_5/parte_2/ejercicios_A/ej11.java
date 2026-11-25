package tema_5.parte_2.ejercicios_A;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma_pares = 0;
        int suma_impares = 0;
        System.out.println("El programa va a calcular la suma de los números pares e impares del 100-200: ");
        for (int i=100;i <=200;i++){
            if(i%2==0){
                suma_pares+=i;
            }else {
                suma_impares+=i;
            }
        }
        System.out.println("\tLa suma de los números pares es: "+suma_pares);
        System.out.println("\tLa suma de los números impares es: "+suma_impares);
    }
}
