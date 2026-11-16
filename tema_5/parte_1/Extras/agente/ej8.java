package tema_5.parte_1.Extras.agente;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el día de nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes de nacimiento (1-12): ");
        int mes = sc.nextInt();

        int[] diasPorMes = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes < 1 || mes > 12 || dia < 1 || dia > diasPorMes[mes - 1]) {
            System.out.println("La fecha introducida no es válida.");
            return;
        }

        String horoscopo;
        switch (mes) {
            case 1:
                horoscopo = dia <= 20 ? "Capricornio" : "Acuario";
                break;
            case 2:
                horoscopo = dia <= 19 ? "Acuario" : "Piscis";
                break;
            case 3:
                horoscopo = dia <= 20 ? "Piscis" : "Aries";
                break;
            case 4:
                horoscopo = dia <= 20 ? "Aries" : "Tauro";
                break;
            case 5:
                horoscopo = dia <= 21 ? "Tauro" : "Géminis";
                break;
            case 6:
                horoscopo = dia <= 21 ? "Géminis" : "Cáncer";
                break;
            case 7:
                horoscopo = dia <= 22 ? "Cáncer" : "Leo";
                break;
            case 8:
                horoscopo = dia <= 23 ? "Leo" : "Virgo";
                break;
            case 9:
                horoscopo = dia <= 23 ? "Virgo" : "Libra";
                break;
            case 10:
                horoscopo = dia <= 23 ? "Libra" : "Escorpio";
                break;
            case 11:
                horoscopo = dia <= 22 ? "Escorpio" : "Sagitario";
                break;
            default:
                horoscopo = dia <= 21 ? "Sagitario" : "Capricornio";
        }

        System.out.println("Tu horóscopo es " + horoscopo + ".");
    }
}
