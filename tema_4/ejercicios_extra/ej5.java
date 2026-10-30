package tema_4.ejercicios_extra;

public class ej5 {
    public static void main(String[] arg) {
        String HORA = "HORA";
        String LUNES = "LUNES";
        String MARTES = "MARTES";
        String MIERCOLES = "MIERCOLES";
        String JUEVES = "JUEVES";
        String VIERNES = "VIERNES";
        String PRIMERA = "08:00-09:00";
        String SEGUNDA = "09:00-10:00";
        String TERCERA = "10:00-11:00";
        String CUARTA = "11:30-12:30";
        String PROG = "PROG";
        String SSII = "SSII";
        String BBDD = "BBDD";
        String EDE = "EDE";
        String ING = "ING";
        String LMSGI = "LMSGI";
        System.out.printf("| %-14s| %-10s| %-10s| %-10s| %-10S| %-10s|\n", "HORA", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES");
        System.out.printf("--------------------------------------------------------------------\n");
        System.out.printf("| %-14s| %-10s| %-10s| %-10s| %-10S| %-10s|\n",PRIMERA,PROG,EDE,BBDD,EDE,LMSGI);
        System.out.printf("| %-14s| %-10s| %-10s| %-10s| %-10S| %-10s|\n",SEGUNDA,PROG,PROG,BBDD,BBDD,LMSGI);
        System.out.printf("| %-14s| %-10s| %-10s| %-10s| %-10S| %-10s|\n",TERCERA,SSII,SSII,PROG,PROG,PROG);
        System.out.printf("| %-14s| %-10s| %-10s| %-10s| %-10S| %-10s|\n",CUARTA,BBDD,ING,SSII,ING,PROG);
    }
}
