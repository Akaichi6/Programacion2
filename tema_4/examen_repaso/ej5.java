package tema_4.examen_repaso;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las entradas vendidas este mes:");
        int entradas_vendidas = sc.nextInt();

        final int aforo_total = 450;
        final double porcentaje_total = 100;
        double porcentaje_vendidas = (entradas_vendidas * porcentaje_total)/aforo_total;
        double porcentaje_restantes = porcentaje_total - porcentaje_vendidas;
        System.out.printf("Porcentaje de vendidas: %.2f %% \n",porcentaje_vendidas);
        System.out.printf("Porcentaje de entradas no vendidas: %.2f %%\n",porcentaje_restantes);
        
        sc.close();
    }
    

}
