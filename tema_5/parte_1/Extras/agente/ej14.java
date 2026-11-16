package tema_5.parte_1.Extras.agente;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un carácter de relleno: ");
        String entrada = sc.nextLine();
        if (entrada.isEmpty()) {
            System.out.println("Debes introducir un carácter.");
            return;
        }
        char relleno = entrada.charAt(0);

        System.out.println("1. Con el vértice hacia arriba");
        System.out.println("2. Con el vértice hacia abajo");
        System.out.println("3. Con el vértice hacia la izquierda");
        System.out.println("4. Con el vértice hacia la derecha");
        System.out.print("Elige un tipo de pirámide: ");
        int orientacion = Integer.parseInt(sc.nextLine().trim());

        if (orientacion < 1 || orientacion > 4) {
            System.out.println("La opción debe estar entre 1 y 4.");
            return;
        }

        for (int fila = 0; fila < 5; fila++) {
            int nivel = fila < 3 ? fila : 4 - fila;
            if (orientacion == 1 || orientacion == 2) {
                int espacios = orientacion == 1 ? 2 - nivel : nivel;
                int caracteres = 2 * nivel + 1;
                imprimirEspacios(espacios);
                imprimirCaracteres(relleno, caracteres);
            } else {
                int caracteres = orientacion == 3 ? 3 - nivel : nivel + 1;
                if (orientacion == 3) {
                    imprimirEspacios(3 - caracteres);
                }
                imprimirCaracteres(relleno, caracteres);
            }
            System.out.println();
        }
    }

    private static void imprimirEspacios(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print("  ");
        }
    }

    private static void imprimirCaracteres(char relleno, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print(relleno);
            if (i < cantidad - 1) {
                System.out.print(" ");
            }
        }
    }
}
