
public class UsaMetodos {

    public static void main(String[] args) {
        //Calculadora.somar(10, 20);

        Calculadora calculadora = new Calculadora();
        double n1 = 10, n2 = 20;
        // Se fosse um valor por exemplo 10.7 seria necessario colocar 10.7f
        //calculadora.somar(10, 20);
        calculadora.somar((float) n1, (float) n2);

        calculadora.somar(2, 3, "valeu");

        Calculadora.multiplicar(10, 20);

    }
}
