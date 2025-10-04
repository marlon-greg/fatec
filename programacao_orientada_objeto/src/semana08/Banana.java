/**
 * Classe concreta que representa uma Banana. Ela herda de Fruta.
 * Esta classe demonstra o polimorfismo ao fornecer sua própria versão do método descascar.
 */
public class Banana extends Fruta {

    /**
     * Implementação específica do método descascar para a Banana.
     * A anotação @Override (opcional aqui, mas boa prática) indica que estamos
     * sobrescrevendo o método da superclasse Fruta.
     * POLIMORFISMO: O mesmo método 'descascar' tem um comportamento diferente na classe Banana.
     */
    @Override
    public void descascar() {
        System.out.println("Descascando a Banana...");
    }
}
