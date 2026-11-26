package tema_5.parte_2.ejercicios_A;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroPensado;
        System.out.println("=== JUEGO DE ADIVINAR EL NÚMERO ===");
        System.out.println("Piensa un número entero del 1 al 100 en tu cabeza.");
        System.out.println("El ordenador intentará adivinarlo paso a paso.\n");
        int limiteInferior = 1;
        int limiteSuperior = 100;
        char respuesta;
        int intentos = 0;

        System.out.println("\n--- ¡Empieza el juego! ---");

        do {
            int propuesta = (limiteInferior + limiteSuperior) / 2;
            intentos++;

            System.out.println("\n¿Tu número es el " + propuesta + "?");
            System.out.print("Responde si tu número es mayor (>), menor (<) o igual (=): ");
            respuesta = sc.next().charAt(0);

            if (respuesta == '>') {
                limiteInferior = propuesta + 1;
            } else if (respuesta == '<') {
                limiteSuperior = propuesta - 1;
            } else if (respuesta == '=') {
                System.out.println("\n¡El ordenador acertó el número " + propuesta + " en " + intentos + " intentos!");
            } else {
                System.out.println("Respuesta no válida. Por favor, introduce '>', '<' o '='.");
                intentos--;
            }

        } while (respuesta != '=');
        }



    }

