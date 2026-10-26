package tema_4;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        System.out.print("Introduce el radio: ");
        double radio = new Scanner(System.in).nextDouble();

        double longitud = ((radio*2)*Math.PI);
        double area = ((radio*2)*Math.PI) ;
        double volumen = ((4/3)*Math.PI*Math.pow(radio,3));

        System.out.println("El radio del circulo es: " + radio);
        System.out.println("El longitud del circulo es: " + longitud);
        System.out.println("El area del circulo es: " + area);
        System.out.println("El volumen del circulo es: " + volumen);
    }
}
