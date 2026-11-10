package tema_5.parte_1;

import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("¡Bienvenido a la pizzeria BELLA NAPOLI!\nTipos de pizza:\n\t1 - Vegetariana\n\t2 - No vegetariana");
        System.out.print("Introduce el número correspondiente al tipo de pizza que quieres:");
        int tipoPizza = input.nextInt();
            if (tipoPizza==1) {
                System.out.print("\t- Has elegido la pizza vegetariana con tomate y mozzarella");
            }
            if (tipoPizza==2){
                System.out.println("Ingredientes de pizzas no vegetarianas:\n\t1- Peperoni\n\t2- Jamón\n\t3- Salmón");
                System.out.print("Introduce el ingrediente que deseas:");
                int ingrediente = input.nextInt();

                switch (ingrediente) {
                    case 1:
                        System.out.println("\t- Has elegido la pizza no vegetariana con tomate, mozzarella y Peperoni");
                        break;
                    case 2:
                        System.out.println("\t- Has elegido la pizza no vegetariana con tomate, mozzarella y Jamón");
                        break;
                    case 3:
                        System.out.println("\t- Has elegido la pizza no vegetariana con tomate, mozzarella y Salmón");
                        break;

                }
            }



    }
}
