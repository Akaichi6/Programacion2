package tema_4.ejercicios_Normales;

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tus horas de trabajo: ");
        int horas = sc.nextInt();

        System.out.print("introduce la tarifa por hora: ");
        int tarifa = sc.nextInt();

        double salario_bruto = tarifa * horas;
        double salario_neto =  salario_bruto - ((salario_bruto * 15 )/100);

        System.out.println("Tu paga en bruto es de " + salario_bruto + " y en neto " + salario_neto + "(retención del 15%)");



    }
}
