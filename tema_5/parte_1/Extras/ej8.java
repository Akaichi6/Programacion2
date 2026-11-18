package tema_5.parte_1.Extras;

import java.util.Arrays;
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String CANCER="CANCER", ARIES="ARIES",SAGITARIO="SAGITARIO", CAPRICORNIO="CAPRICORNIO", LIBRA="LIBRA", LEO="LEO", GEMINIS="GEMINIS", TAURO="TAURO",VIRGO="VIRGO", ESCORPIO="ESCORPIO",ACUARIO="ACUARIO", PISCIS="PISCIS";
        System.out.print("Introduce tu fecha de nacimiento (solo en este formato: dia/mes): ");
        String fecha = sc.nextLine();
        String dia = fecha.substring(0, 2);
        String mes = fecha.substring(3, 5);
        int dia_int = Integer.parseInt(dia);
        int mes_int = Integer.parseInt(mes);
        if (mes_int == 1){
            if (dia_int >= 1 && dia_int<= 19){
                System.out.println("Tu horóscopo es: "+ CAPRICORNIO);
            }else if (dia_int >= 20 && dia_int<= 31){
                System.out.println("Tu horóscopo es: "+ ACUARIO);
            }
        } if (mes_int == 2){
            if (dia_int >= 1 && dia_int<= 18){
                System.out.println("Tu horóscopo es: "+ ACUARIO);
            }else if (dia_int >= 19 && dia_int<= 28){
                System.out.println("Tu horóscopo es: "+ PISCIS);
            }
        } else if (mes_int == 3 ){
            if (dia_int >= 1 && dia_int<= 20){
                System.out.println("Tu horóscopo es: "+ PISCIS);
            }else if (dia_int >= 21 && dia_int<= 31){
                System.out.println("Tu horóscopo es: "+ ARIES);
            }
        }else if (mes_int == 4 ) {
            if (dia_int >= 1 && dia_int <= 19) {
                System.out.println("Tu horóscopo es: " + ARIES);
            } else if (dia_int >= 20 && dia_int <= 30) {
                System.out.println("Tu horóscopo es: " + TAURO);
            }
        }else if (mes_int == 5 ) {
            if (dia_int >= 1 && dia_int <= 20) {
                System.out.println("Tu horóscopo es: " + ARIES);
            } else if (dia_int >= 21 && dia_int <= 31) {
                System.out.println("Tu horóscopo es: " + GEMINIS);
            }
        }else if (mes_int == 6 ) {
            if (dia_int >= 1 && dia_int <= 20) {
                System.out.println("Tu horóscopo es: " + GEMINIS);
            } else if (dia_int >= 21 && dia_int <= 30) {
                System.out.println("Tu horóscopo es: " + CANCER);
            }
        }else if (mes_int == 7 ) {
            if (dia_int >= 1 && dia_int <= 22) {
                System.out.println("Tu horóscopo es: " + CANCER);
            } else if (dia_int >= 23 && dia_int <= 31) {
                System.out.println("Tu horóscopo es: " + LEO);
            }
        }else if (mes_int == 8 ) {
            if (dia_int >= 1 && dia_int <= 22) {
                System.out.println("Tu horóscopo es: " + LEO);
            } else if (dia_int >= 23 && dia_int <= 31) {
                System.out.println("Tu horóscopo es: " + VIRGO);
            }
        }else if (mes_int == 9 ) {
            if (dia_int >= 1 && dia_int <= 22) {
                System.out.println("Tu horóscopo es: " + VIRGO);
            } else if (dia_int >= 23 && dia_int <= 31) {
                System.out.println("Tu horóscopo es: " + LIBRA);
            }
        }else if (mes_int == 10 ) {
            if (dia_int >= 1 && dia_int <= 22) {
                System.out.println("Tu horóscopo es: " + LIBRA);
            } else if (dia_int >= 23 && dia_int <= 31) {
                System.out.println("Tu horóscopo es: " + ESCORPIO);
            }
        }else if (mes_int == 11 ) {
            if (dia_int >= 1 && dia_int <= 21) {
                System.out.println("Tu horóscopo es: " + ESCORPIO);
            } else if (dia_int >= 20 && dia_int <= 30) {
                System.out.println("Tu horóscopo es: " + SAGITARIO);
            }
        }else if (mes_int == 12 ) {
            if (dia_int >= 1 && dia_int <= 21) {
                System.out.println("Tu horóscopo es: " + SAGITARIO);
            } else if (dia_int >= 22 && dia_int <= 31) {
                System.out.println("Tu horóscopo es: " + CAPRICORNIO);
            }
        }
    }
}
