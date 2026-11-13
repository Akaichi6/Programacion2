package tema_5.parte_1.Normales;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clave = "the best";
        System.out.print("Introduce la contraseña: ");
        String contrasenia = sc.nextLine().trim().toLowerCase();

        if (contrasenia.equals(clave)){
            System.out.println("La contraseña coincide");
        }else {
            System.out.println("La contraseña no coincide");
        }

    }
}
