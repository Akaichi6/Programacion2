package tema_5.parte_1.Extras.agente;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] preguntas = {
                "¿Qué palabra clave declara una clase en Java?",
                "¿Qué método inicia normalmente un programa Java?",
                "¿Qué tipo almacena valores verdadero o falso?",
                "¿Qué símbolo termina habitualmente una instrucción Java?",
                "¿Qué estructura permite repetir instrucciones mientras se cumpla una condición?",
                "¿Qué operador obtiene el resto de una división?",
                "¿Qué tipo se usa normalmente para números decimales?",
                "¿Qué palabra clave crea un objeto?",
                "¿Qué estructura permite elegir entre varios casos?",
                "¿Qué método de Scanner lee una línea completa?"
        };
        String[] respuestas = {"class", "main", "boolean", ";", "while", "%", "double", "new", "switch", "nextLine"};

        int puntuacion = 0;
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("\n" + (i + 1) + ". " + preguntas[i]);
            System.out.println("   a) " + opcionIncorrecta(i, 0));
            System.out.println("   b) " + respuestas[i]);
            System.out.println("   c) " + opcionIncorrecta(i, 1));
            System.out.print("Respuesta (a, b o c): ");
            String respuesta = sc.nextLine().trim();

            if (respuesta.equalsIgnoreCase("b")) {
                puntuacion++;
            }
        }

        System.out.println("\nHas obtenido " + puntuacion + " de 10 puntos.");
    }

    private static String opcionIncorrecta(int pregunta, int opcion) {
        String[][] incorrectas = {
                {"method", "define"}, {"start", "run"}, {"int", "char"}, {":", "."},
                {"if", "case"}, {"/", "*"}, {"float", "decimal"}, {"create", "object"},
                {"for", "choose"}, {"readLine", "next"}
        };
        return incorrectas[pregunta][opcion];
    }
}
