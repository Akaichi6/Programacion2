package tema_5.parte_1.Extras.agente;

import java.util.Locale;
import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduce la base imponible: ");
        double base = sc.nextDouble();
        if (base < 0) {
            System.out.println("La base imponible no puede ser negativa.");
            return;
        }

        System.out.print("Tipo de IVA (general, reducido o superReducido): ");
        String tipoIva = sc.next().toLowerCase(Locale.ROOT);
        double iva;
        switch (tipoIva) {
            case "general":
                iva = 0.21;
                break;
            case "reducido":
                iva = 0.10;
                break;
            case "superreducido":
                iva = 0.04;
                break;
            default:
                System.out.println("El tipo de IVA no es válido.");
                return;
        }

        System.out.print("Código promocional (nopromo, promo50por, promo5eur o promo5por): ");
        String promocion = sc.next().toLowerCase(Locale.ROOT);
        double precioFinal = base * (1 + iva);
        switch (promocion) {
            case "nopromo":
                break;
            case "promo50por":
                precioFinal *= 0.50;
                break;
            case "promo5eur":
                precioFinal = Math.max(0, precioFinal - 5);
                break;
            case "promo5por":
                precioFinal *= 0.95;
                break;
            default:
                System.out.println("El código promocional no es válido.");
                return;
        }

        System.out.printf(Locale.US, "El precio final es %.2f euros.%n", precioFinal);
    }
}
