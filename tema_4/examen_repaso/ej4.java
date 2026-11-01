package tema_4.examen_repaso;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota de prácticas: ");
        double practicas = sc.nextDouble();
        System.out.print("Introduce la nota de la teoría: ");
        double teoria = sc.nextDouble();
        System.out.print("Introduce la nota de la participación: ");
        double participacion = sc.nextDouble();

        // ponderaciones
        final double pond_practicas = 0.25;
        final double pond_teoria= 0.7;
        final double pond_participacion=0.05;
        //calculo nota ponderada
        double nota = (practicas * pond_practicas) + (teoria * pond_teoria) + (practicas * pond_participacion);
        //salida nota
        System.out.printf("La nota de practicas es: %.2f\n",practicas);
        System.out.printf("La nota de la teoria es: %.2f\n",teoria);
        System.out.printf("La nota de la participacion es: %.2f\n",participacion);
        System.out.printf("La nota final es: %.2f",nota);

        sc.close();

    }
}
