package tema_5.parte_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int hora = 0, minuto = 0, segundo = 0;
        System.out.print("Entrada: ");
        String entrada = input.nextLine().trim();
        String[] partes = entrada.split(":");
        hora = Integer.parseInt(partes[0]);
        minuto = Integer.parseInt(partes[1]);
        segundo = Integer.parseInt(partes[2]);

        if (segundo==59 && minuto==59){
            segundo=0;
            if (minuto==59) {
                minuto = 0;
                segundo = 0;
                hora++;
                if (hora==24) {
                    hora=0;
                }
            }
            System.out.println("salida: "+df.format(hora)+":"+df.format(minuto)+":"+df.format(segundo));
        } else if (segundo<59) {
            segundo++;
            System.out.println("salida: "+df.format(hora)+":"+df.format(minuto)+":"+df.format(segundo));
        } else if (minuto<59) {
            minuto++;
            segundo=0;
            System.out.println("salida: "+df.format(hora)+":"+df.format(minuto)+":"+df.format(segundo));
        }else {
            minuto=0;
            segundo=0;
            hora++;
            System.out.println("salida: "+df.format(hora)+":"+df.format(minuto)+":"+df.format(segundo));
        }
    }
}
