/**
 * Classe concreta que representa um Gato, herdando de Animal.
 */
public class Gato extends Animal {

    /**
     * Implementação específica do método comer para o Gato.
     * POLIMORFISMO: O método 'comer' da superclasse Animal é sobrescrito
     * para ter um comportamento específico para o Gato.
     */
    @Override
    public void comer() {
        System.out.println("Gato comendo ração de peixe.");
    }

    /**
     * Implementação específica do método beber para o Gato.
     * POLIMORFISMO: O método 'beber' da superclasse Animal é sobrescrito
     * para ter um comportamento específico para o Gato.
     */
    @Override
    public void beber() {
        System.out.println("Gato bebendo leite.");
    }

}
