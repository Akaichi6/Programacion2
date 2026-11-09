package tema_5.parte_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ej16{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce tu nota: ");
        double nota = input.nextDouble();

        for (;nota<0 || nota>10;){
            System.out.println("La nota no puede ser negativa ni superior a 10.");
            System.out.println("Introduce tu nota de nuevo: ");
            nota = input.nextDouble();
        }
        if (nota >=0 && nota<3){
            System.out.println("Muy deficiente");
        }else if (nota >=3 && nota<5){
            System.out.println("Insuficiente");
        }else if (nota >=5 && nota<6){
            System.out.println("Bien");
        }else if (nota >=6 && nota<9){
            System.out.println("Notable");
        }else if (nota >=9 && nota<10){
            System.out.println("sobresaliente");
        }

    }
}
