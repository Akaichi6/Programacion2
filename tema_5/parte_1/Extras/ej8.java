package tema_5.parte_1.Extras;

import java.util.Arrays;
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String CANCER="CANCER";
        System.out.print("Introduce tu fecha de nacimiento (solo en este formato: dia/mes): ");
        String fecha = sc.nextLine();
        String dia = fecha.substring(0, 2);
        String mes = fecha.substring(3, 5);
        Integer dia_int = Integer.parseInt(dia);
        Integer mes_int = Integer.parseInt(mes);
        if (mes_int == 1 || mes_int == 2){
            if(mes_int == 1){
                if(dia_int >= 20 && dia_int <= 31 ){
                    System.out.println("Tu horoscopo es: ");
                }
            }
        }
    }
}
