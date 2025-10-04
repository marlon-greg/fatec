/**
 * Classe concreta que representa uma Melancia. Ela herda de Fruta.
 */
public class Melancia extends Fruta {

    /**
     * Implementação específica do método descascar para a Melancia.
     * POLIMORFISMO: O mesmo método 'descascar' tem um comportamento diferente na classe Melancia.
     */
    @Override
    public void descascar() {
        System.out.println("Cortando a Melancia em fatias...");
    }
}
