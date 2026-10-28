package tema_4.ejercicios_Normales;
import java.util.Scanner;
public class ej6 {
    public static void main(String[] args) {
        System.out.print("Introduce el tamaño del lado del teclado: ");
        int lado = new Scanner(System.in).nextInt();
        int area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }
}
