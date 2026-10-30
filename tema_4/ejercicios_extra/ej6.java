package tema_4.ejercicios_extra;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ej6 {
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número decimal:");
    String n1_String = sc.nextLine().trim().replace(',','.');
    double n1_decimal = Double.parseDouble(n1_String) ;
    
    int parte_entera = (int)n1_decimal;
    double parte_decimal = n1_decimal - parte_entera;
    int separacion_1 = parte_entera / 100;
    int separacion_2 = (parte_entera/10) % 10;
    int separacion_3 = parte_entera % 10;
    int suma = separacion_1 + separacion_2 + separacion_3;
    System.out.println("Parte entera: "+ parte_entera); 
    System.out.printf("parte dcimal: %.3f\n",parte_decimal);
    System.out.println(separacion_1);
    System.out.println(separacion_2);
    System.out.println(separacion_3);
    System.out.println("Suma de dígitos de la parte entera:" + suma);
  }
}
