package tema_5.parte_1.Extras;

import java.util.Scanner;

public class ej3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=200;

            while (numero > 7 || numero < 1){
                System.out.print("Introduce un número del 1-7 (sino no podras continuar) para saber que dia de la semana es cada uno:");
                numero = sc.nextInt();
            }
            switch (numero){
                case 1:
                    System.out.println("El numero seleccionado es:"+numero +" y a ese dia pertenece el Lunes");
                    break;
                case 2:
                    System.out.println("El numero seleccionado es:"+numero +" y a ese dia pertenece el Martes");
                    break;
                case 3:
                    System.out.println("El numero seleccionado es:"+numero +" y a ese dia pertenece el Miercoles");
                    break;
                case 4:
                    System.out.println("El numero seleccionado es:"+numero +" y a ese dia pertenece el Jueves");
                    break;
                case 5:
                    System.out.println("El numero seleccionado es:"+numero +" y a ese dia pertenece el Viernes");
                    break;
                case 6:
                    System.out.println("El numero seleccionado es:"+numero +" y a ese dia pertenece el Sabado");
                    break;
                case 7:
                    System.out.println("El numero seleccionado es:"+numero +" y a ese dia pertenece el Domingo");
                    break;
            }
    }
}
