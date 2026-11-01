package tema_4.ejercicios_extra;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);         
       System.out.print("Introduce un número entero: "); 
       String numero_S = sc.nextLine().trim();
       int numero = Integer.parseInt(numero_S);
       int suma = numero + 10; 
       System.out.println("La suma del número introducido es: "+suma);
    }
}
