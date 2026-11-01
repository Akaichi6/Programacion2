package tema_4.ejercicios_extra;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        String precio_s = sc.nextLine().trim().replace(",",".");
        double basse_imponible = Double.parseDouble(precio_s);

        //calcular iva y precio final
        double iva =(( basse_imponible * 21)/100);
        double precio_final = basse_imponible + iva;
        
        //inicializamos decimal format
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String euro = "€";

        //imprimir con el decimalformat
        System.out.printf("Base imponible: %s \n",df.format(basse_imponible));
        System.out.println("Base imponible:" + basse_imponible);
        System.out.printf("IVA (21%%): %s %n", df.format(iva),euro);
        System.out.printf("Precio final: %s €%n", df.format(precio_final));
    }    
}