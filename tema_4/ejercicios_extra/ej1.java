package tema_4.ejercicios_Refuerzo_extra;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cantidad de segundos: ");
        int segundos = sc.nextInt();
        // dias
        int dias_segundos = 86400;
        int dias = segundos/dias_segundos;
        int dias_resto = segundos % dias_segundos;
        // horas
        int horas_segundos = 3600 ;
        int horas = dias_resto/horas_segundos;
        int horas_resto = dias_resto % horas_segundos;
        // minutos
        int minutos_segundos = 60;
        int minutos = horas_resto/minutos_segundos;
        int minutos_resto = minutos % minutos_segundos;
        //segundos
        int segundos_segundos = 60;
        int segundos_final = horas_resto % minutos_segundos;

        System.out.printf("Equivale a: %d dia(s), %d hora(s), %d minutos(s) y %d segundo(s) ", dias, horas, minutos,segundos_final);

    }
}
