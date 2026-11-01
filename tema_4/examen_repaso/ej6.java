package tema_4.examen_repaso;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        final double P_HORA_NORMAL = 12.5 , P_HORA_EXTRA = 22.5, IRPF = 0.185, IRPF_TEXTO=18.5;
        
        //Introducción datos
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa las horas ordinarias trabajadas: ");
        double horas_trabajadas = sc.nextDouble();
        System.out.print("Ingresa las horas extras realizadas: ");
        double horas_extra = sc.nextDouble();

        //operaciones
        double dinero_h_normales = horas_trabajadas * P_HORA_NORMAL;
        double dinero_h_extras =  horas_extra * P_HORA_EXTRA;
        double salario_bruto = dinero_h_extras + dinero_h_normales;
        double dinero_retenido = salario_bruto*IRPF;
        double salario_neto = salario_bruto - dinero_retenido;

        //nomina impresa
        
        System.out.println("------------------------------");
        System.out.println("Nómina de: " + nombre);
        System.out.println("------------------------------");
        System.out.printf("Importe bruto: %,.2f \nRetención (%.2f): %.2f \nImporte Neto: %.2f\n",salario_bruto,IRPF_TEXTO,dinero_retenido,salario_neto);

        sc.close();
    }
}
