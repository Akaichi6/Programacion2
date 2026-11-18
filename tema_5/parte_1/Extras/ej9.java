package tema_5.parte_1.Extras;

import java.util.Scanner;

public class ej9 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        final int SEG_DIA=86400, SEG_HORA=3600, SEG_MIN=60;
        System.out.print("Introduce la hora y los minutos (hora:minutos): ");
        String tiempo = sc.nextLine();
        String hora_st= tiempo.substring(0,2);
        String minuto_st =tiempo.substring(4,5);
        int hora_int = Integer.parseInt(hora_st);
        int minuto_int=Integer.parseInt(minuto_st);
        if (hora_int > 0 && hora_int<=24) {
            if (minuto_int>0 && minuto_int<=60){
                int seg_hora_calculado = hora_int * SEG_HORA;
                int seg_min_calculado= minuto_int * SEG_MIN;
                int seg_totales = seg_hora_calculado + seg_min_calculado;
                int resultado = SEG_DIA-seg_totales;
                System.out.println("Los segundos que faltan para llegar a media noche son: "+resultado);
            }else{
                System.out.println("Los minutos introducidos son negativos y el tiempo no pueden ser negativos");
            }
        } else {
            System.out.println("Las horas introducudas son negativas y el tiempo no puede ser negativo.");
        }

    }
}
