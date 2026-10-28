package tema_4.ejercicios_Normales;

public class ej1 {
    public static <String> void main(String[] args) {
        int DIAS = 365;
        int HORAS = 24;
        int MIN = 60;
        int SEG = 60;

        int horas_anu = HORAS * DIAS;
        int minuto_anu = horas_anu * MIN;
        int seg_anu = minuto_anu * SEG;

        System.out.println("El año tiene: " + horas_anu + " horas " + minuto_anu + " minutos " + seg_anu + " segundos");

    }
}
