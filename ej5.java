package tema_4;

public class ej5 {
    public static void main(String[] args) {
        int cont = 0;
        int limite = 0;
        boolean b1 = (cont == 0) && (limite < 20);
        boolean b2 = (limite >= 20) || (cont < 5);
        boolean b3 = ((limite / (cont - 10)) > 7) || (limite < 20);
        boolean b4 = (limite <= 20) || ((limite / (cont - 10)) > 7);
        boolean b5 = ((limite / (cont - 10)) > 7) && (limite < 0);
        boolean b6 = (limite < 0) && ((limite / (cont - 10)) > 7);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
    }
}
