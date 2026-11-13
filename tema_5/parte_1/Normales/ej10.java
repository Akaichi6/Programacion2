package tema_5.parte_1.Normales;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.print("Introduce tun ingresos mensuales:");
        double ingresos = sc.nextDouble();

        if (edad >=16 && ingresos >= 1000) {
            System.out.println("Al ser mayor de 16 años y tener un salario mensual igual o superior a 1.000€ debes tributar");
        }else if (edad >=16 && ingresos <= 1000) {
            System.out.println("Aun que tengas 16 años al tener un salario mensual inferior a 1.000€ no debes tributar");
        }else if (edad <=16 && ingresos >= 1000) {
            System.out.println("Al ser menor de 16 años aunque tengas un salario mensual igual o superior a 1.000€ no debes tributar");
        }
    }
}
