package tema_5.parte_2.ejercicios_A;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite_inferior = 1;
        int limite_superior = 100;
        System.out.println("piense un numero del 1-100");
        System.out.println("Lo tienes??");
        System.out.println("Bien, podemos comenzar.");
        while (true) {
            System.out.println("Tu número es menor, igual o superior a " + limite_superior+"?");
            String opcion = sc.nextLine();
            if (opcion.equals("<")) {

            }else if (opcion.equals(">")) {

            }else if (opcion.equals("=")) {

            }


        }



    }
}
