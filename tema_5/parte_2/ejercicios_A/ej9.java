package tema_5.parte_2.ejercicios_A;

import java.text.DecimalFormat;

public class ej9 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###");
    int suma = 0;
    int producto = 1;
        for (int i = 1; i <= 10; i++) {
            suma += i;
            producto *= i;
            System.out.println("Suma: " + suma );
            System.out.println("Producto: " + df.format(producto));
        }
    }
}
