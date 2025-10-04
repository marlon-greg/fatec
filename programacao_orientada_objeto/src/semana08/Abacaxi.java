/**
 * Classe concreta que representa um Abacaxi. Ela herda de Fruta.
 */
public class Abacaxi extends Fruta {

    /**
     * Implementação específica do método descascar para o Abacaxi.
     * POLIMORFISMO: O mesmo método 'descascar' tem um comportamento diferente na classe Abacaxi.
     */
    @Override
    public void descascar() {
        System.out.println("Descascando o Abacaxi com cuidado para não se espetar...");
    }

}
