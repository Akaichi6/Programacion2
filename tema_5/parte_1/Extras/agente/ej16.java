package tema_5.parte_1.Extras.agente;

import java.util.Locale;
import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Categoría: junior, senior o jefe de proyecto");
        System.out.print("Introduce la categoría del empleado: ");
        String categoria = sc.nextLine().trim().toLowerCase(Locale.ROOT);

        double sueldoBase;
        switch (categoria) {
            case "junior":
            case "programador junior":
                sueldoBase = 950;
                break;
            case "senior":
            case "programador senior":
                sueldoBase = 1200;
                break;
            case "jefe de proyecto":
                sueldoBase = 1600;
                break;
            default:
                System.out.println("La categoría introducida no es válida.");
                return;
        }

        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int diasVisita = sc.nextInt();
        if (diasVisita < 0) {
            System.out.println("Los días no pueden ser negativos.");
            return;
        }

        System.out.print("Estado civil (soltero/a o casado/a): ");
        String estadoCivil = sc.next().trim().toLowerCase(Locale.ROOT);
        double retencion;
        if (estadoCivil.equals("soltero") || estadoCivil.equals("soltera")
                || estadoCivil.equals("soltero/a")) {
            retencion = 0.25;
        } else if (estadoCivil.equals("casado") || estadoCivil.equals("casada")
                || estadoCivil.equals("casado/a")) {
            retencion = 0.20;
        } else {
            System.out.println("El estado civil introducido no es válido.");
            return;
        }

        double dietas = diasVisita * 30;
        double sueldoNeto = sueldoBase * (1 - retencion) + dietas;
        System.out.printf(Locale.US, "Sueldo base: %.2f euros.%n", sueldoBase);
        System.out.printf(Locale.US, "Dietas: %.2f euros.%n", dietas);
        System.out.printf(Locale.US, "Sueldo neto: %.2f euros.%n", sueldoNeto);
    }
}
