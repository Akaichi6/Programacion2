package tema_4.ejercicios_Normales;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        System.out.println("vamos a calcular el volumen de un cono ");
        System.out.print("Introduce el radio del cono: ");
        double radio = new Scanner(System.in).nextInt();
        System.out.print("Introduce la altura del cono: ");
        double altura = new Scanner(System.in).nextInt();
        double tercio = 0.333;
        double volumen = tercio * Math.PI * radio * radio * altura;

        System.out.println("El volumen del cono es: "+ volumen);
    }
}
