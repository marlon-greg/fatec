
/**
 * Classe que demonstra o polimorfismo em ação.
 * Ela possui um método que pode trabalhar com qualquer tipo de Fruta.
 */
public class Descascador {

    /**
     * Este é o método chave para entender o polimorfismo.
     * Ele recebe um objeto do tipo Fruta. Pode ser uma Banana, um Abacaxi,
     * ou qualquer outra classe que herde de Fruta.
     * O método não precisa saber qual é a fruta específica.
     * @param fruta O objeto de fruta a ser descascado.
     */
    public static void run(Fruta fruta) {
        // POLIMORFISMO EM AÇÃO:
        // A JVM (Máquina Virtual Java) sabe qual é a classe real do objeto (Banana, Abacaxi, etc.)
        // e chama a versão CORRETA do método descascar() que foi sobrescrito na classe específica.
        // Isso é chamado de "ligação tardia" ou "dynamic binding".
        fruta.descascar();
    }

    /**
     * Método principal para executar a demonstração.
     */
    public static void main(String[] args) {
        // Cria instâncias de cada fruta específica.
        Banana banana = new Banana();
        Abacaxi abacaxi = new Abacaxi();
        Melancia melancia = new Melancia();

        System.out.println("--- Usando o Descascador Polimórfico ---");

        // Passa cada objeto para o método run. 
        // Note que o mesmo método 'run' se comporta de maneira diferente
        // dependendo do objeto que ele recebe.
        run(banana);   // Executará o descascar() da classe Banana
        run(abacaxi);  // Executará o descascar() da classe Abacaxi
        run(melancia); // Executará o descascar() da classe Melancia

        Fruta bFruta = new Banana();
        run(bFruta);

        Fruta abacaxiReal = new AbacaxiReal();
        run(abacaxiReal);

        

    }
}
