package src.semana03;

public class String07 {

    public static void main(String[] args) {

        String ra0 = "123456789";
        String ra1 = "123456789  ";
        String ra2 = "  123456789  ";
        System.out.println(ra0.length());
        System.out.println(ra1.length());
        System.out.println(ra2.length());

        String ra3 = "123456789   ".trim();
        String ra4 = "  123456789   ".trim();
        System.out.println(ra3.length());
        System.out.println(ra4.length());
    }

}
