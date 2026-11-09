package tema_5.parte_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class eje17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int hora, minuto, segundo;
        System.out.print("Entrada: ");
        hora = input.nextInt();System.out.print(":");minuto=input.nextInt();System.out.print(":");segundo=input.nextInt();

        if (segundo<60 && minuto<60 && hora<24){
            segundo++;
            System.out.println("salida: "+df.format(hora)+":"+df.format(minuto)+":"+df.format(segundo));
        } else if (segundo>59 && minuto>59 && hora<24) {
            minuto++;
            segundo = 0;
            System.out.println("salida: "+df.format(hora)+":"+df.format(minuto)+":"+df.format(segundo));
        }else if (segundo>59 && minuto>59 && hora>23) {
            minuto=0;
            segundo=0;
            hora++;
            System.out.println("salida: "+df.format(hora)+":"+df.format(minuto)+":"+df.format(segundo));
        }
    }
}
