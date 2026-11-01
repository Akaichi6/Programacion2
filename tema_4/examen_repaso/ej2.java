package tema_4.examen_repaso;

public class ej2 {
    public static void main(String[] args) {
        String asterisco = "*";
        String porcentage = "%";
        System.out.printf("%12s\n%8s\n%6s %-8s %s %11S %12s\n%8s\n%12s\n",porcentage,porcentage,porcentage,asterisco,asterisco,asterisco,asterisco,porcentage,porcentage);
        System.out.printf("       %%\n" +
                          "     %%\n" +
                          "   %%  *  *  *  *  *  *  *\n" + 
                          "      %%\n" +
                          "         %%\n" );
    }
}
