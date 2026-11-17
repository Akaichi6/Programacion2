package tema_5.parte_1.Extras;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        final double g =9.81;
        System.out.print("Introduce la altura (en m): ");
        double altura = sc.nextDouble();
        if (altura >= 0){
            //operación
            double t =Math.sqrt((2*altura)/g);
            //salida
            System.out.println("El tiempo que tarda en caer el objeto del la altura de "+altura+ " m es: "+df.format(t)+" s");
        }else {
            System.out.println("La altura no puede ser negativa.");
        }
    }
}
