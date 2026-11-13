package tema_5.parte_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat ("#,##0.00");
        System.out.println("\nIniciando el programa...");
        System.out.println("--------------------------");
        System.out.println("| COMPROBADOR DE salario |");
        System.out.println("--------------------------");

        System.out.print("Nombre:");
        String nombre = input.nextLine();
        System.out.print("Horas trabajadas semanales: ");
        int horasTrabajadas = input.nextInt();
        System.out.print("Tarifa por hora: ");
        int tarifaPorHora = input.nextInt();

        final double horaNormal = 35;
        double horaExtra = horasTrabajadas - horaNormal;
        double salario_hora_normal = horaNormal * tarifaPorHora;
        double salario_hora_extra = horaExtra * (tarifaPorHora*1.5);
        double salario_bruto = (salario_hora_extra + salario_hora_normal)*4;
        double impuestos = salario_bruto;
        final double libre_impuesto = 500;
        final double impuesto25 = 0.25;
        final double impuesto45 = 0.45;
        double salario_neto;
        double tramo2;
        double tramo3;

        System.out.println("salario bruto: "+ df.format(salario_bruto)+" €");

        if (impuestos > 500){
            impuestos = salario_bruto - libre_impuesto;
            if (impuestos > 400){
                tramo2 = 400 * impuesto25;
                impuestos = salario_bruto - 400;
                tramo3 = impuestos * impuesto45;
                salario_neto =  salario_bruto - tramo2 - tramo3;
                System.out.println("Salario neto: " + df.format(salario_neto)+" €");
            }
        }
    }
}
