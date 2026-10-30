package tema_4.ejercicios_extra;

public class ej5 {
    public static void main(String[] arg){
        //encabezado
        final String HORA = "HORA";
        final String LUNES = "LUNES";
        final String MARTES = "MARTES";
        final String MIERCOLES = "MIERCOLES";
        final String JUEVES = "JUEVES";
        final String VIERNES = "VIERNES";
        //horas
        final String PRIMERA = "08:00-09:00"; 
        final String SEGUNDA= "09:00-10:00";
        final String TERCERA = "10:00-11:00";
        final String CUARTA = "11:30-12:30";

        final String PROG = "PROG", SSII = "SSII", BBDD = "BBDD", EDE = "EDE", ING = "ING", LMSGI="LMSGI";

        System.out.printf("| %-14s| %-10s| %-10s| %-10s| %-10S| %-10s|\n",HORA,LUNES,MARTES,MIERCOLES,JUEVES,VIERNES);
        System.out.printf("--------------------------------------------------------------------\n");
        System.out.printf("| %-14s| %-10s| %-10s| %-10s| %-10S| %-10s|\n",PRIMERA,PROG,EDE,BBDD,EDE,LMSGI);
        System.out.printf("| %-14s| %-10s| %-10s| %-10s| %-10S| %-10s|\n",SEGUNDA,PROG,PROG,BBDD,BBDD,LMSGI);
        System.out.printf("| %-14s| %-10s| %-10s| %-10s| %-10S| %-10s|\n",TERCERA,SSII,SSII,PROG,PROG,PROG);
        System.out.printf("| %-14s| %-10s| %-10s| %-10s| %-10S| %-10s|\n",CUARTA,BBDD,ING,SSII,ING,PROG);


    }
    
}
