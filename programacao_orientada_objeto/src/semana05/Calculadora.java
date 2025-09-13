
public class Calculadora {

    // Escopo de instância 
    // Método criado primeiro
    public void somar(float a, float b) {
        System.out.println("A soma de " + a + " + " + b + " = " + (a + b));
    }

    //no mesmo método, mas com tipos diferentes (assinaturas)
    public void somar(int a, int b) {
        System.out.println("A soma de " + a + " + " + b + " = " + (a + b));
    }

    // mesmo método, mas com tipos diferentes (assinaturas)
    public void somar(double a, double b) {
        System.out.println("A soma de " + a + " + " + b + " = " + (a + b));
    }

    // mesmo método, mas com tipos diferentes (assinaturas)
    public void somar(int a, int b, int c) {
        System.out.println("A soma de " + a + " + " + b + " = " + (a + b));
    }

    // mesmo método, mas com tipos diferentes (assinaturas)
    public void somar(int a, int b, String c) {
        System.out.println("A soma de " + a + " + " + b + " = " + (a + b));
    }

    //Escopo de classe
    public static void multiplicar(float a, float b) {

    }

}
